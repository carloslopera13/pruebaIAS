package com.example.pruebaIAS.infraestructure.persistense.request;

import com.example.pruebaIAS.infraestructure.persistense.dto.TechnicalDto;
import com.example.pruebaIAS.infraestructure.persistense.entity.TechnicalEntity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceRequest {

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
