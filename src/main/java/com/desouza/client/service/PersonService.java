package com.desouza.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desouza.client.dto.PersonDepartmentDTO;
import com.desouza.client.entity.Department;
import com.desouza.client.entity.Person;
import com.desouza.client.repository.DepartmentRepository;
import com.desouza.client.repository.PersonRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Transactional
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());

        // Department dept = new Department();
        // dept.setId(dto.getDepartment().getId());
        // dept.setName(dto.getDepartment().getName());

        entity.setDepartment(dept);
        entity = personRepository.save(entity);

        return new PersonDepartmentDTO(entity);
    }

}
