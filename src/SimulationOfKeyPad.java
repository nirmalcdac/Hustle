import java.util.ArrayList;
import java.util.List;

public class SimulationOfKeyPad {
    public static void main(String[] args) {
        String str = "4567";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list = passForAppend(str);
        }
    }


    public static List<String> passForAppend(String str) {
        List<String> list = new ArrayList<>();
        if (str.length() == 1) {
            list = getChars(str);
        }
        return list;
    }

    public static List<String> getChars(String str) {
        List<String> list = new ArrayList<>();
        switch (str) {
            case "2" -> {
                list.add("A");
                list.add("B");
                list.add("C");
            }
            case "3" -> {
                list.add("D");
                list.add("E");
                list.add("F");
            }
            case "4" -> {
                list.add("G");
                list.add("H");
                list.add("I");
            }
            case "5" -> {
                list.add("J");
                list.add("K");
                list.add("L");
            }
            case "6" -> {
                list.add("M");
                list.add("N");
                list.add("O");
            }
            case "7" -> {
                list.add("P");
                list.add("Q");
                list.add("R");
                list.add("S");
            }
            case "8" -> {
                list.add("T");
                list.add("U");
                list.add("V");
            }
            case "9" -> {
                list.add("W");
                list.add("X");
                list.add("Y");
                list.add("Z");
            }
        }
        return list;
    }
}