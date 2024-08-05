package GooglePreperation;

public class LC2325 {
//    public static void main(String[] args) {
//        String key = "the quick brown fox jumps over the lazy dog";
//        String message = "vkbs bs t suepuv";
//        System.out.println(decodeMessage(key, message));
//    }

    public static String decodeMessage(String key, String message) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder newKey = new StringBuilder();
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ' && newKey.toString().indexOf(key.charAt(i)) == -1) {
                newKey.append(key.charAt(i));
            }
        }
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                newStr.append(' ');
            } else {
                newStr.append(s.charAt(newKey.toString().indexOf(message.charAt(i))));
            }
        }
        return new String(newStr);
    }
}
