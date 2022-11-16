package EveryDayCode;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {
    List<String> customStackList = new ArrayList<>();

    public String peek() {
        return customStackList.get(customStackList.size() - 1);
    }

    public void pop() {
        customStackList.remove(customStackList.size() - 1);
    }

    public void push(String str) {
        customStackList.add(customStackList.size(), str);
    }
}

