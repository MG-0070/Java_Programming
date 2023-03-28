import java.util.*;
import java.util.Scanner;
public class anagram {




        static int anagram(String s) {
            // If the length of the string is odd, it cannot be split into two substrings of equal length
            if (s.length() % 2 != 0) {
                return -1;
            }

            // Split the string into two substrings of equal length
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2);

            // Create a frequency table for each substring
            int[] freq1 = new int[26];
            int[] freq2 = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                freq1[s1.charAt(i) - 'a']++;
                freq2[s2.charAt(i) - 'a']++;
            }

            // Count the number of characters that need to be changed to make the substrings into anagrams
            int changes = 0;
            for (int i = 0; i < 26; i++) {
                changes += Math.abs(freq1[i] - freq2[i]);
            }
            return changes / 2;  // Divide by 2 because each change affects two characters
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            for (int i = 0; i < t; i++) {
                String s = scanner.nextLine();
                int result = anagram(s);
                System.out.println(result);
            }
            scanner.close();
        }
    }

