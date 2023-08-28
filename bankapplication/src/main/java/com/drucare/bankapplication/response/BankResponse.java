package com.drucare.bankapplication.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class BankResponse<T> {
    T Data;
    String msg;
    HttpStatus httpStatus;
}
