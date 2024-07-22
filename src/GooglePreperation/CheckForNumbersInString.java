package GooglePreperation;

public class CheckForNumbersInString {
    public static void main(String[] args) {
        //Returns true if the string contains only numbers and no characters
        System.out.println("10".matches("\\d+"));
        //Returns true if the string contains only characters and no numbers
        System.out.println("sn".matches("^[^\\d]*$"));
        System.out.println("string".indexOf('r'));
        System.out.println('r');
    }
}