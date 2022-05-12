package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void testCount(int borderLeft, int borderRight, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrCount(borderLeft, borderRight);

        Assertions.assertEquals(expected, actual);
    }
}
