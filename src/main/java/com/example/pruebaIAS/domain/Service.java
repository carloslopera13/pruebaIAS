package com.example.pruebaIAS.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Service {

    private Long id;
    private String address;
    private String description;
    private String timeStart;
    private String timeEnd;
    private Technical technicianId;
}
