package com.example.pruebaIAS.application;

import com.example.pruebaIAS.infraestructure.persistense.dto.ServiceDto;
import com.example.pruebaIAS.infraestructure.persistense.request.ServiceRequest;

import java.util.List;

public interface IUseCaseService {

    List<ServiceDto> getAllServiceUseCase();

    ServiceDto getServiceByIdUseCase(Long id);

    ServiceDto createService(ServiceRequest serviceRequest);


}
