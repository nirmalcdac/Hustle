package EveryDayCode;

import java.util.HashSet;
import java.util.Set;

class PermutationOfString {
    public static Set<String> getPermutation(String str) {
        Set<String> permutations = new HashSet<>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }
        char first = str.charAt(0);
        String sub = str.substring(1);
        Set<String> words = getPermutation(sub);
        for (String strNew : words) {
            for (int i = 0; i <= strNew.length(); i++) {
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        String str = "NIRMAL";
        System.out.println("Permutations of " + str + ": \n" + getPermutation(str));
    }
}