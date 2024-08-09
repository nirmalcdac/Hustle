package GooglePreperation;

public class LC2810 {
    public String finalString(String s) {
        StringBuilder newStr = new StringBuilder();
        boolean reverse = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                reverse = !reverse;
            } else {
                if (reverse) {
                    newStr.insert(0, s.charAt(i));
                } else {
                    newStr.append(s.charAt(i));
                }
            }
        }
        if (reverse) {
            newStr.reverse();
        }
        return newStr.toString();
    }
}
