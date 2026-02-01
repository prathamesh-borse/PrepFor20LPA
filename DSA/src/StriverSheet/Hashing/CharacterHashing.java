package StriverSheet.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharacterHashing {
    public static void main(String[] args) {
        String s = "abcdabcfc";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry key : hashMap.entrySet()) {
            System.out.println(key.getKey() + " -> " + key.getValue());
        }

        int[] hashingFrequency = characterHashingFrequency(s);
        System.out.println(Arrays.toString(hashingFrequency));
    }

    private static int[] characterHashingFrequency(String s) {
        int n = s.length();
        int[] hash = new int[26];
        for (int i = 0; i < n; i++) {
            hash[s.charAt(i) - 'a']++;
        }
        return hash;
    }
}
