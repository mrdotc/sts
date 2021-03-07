package com.dc.sts.util.algorithm;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenxiufeng
 * @version :FindWordStartIndexSolution.java, 2021/3/7 12:47, chenxiufeng Exp $
 */
public class FindWordStartIndexSolution {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = new String[]{"foo", "bar"};
        System.out.println(findSubStringIndex(s,words));

    }

    public static List<Integer> findSubStringIndex(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> allWords = new HashMap<String, Integer>();
        if (s.length() == 0 || words.length == 0) {
            return result;
        }
        int wordNumber = words.length;
        int wordLength = words[0].length();
        for (String word : words) {
            Integer count = allWords.getOrDefault(word, 0);
            allWords.put(word, count+1);
        }

        for (int i = 0; i < s.length() - wordLength * wordNumber; i++) {
            String subString = s.substring(i, i + wordLength * wordNumber);
            if (match(subString, wordLength,allWords)) {
                result.add(i);
            }
        }
        return result;
    }

    private static boolean match(String s, int wordLength, Map<String, Integer> allWords) {
        Map<String, Integer> hasWords = new HashMap<>();
        for (int i = 0; i < s.length() - wordLength; i=i+wordLength-1) {
            int number=0;
            String word = s.substring(i, wordLength);
            if (!allWords.containsKey(word)) {
                return false;
            }
            hasWords.put(word, hasWords.getOrDefault(word, 0) + 1);
            if (hasWords.get(word) > allWords.get(word)) {
                return false;
            }
            number++;
            if (number==2) {
                return true;
            }
        }
        return false;
    }
}
