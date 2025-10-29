package com.example.ac2.dtos;

import java.util.Arrays;
import java.util.List;
import lombok.Getter;

public class ApiErrorDTO {
    @Getter
    private List<String> erros;   

    public ApiErrorDTO(String mensagem) {
        this.erros = Arrays.asList(mensagem);
    }
}
