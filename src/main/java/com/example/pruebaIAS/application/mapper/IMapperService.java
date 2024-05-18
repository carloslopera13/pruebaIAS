package com.example.pruebaIAS.application.mapper;

import com.example.pruebaIAS.domain.Service;
import com.example.pruebaIAS.infraestructure.persistense.dto.ServiceDto;
import com.example.pruebaIAS.infraestructure.persistense.entity.ServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperService {

    IMapperService mapper = Mappers.getMapper(IMapperService.class);

    Service toDomain(ServiceEntity serviceEntity);

    ServiceDto toDto(Service service);

    ServiceDto toEntity(ServiceEntity serviceEntity);

}
