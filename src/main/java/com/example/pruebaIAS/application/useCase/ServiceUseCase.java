package com.example.pruebaIAS.application.useCase;

import com.example.pruebaIAS.application.IUseCaseService;
import com.example.pruebaIAS.application.mapper.IMapperService;
import com.example.pruebaIAS.infraestructure.persistense.dto.ServiceDto;
import com.example.pruebaIAS.infraestructure.persistense.entity.ServiceEntity;
import com.example.pruebaIAS.infraestructure.persistense.entity.TechnicalEntity;
import com.example.pruebaIAS.infraestructure.persistense.request.ServiceRequest;
import com.example.pruebaIAS.infraestructure.repository.ServiceRepository;
import com.example.pruebaIAS.infraestructure.repository.*;
import lombok.AllArgsConstructor;
import com.example.pruebaIAS.domain.Service;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceUseCase implements IUseCaseService {

    private final ServiceRepository serviceRepository;

    private final TechnicalRespository technicalRespository;

    @Override
    public List<ServiceDto> getAllServiceUseCase() {
        List<ServiceEntity> serviceEntityList = serviceRepository.findAll();
        List<Service> services = serviceEntityList.stream().map(IMapperService.mapper::toDomain).toList();
        return services.stream().map(IMapperService.mapper::toDto).toList();
    }

    @Override
    public ServiceDto getServiceByIdUseCase(Long id) {
        ServiceDto serviceEntity = serviceRepository.findById(id).stream()
                .map(IMapperService.mapper::toEntity).findFirst().orElseThrow();
        return serviceEntity;
    }

    @Override
    public ServiceDto createService(ServiceRequest serviceRequest) {
        var technicalEntity = technicalRespository.findById(serviceRequest.getTechnicianId()).orElseThrow();

        ServiceEntity serviceEntity = ServiceEntity.builder()
                .address(serviceRequest.getAddress())
                .description(serviceRequest.getDescription())
                .timeStart(serviceRequest.getTimeStart())
                .timeEnd(serviceRequest.getTimeEnd())
                .technicanId(technicalEntity.getTechnicanId())
                .build();

        ServiceEntity serviceEntity1 = serviceRepository.save(serviceEntity);


        return IMapperService.mapper.toEntity(serviceEntity1);
    }
}
