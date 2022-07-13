package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorController {

}


    @GetMapping
    public String hello() {
        return HelloService.hello();
    }

