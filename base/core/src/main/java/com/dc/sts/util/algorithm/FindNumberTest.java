package com.dc.sts.util.algorithm;


import java.util.HashMap;

public class FindNumberTest {
    public static void  main(String[] args) {
        int target = 100;
        int[] nums = {12, 68, 45, 68, 90, 88, 66, 556, 32, 56, 32};

        System.out.println(findTwoNumbers(nums, target));

    }



    public static int[] findTwoNumbers(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {

                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return  new int[]{};
    }

}
