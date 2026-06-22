package leetcode.com.problems;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        String balloon = "balloon";
        int balloonUniqueLetters = 5;
        int wordLength = balloon.length();
        int providedTextLength = text.length();

        if (providedTextLength < wordLength) {
            return 0;
        }

        for (char letter : text.toCharArray()) {
            if (balloon.contains(String.valueOf(letter).toLowerCase())) {
                map.put(letter, map.getOrDefault(letter, 0) + 1);
            }
        }

        if (map.size() < balloonUniqueLetters) {
            return 0;
        }

        int maxNumberOfOccurences = providedTextLength / wordLength;
        int maxOccurences = maxNumberOfOccurences;

        for (Map.Entry<Character, Integer> balloonOccurences : map.entrySet()) {
            char letter = balloonOccurences.getKey();
            int occurences = balloonOccurences.getValue();

            if (letter == 'l' || letter == 'o') {
                occurences /= 2;
            }

            maxOccurences = Math.min(maxOccurences, occurences);
        }

        return maxOccurences;
    }
}
