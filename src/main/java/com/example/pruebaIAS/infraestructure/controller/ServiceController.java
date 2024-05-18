package com.example.pruebaIAS.infraestructure.controller;


import com.example.pruebaIAS.application.useCase.ServiceUseCase;
import com.example.pruebaIAS.infraestructure.persistense.dto.ServiceDto;
import com.example.pruebaIAS.infraestructure.persistense.response.ResponseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;

import java.util.List;
import org.springframework.http.HttpStatus;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ServiceController {

    private ServiceUseCase serviceUseCase;


    @GetMapping("")
    public ResponseEntity<ResponseService> getAllService() {

        List<ServiceDto> serviceDto = serviceUseCase.getAllServiceUseCase();

        return ResponseEntity.ok(ResponseService.builder()
                .data(serviceDto)
                .message("Servicio creado")
                .status(HttpStatus.OK.value())
                .build());
    }

    @GetMapping("/all")
    public ResponseEntity<ResponseService> getAllServiceById() {

        ServiceDto serviceDto = serviceUseCase.getServiceByIdUseCase();

        return ResponseEntity.ok(ResponseService.builder()
                .data(serviceDto)
                .message("Servicio creado")
                .status(HttpStatus.OK.value())
                .build());
    }
}
