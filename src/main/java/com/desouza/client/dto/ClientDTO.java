package com.desouza.client.dto;

import java.time.LocalDate;

import com.desouza.client.entity.Client;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class ClientDTO {

    private Long id;
    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters.")
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Pattern(regexp = "\\d{11}", message = "CPF must be sequencial of 11 numeric digits. e.g. 12345678912")
    @NotBlank(message = "CPF cannot be blank")
    private String cpf;

    @PositiveOrZero(message = "Income field cannot be a negative number.")
    private Double income;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent(message = "Birth Date must be in the past o in the present. YYYY-MM-DD")
    @NotNull(message = "Birth date cannot be null")
    private LocalDate birthDate;

    @PositiveOrZero(message = "Children field cannot be a negative number.")
    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }

}
