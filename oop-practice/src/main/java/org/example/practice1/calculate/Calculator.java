package org.example.practice1.calculate;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calculate(PositiveNumver operand1, String operator, PositiveNumver operand2) {

       return arithmeticOperators.stream()
               .filter(arithmeticOperators -> arithmeticOperators.supports(operator))
               .map(arithmeticOperators -> arithmeticOperators.calculate(operand1, operand2))
               .findFirst()
               .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
