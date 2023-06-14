package org.example;

public class AdditionOperator implements NewArithemeticOperator{
    @Override
    public boolean supports(String operator){
        return "+".equals(operator);
    }
}
