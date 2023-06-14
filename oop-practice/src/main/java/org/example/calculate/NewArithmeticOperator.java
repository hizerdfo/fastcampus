package org.example.calculate;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(PositiveNumver operand1, PositiveNumver operand2);
}
