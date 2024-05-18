package com.example.pruebaIAS.infraestructure.persistense.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TechnicalDto {

    private Long id;

    @NotNull
    private String name;

    private List<ServiceDto> serviceId;
}
