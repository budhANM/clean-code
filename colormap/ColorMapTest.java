package com.example.myapplication;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class ColorMapTest {

    @Test
    public void testGetPrintColorMapCount() {
        ColorPairPrinter mockPrinter = Mockito.mock(ColorPairPrinter.class);
        int count = ColorMap.getPrintColorMapCount(mockPrinter);

        assertEquals(25, count);
        Mockito.verify(mockPrinter, Mockito.times(25))
                .colorPrint(Mockito.anyInt(), Mockito.anyString(), Mockito.anyString());

        Mockito.verify(mockPrinter).colorPrint(0, "White", "Blue");
        Mockito.verify(mockPrinter).colorPrint(24, "Violet", "Slate");
    }
}