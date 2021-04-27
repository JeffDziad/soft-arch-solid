package edu.wctc.independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

public class ListWriter implements Writer{

    private List<String> strList = new ArrayList<>();

    @Override
    public void writeln(String line) {
        strList.add(line);
        //To Confirm addition of copied text.
        for(String s : strList)
        {
            System.out.println(s);
        }
    }
}
