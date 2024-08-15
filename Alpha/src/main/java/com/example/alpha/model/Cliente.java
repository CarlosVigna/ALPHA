package com.example.alpha.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.allArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tbclientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "id")


public class Cliente {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String cpf;
    private String endereco;

public Cliente (ClienteRequestDTO data){
    this.name = data.name();
    this.cpf = data.cpf();
    this.endereco = data.endereco();
}
}
