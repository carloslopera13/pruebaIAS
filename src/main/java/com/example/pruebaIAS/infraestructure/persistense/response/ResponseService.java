package com.example.pruebaIAS.infraestructure.persistense.response;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseService {

    private Object data;
    private int status;
    private String message;
}
