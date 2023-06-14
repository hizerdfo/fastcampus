package org.example.practice1;

import org.example.practice1.calculate.PositiveNumver;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PositiveNumberTest {
    @ParameterizedTest
    @ValueSource(ints = {0,-1})
    void createTest(int value){
        assertThatCode(() -> new PositiveNumver(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 또는 음수를 전달할 수 없습니다.");
    }
}
