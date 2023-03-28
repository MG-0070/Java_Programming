import java.util.HashSet;
import java.util.Set;

class palindrome {
    public static String pangram(String s) {
        // Create a set to store the unique lowercase letters in the string


        Set<Character> letters = new HashSet<>();

        // Loop through each character in the string
        for (char c : s.toLowerCase().toCharArray()) {
            // If the character is a letter, add it to the set
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        // If the number of letters in the set is 26, return "pangram", otherwise "not pangram"
        return letters.size() == 26 ? "pangram" : "not pangram";
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        String result = pangram(s);
        System.out.println(result); // Output: "pangram"
    }
}
