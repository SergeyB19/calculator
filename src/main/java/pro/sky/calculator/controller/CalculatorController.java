package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.CalculatorServiceImp;

@RestController
public class CalculatorController extends CalculatorServiceImp {
    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public int plus() {
        return plus();
    }
    @GetMapping("/minus")
    public int minus() {
        return minus();
    }
    @GetMapping("/multiply")
    public int multiply() {
        return multiply();
    }
    @GetMapping("/divide")
    public int divide() {
        return divide();
    }
}

