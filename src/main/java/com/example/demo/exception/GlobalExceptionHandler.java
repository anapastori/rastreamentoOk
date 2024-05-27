package src.main.java.com.example.demo.exception;

import java.util.Date;

public class GlobalExceptionHandler {

    public <ResourceNotFoundException, T> ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getClass(), request.getDescription(false));
        return new ResponseEntity<T>(errorDetails, HttpStatus.NOT_FOUND);
    }

    
}
