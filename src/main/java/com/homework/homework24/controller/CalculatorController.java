package com.homework.homework24.controller;

import com.homework.homework24.service.CalculatorService;
import com.homework.homework24.service.impl.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")


public class CalculatorController {
    private CalculatorServiceImpl calculatorService;
    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping("/plus")
    public String plus (
            @RequestParam("num1") Integer num1,
            @RequestParam("num2") Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Отсутствуют данные";
        } else {
            return calculatorService.plus(num1, num2);
        }
    }
    @GetMapping("/minus")
    public String minus (
            @RequestParam("num1") Integer num1,
            @RequestParam("num2") Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Отсутствуют данные";
        } else {
            return calculatorService.minus(num1, num2);
        }
    }
    @GetMapping("/plus")
    public String multiply (
            @RequestParam("num1") Integer num1,
            @RequestParam("num2") Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Отсутствуют данные";
        } else {
            return calculatorService.multiply(num1, num2);
        }
    }
    @GetMapping("/divide")
    public String divide (
            @RequestParam("num1") Integer num1,
            @RequestParam("num2") Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Отсутствуют данные";
        }
        if (num2 == 0) {
            return "Делить на ноль нельзя.";
        } else {
            return calculatorService.divide(num1, num2);
        }
    }
}
