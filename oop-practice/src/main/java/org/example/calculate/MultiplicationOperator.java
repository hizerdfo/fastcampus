package org.example.calculate;

public class MultiplicationOperator implements NewArithmeticOperator{
    @Override
    public boolean supports(String operator){
        return "*".equals(operator);
    }
    @Override
    public int calculate(PositiveNumver operand1, PositiveNumver operand2){
        return operand1.toInt() * operand2.toInt();
    }
}
