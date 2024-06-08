package com.scheduling.scheduling_service.models.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class ErrorResponse {
    
    private int statusCode;

    private String errorMsg;
}