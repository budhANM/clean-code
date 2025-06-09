package com.example.myapplication;

import android.util.Log;

interface ColorPairPrinter {
    void colorPrint(int pairNumber, String majorColor, String minorColor);
}

public class ColorMap implements ColorPairPrinter {

    static int getPrintColorMapCount(ColorPairPrinter colorPairPrinter) {

        String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int count = 0;

        for (String majorColor : majorColors) {
            for (String minorColor : minorColors) {
                colorPairPrinter.colorPrint(count, majorColor, minorColor);
                count++;
            }
        }

        return count;
    }

    @Override
    public void colorPrint(int pairNumber, String majorColor, String minorColor) {
        Log.d("ColorMap", pairNumber + " | " + majorColor + " | " + minorColor);
    }
}