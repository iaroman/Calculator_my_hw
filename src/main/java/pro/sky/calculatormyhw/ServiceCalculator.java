package pro.sky.calculatormyhw;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculator {
    public String plus(String num1, String num2) {
        if (num1 == null || num2 == null)
            return "Не могу выполнить операцию, так как указаны не все параметры";
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        StringBuilder str = new StringBuilder();
        str.append(num1);
        str.append(" + ");
        str.append(num2);
        str.append(" = ");
        str.append(result);
        return str.toString();
    }

    public String minus(String num1, String num2) {
        if (num1 == null || num2 == null)
            return "Не могу выполнить операцию, так как указаны не все параметры";
        int result = Integer.parseInt(num1) - Integer.parseInt(num2);
        StringBuilder str = new StringBuilder();
        str.append(num1);
        str.append(" - ");
        str.append(num2);
        str.append(" = ");
        str.append(result);
        return str.toString();
    }

    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null)
            return "Не могу выполнить операцию, так как указаны не все параметры";
        int result = Integer.parseInt(num1) * Integer.parseInt(num2);
        StringBuilder str = new StringBuilder();
        str.append(num1);
        str.append(" * ");
        str.append(num2);
        str.append(" = ");
        str.append(result);
        return str.toString();
    }

    public String divide(String num1, String num2) {
        if (num1 == null || num2 == null)
            return "Не могу выполнить операцию, так как указаны не все параметры";
        if (Integer.parseInt(num2) != 0) {
            int result = Integer.parseInt(num1) / Integer.parseInt(num2);
            StringBuilder str = new StringBuilder();
            str.append(num1);
            str.append(" / ");
            str.append(num2);
            str.append(" = ");
            str.append(result);
            return str.toString();
        } else
            return "Не могу делить на 0";
    }
}