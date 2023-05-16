package pro.sky.calculatormyhw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping(path = "/calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        StringBuilder str = new StringBuilder();
        str.append(num1);
        str.append(" + ");
        str.append(num2);
        str.append(" = ");
        str.append(result);
        return str.toString();
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        StringBuilder str = new StringBuilder();
        str.append(num1);
        str.append(" - ");
        str.append(num2);
        str.append(" = ");
        str.append(result);
        return str.toString();
    }
}
