package com.dc.sts.util;

import java.util.HashMap;
import java.util.Map;

public class TT {

    public static void main(String[] args) {
        System.out.println("DDDDDDDD");
        int n = 16;
        int sc = n >>> 2;
        System.out.println(sc);
        Thread thread = new Thread();
        Map map = new HashMap<>();
        for (int i = 0; i < 10008888; i++) {
            map.put("dooo" + i, i);
        }
        map.put(1, "1");
        map.put("key-1", "1");
        map.put("key-2", "2");
        map.put("key-3", "3");
        map.put("key-4", "4");
        map.put("key-5", "5");
        map.put("key-6", "7");
        map.put("key-7", "999");
        map.put("key-8sdf", "888");
        map.put("key-5dsfdsf", "5");
        map.put("key-dsfds6", "7");
        map.put("keysdfdsf-7", "999");
        map.put("key-dsfdsf8", "888");
        map.put("keydsfdsf-5", "5");
        map.put("keysdfds-6", "7");
        map.put("keydsfdsf-7", "999");
        map.put("key-dsfdsf8", "888");
        map.put("key-dsfdsfdsfd5", "5");
        map.put("keysfdsfsd-6", "7");
        map.put("keyfdsfds-7", "999");
        map.put("key-fdsfdsf8", "888");

        Object Object = new Object();
        map.put(Object, "goodsIdXXXXXX");
        Object Object2 = new Object();
        map.put(Object2, "array");

        System.out.println("done===========");

    }
}
