package com.ohgiraffers.mapping.section01.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class EntityMappingTests {

    @Autowired
    private SnackRegistService snackRegistService;

    private static Stream<Arguments> getSnack(){
        return Stream.of(
                Arguments.of(
                        "꼬꼬콘",
                        "롯데감귤",
                        "N",
                        3600,
                        2800,
                        0.1

                )
        );
    }

    @DisplayName("연습하기")
    @ParameterizedTest
    @MethodSource("getSnack")
    void testCreateSnack(String snackName, String snackCompany, OrderableStauts orderableStauts, int calories, int regularPrice, double discountRate){
        SnackDTO snackInfo = new SnackDTO(snackName, snackCompany, orderableStauts, calories, regularPrice, discountRate);

        Assertions.assertDoesNotThrow(
                () -> snackRegistService.registSnack(snackInfo)
        );
    }

}
