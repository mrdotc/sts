package com.dc.sts.util.algorithm;


import java.util.HashMap;
import java.util.Map;

public class FindMaxLengthOfSubString {
    public static void main(String[] args) {

        String source = "yiuoijdsktwzfkkikouy123i456789i0-=.,/!@$%^";
        System.out.println("===" + source.substring(1, 2));
        System.out.println(countMaxLength(source));

    }

    public static int countMaxLength(String source) {
        int length = source.length();
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < length; end++) {
            char c = source.charAt(end);
            if (map.containsKey(source.charAt(end))) {
                start = Math.max(start, map.get(c));
            }
            maxLength = Math.max(maxLength, end - start + 1);
            map.put(c, end + 1);

        }
        return maxLength;
    }


    public static int countMaxLength_back(String source) {
        int left = 0, right = 0, currentMax = 0, max = 0;
        HashMap<String, Integer> subChars = new HashMap<String, Integer>();
        for (int i = 0; i < source.length(); i++) {
            String s = source.substring(i, i + 1);
            Integer index = subChars.get(s);
            if (index == null) {
                subChars.put(s, i);
                currentMax++;

            } else {
                if (index > left) {
                    int tmpMax = currentMax - left;
                    if (max < tmpMax) {
                        max = tmpMax;
                    }
                    subChars.put(s, i);
                    left = index.intValue();

                }
                int tmpMax = currentMax - left;
                if (max < tmpMax) {
                    max = tmpMax;
                }
            }

        }
        return max;

    }

}
