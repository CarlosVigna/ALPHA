package com.example.alpha.dto;

import com.example.alpha.model.Cliente;
public record ClienteResponseDTO (Long id, String name, String cpf, String endereco){

public ClienteResponseDTO(Cliente cliente) {
    this(cliente.getId(), cliente.getName(), cliente.getCpf(), cliente.getEndereco());
}
}
