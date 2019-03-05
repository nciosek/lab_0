package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        if(value == null) {
           return Collections.emptyList();
        }

        List<String> arrayList = new ArrayList<>();

        for(int i = 0; i < value.length(); i++) {
            String temp = value.substring(i, value.length());
            arrayList.add(temp);
        }
        arrayList.add("");
        return arrayList;
    }

}
