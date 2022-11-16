package EveryDayCode;

import java.util.*;

public class TestMapEntryExit {
    public static void main(String[] args) {
        String[][] records1 = {
                {"Paul", "enter"},
                {"Pauline", "exit"},
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Martha", "exit"},
                {"Joe", "enter"},
                {"Martha", "enter"},
                {"Steve", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "enter"},
                {"Joe", "enter"},
                {"Curtis", "exit"},
                {"Curtis", "enter"},
                {"Joe", "exit"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "exit"},
                {"Joe", "enter"},
                {"Joe", "enter"},
                {"Martha", "exit"},
                {"Joe", "exit"},
                {"Joe", "exit"},
        };


        String[][] records2 = {
                {"Paul", "enter"},
                {"Paul", "exit"},
        };

        String[][] records3 = {
                {"Paul", "enter"},
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Paul", "exit"},
        };


        String[][] records4 = {
                {"Raj", "enter"},
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Paul", "exit"},
                {"Paul", "enter"},
                {"Raj", "enter"},
        };
        System.out.println(myProcess(records1));
        System.out.println(myProcess(records2));
        System.out.println(myProcess(records3));
        System.out.println(myProcess(records4));

    }

    public static String myProcess(String[][] records) {
        List<String> wrongEntryList = new ArrayList<>();
        List<String> wrongExitList = new ArrayList<>();
        processData(records, wrongEntryList, wrongExitList);
        StringBuilder sb = new StringBuilder();
        sb.append("mismatches(records1) => [");
        wrongEntryList.forEach(o -> sb.append("\"").append(o).append("\"").append(", "));
        sb.append("], ");
        sb.append(" [ ");
        wrongExitList.forEach(o -> sb.append("\"").append(o).append("\"").append(", "));
        sb.append("],");
        wrongEntryList.clear();
        wrongExitList.clear();
        return sb.toString();
    }

    public static void processData(String[][] record, List<String> wrongEntryList, List<String> wrongExitList) {

        Map<String, String> recordMap = new HashMap<>();
        for (String[] strings : record) {
            if (recordMap.containsKey(strings[0]) && Objects.equals(recordMap.get(strings[0]), "enter") && Objects.equals(strings[1], "enter")) {
                if (!wrongEntryList.contains(strings[0])) {
                    wrongEntryList.add(strings[0]);
                }
            } else if (recordMap.containsKey(strings[0]) && Objects.equals(recordMap.get(strings[0]), "exit") && Objects.equals(strings[1], "exit")) {
                if (!wrongExitList.contains(strings[0])) {
                    wrongExitList.add(strings[0]);
                }
            } else if (!recordMap.containsKey(strings[0]) && Objects.equals(strings[1], "exit")) {
                wrongExitList.add(strings[0]);
            } else if (recordMap.containsKey(strings[0]) && Objects.equals(recordMap.get(strings[0]), "enter") && Objects.equals(strings[1], "exit")) {
                recordMap.remove(strings[0]);
            } else {
                recordMap.put(strings[0], strings[1]);
            }
        }
        for (Map.Entry<String, String> entry : recordMap.entrySet()) {
            if (Objects.equals(entry.getValue(), "enter") && !wrongEntryList.contains(entry.getKey())) {
                wrongEntryList.add(entry.getKey());
            } else if (Objects.equals(entry.getValue(), "exit") && !wrongExitList.contains(entry.getKey())) {
                wrongExitList.add(entry.getKey());
            }
        }
    }
}
