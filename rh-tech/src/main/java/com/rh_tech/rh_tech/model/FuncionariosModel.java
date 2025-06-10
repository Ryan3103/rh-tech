package com.rh_tech.rh_tech.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="funcionarios")
@Getter
@Setter

@NoArgsConstructor
public class FuncionariosModel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

@Column(nullable=false)
private String nome;

@Column(nullable=false)
private String email;

@Column(nullable=false)
private String senha;

@Column(nullable=false)
private Integer cep;

@Column(nullable=false)
private String endereco;

@Column(nullable=false)
private String numero;

@Column(nullable=false)
private String bairro;

@Column(nullable=false)
private String cidade;

@Column(nullable=false)
private String estado;
}
