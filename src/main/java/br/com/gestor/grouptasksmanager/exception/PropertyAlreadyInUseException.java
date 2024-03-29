package br.com.gestor.grouptasksmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "The given nickname is already in use")
public class PropertyAlreadyInUseException extends RuntimeException {
    public PropertyAlreadyInUseException(String message){
        super(message);
    }
}
