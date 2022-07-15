package pro.sky.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public abstract class   CalculatorServiceImp implements calculatorServiceInterface {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    @GetMapping("/calculator/plus?num1=5&num2=5")
    public int plus() {
        int num1 = 5;
        int num2 = 5;
        return num1 + num2;
    }

    @Override
    public int minus() {
        int num1 = 5;
        int num2 = 5;

        return num1 - num2;
    }

    @Override
    public int multiply() {
        int num1 = 5;
        int num2 = 5;

        return num1 * num2;
    }

    @Override
    public int divide() {
        int num1 = 5;
        int num2 = 5;

        return num1 / num2;

    }
}
