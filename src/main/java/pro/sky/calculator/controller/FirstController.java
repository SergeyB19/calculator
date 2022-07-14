package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static pro.sky.calculator.calculatorService.*;

@RestController
public class FirstController {
    @GetMapping
    public String showWelcometoCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus?num1=5&num2=5")
    public String plus() {
        return plus1();
    }

    @GetMapping(path = "/calculator/minus?num1=5&num2=5 ")
    public String minus() {
        return minus1();
    }

    @GetMapping(path = "/calculator/multiply?num1=5&num2=5")
    public String multiply() {
        return multiply1();
    }

    @GetMapping(path = "/calculator/divide?num1=5&num2=5")
    public String divide() {
        return divide1();
    }
}
