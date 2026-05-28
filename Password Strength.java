import java.util.*;

class Solution {

    public int passwordStrength(String password) {

        // Store unique characters
        Set<Character> seen = new HashSet<>();

        int score = 0;

        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            // Process only if character is new
            if (!seen.contains(c)) {

                seen.add(c);

                if (Character.isLowerCase(c)) {
                    score += 1;
                }

                else if (Character.isUpperCase(c)) {
                    score += 2;
                }

                else if (Character.isDigit(c)) {
                    score += 3;
                }

                else if (c == '!' || c == '@' || c == '#' || c == '$') {
                    score += 5;
                }
            }
        }

        return score;
    }
}
