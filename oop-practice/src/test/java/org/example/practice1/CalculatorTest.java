package org.example.practice1;

import org.example.practice1.calculate.Calculator;
import org.example.practice1.calculate.PositiveNumver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {
    //두개의 피연산자를 calculator로 전달하며 작업하는 클래스
    //결과값을 전달해줌 (calculator)
    @DisplayName("덧셈 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(int operand1, String operator, int operand2, int result){
        int calculateResult = Calculator.calculate(new PositiveNumver(operand1), operator, new PositiveNumver(operand2));

        assertThat(calculateResult).isEqualTo(result);
    }
    //밑의 메소드를 소스로 가질거야
    private static Stream<Arguments> formulaAndResult(){
        return Stream.of(
                arguments(1,"+",2,3),
                arguments(1,"-",2,-1),
                arguments(4,"*",2,8),
                arguments(4,"/",2,2)
        );
    }

}
