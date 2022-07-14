package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String showWelcometoCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus?num1=5&num2=5")
    public String plus() {
        return "5 + 5 = 10";
    }

    @GetMapping(path = "/calculator/minus?num1=5&num2=5 ")
    public String minus() {
        return "5 − 5 = 0";
    }

    @GetMapping(path = "/calculator/multiply?num1=5&num2=5")
    public String multiply() {
        return "5 * 5 = 25";
    }

    @GetMapping(path = "/calculator/divide?num1=5&num2=5")
    public String divide() {
        return "5 / 5 = 1";
    }
}
