package hw_2023_05_01__2_11.handler;

import hw_2023_05_01__2_11.controller.StoreController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice(basePackageClasses = StoreController.class)
public class StoreException {

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handMethodArgumentTypeMismatchException (MethodArgumentTypeMismatchException e){
        return "Некорректный параметр запроса!";
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public String handIllegalArgumentException (IllegalArgumentException e){
        return "IllegalArgumentException is here!";
    }

    @ExceptionHandler(RuntimeException.class)
    public String handRuntimeException (RuntimeException e){
        return "RuntimeException is here!";
    }
}
