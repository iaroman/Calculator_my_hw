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
    public String plus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return serviceCalculator.plus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return serviceCalculator.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return serviceCalculator.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
            return serviceCalculator.divide(num1, num2);
    }
}
