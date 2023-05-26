package hw_2023_05_08__2_12.service;
import hw_2023_05_08__2_12.exception.DivByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Number plus(int a, int b) {
        return a + b;
    }

    public Number minus(int a, int b) {
        return a - b;
    }

    public Number multiply(int a, int b) {
        return a * b;
    }

    public Number divide(int a, int b) {
        if (b == 0){
            throw new DivByZeroException();
        }
        return (double)  a / b;
    }
}
