package com.example.pruebaIAS.infraestructure.repository;

import com.example.pruebaIAS.infraestructure.persistense.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicalRespository extends JpaRepository<ServiceEntity, Long> {
}
