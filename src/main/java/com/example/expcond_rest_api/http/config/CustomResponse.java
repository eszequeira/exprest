package com.example.expcond_rest_api.http.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class CustomResponse {

    private final boolean success;
    private final String message;

}
