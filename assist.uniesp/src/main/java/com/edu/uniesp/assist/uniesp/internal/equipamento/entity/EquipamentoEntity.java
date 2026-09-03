package com.edu.uniesp.assist.uniesp.internal.equipamento.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "equipamento")
@Getter
public class EquipamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Enum tipo;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private Long numeroSerie = true;

    public EquipamentoEntity(Enum tipo, String marca, String modelo, String numeroSerie) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void ativar () {
        this.ativo = true;
    }
    public void desativar () {
        this.ativo = false;
    }
}
