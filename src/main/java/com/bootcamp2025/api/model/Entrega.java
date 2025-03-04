package com.bootcamp2025.api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "entregas")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
}
