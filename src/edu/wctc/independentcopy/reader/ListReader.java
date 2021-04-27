package edu.wctc.independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader{

    private List<String> strList = new ArrayList<>();

    private int currentIndex = 0;

    public ListReader()
    {
        strList.add("This is the first index of strList.");
        strList.add("This is the second index of strList.");
        strList.add("This is the third index of strList.");
        strList.add("This is the fourth index of strList.");
        strList.add("This is the fifth index of strList.");
        strList.add("This is the sixth index of strList.");
        strList.add("This is the seventh index of strList.");
        strList.add("This is the eighth index of strList.");
        strList.add("This is the ninth index of strList.");
        strList.add("This is the tenth index of strList.");
    }

    @Override
    public String readln() {
        String output = strList.get(currentIndex);
        currentIndex++;
        return output;
    }

}
