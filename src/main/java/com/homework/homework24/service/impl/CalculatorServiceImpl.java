package com.homework.homework24.service.impl;

import com.homework.homework24.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String plus(Integer num1, Integer num2) {
        Integer res = num1 + num2;
        return res.toString();
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        Integer res = num1 - num2;
        return res.toString();
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        Integer res = num1 * num2;
        return res.toString();
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        Integer res = num1 / num2;
        return res.toString();
    }
}
