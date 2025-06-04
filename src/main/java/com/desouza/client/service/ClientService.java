package com.desouza.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.desouza.client.dto.ClientDTO;
import com.desouza.client.entity.Client;
import com.desouza.client.repository.ClientRepository;
import com.desouza.client.service.exceptions.DataBaseException;
import com.desouza.client.service.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = repository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Client with ID " + id + " not found"));
        return new ClientDTO(client);
    }

    @Transactional
    public ClientDTO insert(ClientDTO dto) {
        try {
            Client entity = new Client();
            dtoToEntity(dto, entity);
            entity = repository.save(entity);
            return new ClientDTO(entity);

        } catch (DataIntegrityViolationException e) {
            throw new DataBaseException("Data integrity violation: possibly a duplicate CPF or invalid reference");
        }
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO dto) {
        try {
            Client entity = repository.getReferenceById(id);
            dtoToEntity(dto, entity);
            entity = repository.save(entity);

            // Force flush to detect constraint violations early
            repository.flush();

            return new ClientDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Client with ID " + id + " not found");
        } catch (DataIntegrityViolationException e) {
            throw new DataBaseException("Data integrity violation: possibly a duplicate CPF or invalid reference");
        }

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Client with ID " + id + " not found");
        } else {
            repository.deleteById(id);
        }
    }

    public void dtoToEntity(ClientDTO dto, Client entity) {
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }

}
