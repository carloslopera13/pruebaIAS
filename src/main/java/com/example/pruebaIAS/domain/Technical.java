package com.example.pruebaIAS.domain;

import com.example.pruebaIAS.infraestructure.persistense.entity.ServiceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Technical {

    private Long id;

    private String name;

    private List<ServiceEntity> serviceId;
}
