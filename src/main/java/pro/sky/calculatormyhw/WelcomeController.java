package pro.sky.calculatormyhw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class WelcomeController {
    private final ServiceCalculator serviceCalculator;

    public WelcomeController (ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Не могу выполнить операцию, так как указаны не все параметры";
        return serviceCalculator.result(num1, num2, "+", serviceCalculator.plus(num1, num2));
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Не могу выполнить операцию, так как указаны не все параметры";
        return serviceCalculator.result(num1, num2, "-", serviceCalculator.plus(num1, num2));
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Не могу выполнить операцию, так как указаны не все параметры";
        return serviceCalculator.result(num1, num2, "*", serviceCalculator.multiply(num1, num2));
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Не могу выполнить операцию, так как указаны не все параметры";
        if (num2 == 0)
            return  "Не могу делить на О";
        return serviceCalculator.result(num1, num2, "/", serviceCalculator.divide(num1, num2));
    }
}
