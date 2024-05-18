package com.example.pruebaIAS.infraestructure.persistense.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDto {


    @NotNull
    @Size(max = 30)
    private String address;

    @Size(max = 100)
    private String description;

    @NotNull
    private String timeStart;

    @NotNull
    private String timeEnd;

    @NotNull
    private Long technicianId;
}
