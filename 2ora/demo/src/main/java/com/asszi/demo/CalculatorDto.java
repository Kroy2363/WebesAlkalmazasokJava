package com.asszi.demo;

import lombok.Getter;
import lombok.Setter;

public class CalculatorDto {
    @Getter @Setter
    private int a;
    @Getter @Setter
    private int b;
    @Getter @Setter
    private String operator;
}
