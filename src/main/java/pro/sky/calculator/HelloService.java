package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements calculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String plus() {
        int num1 = 5;
        int num2 = 5;

        return num1 + num2 + "= 10";
    }

    @Override
    public String minus() {
        int num1 = 5;
        int num2 = 5;

        return num1 - num2 + "= 0";
    }

    @Override
    public String multiply() {
        int num1 = 5;
        int num2 = 5;

        return num1 * num2 + "= 25";
    }

    @Override
    public String divide() {
        int num1 = 5;
        int num2 = 5;

        return num1 / num2 + "= 1";

    }
}
