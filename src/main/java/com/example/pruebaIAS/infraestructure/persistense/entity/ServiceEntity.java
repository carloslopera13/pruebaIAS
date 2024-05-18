package com.example.pruebaIAS.infraestructure.persistense.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_service")
@Builder
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String address;

    @Column(length = 100)
    private String description;


    private String timeStart;

    private String timeEnd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_service", foreignKey = @ForeignKey(name = "FK_SERVICE"))
    private TechnicalEntity technicanId;
}
