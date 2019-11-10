/*
 * aspire-tech.com Inc.
 * Copyright (c) 2000-2019 All Rights Reserved.
 */
package sts.sts;

import java.util.ArrayList;
import java.util.List;

/**
 * 1
 *
 * @author Admin
 * @version $id:Test.java, v  2019/11/10 22:57:33, Admin Exp $
 */
public class Test {
    public  static  void  main(String[] arg){

        String orgStr="(超期10天)上海、广州、北京、重庆(10天)、广西(6)";
        String orgStr2="上海、广州、北京、重庆(10天)、广西(6)";
        String orgStr3="上海、广州、北京、重庆(10天)、广西(6)、四川、江西";

//        List<String> results=new ArrayList<>();
//
//        int fromIndex = 0;
//        while (orgStr.indexOf("(", fromIndex) >= 0) {
//            int leftIndex = orgStr.indexOf("(", fromIndex);
//            int rightIndex = orgStr.indexOf(")", fromIndex);
//
//            if (leftIndex !=fromIndex){
//                results.add(orgStr.substring(fromIndex,leftIndex));
//            }
//            fromIndex = rightIndex + 1;
//            results.add(orgStr.substring(leftIndex,rightIndex + 1));
//        }
//        if (fromIndex <orgStr.length()){
//            results.add(orgStr.substring(fromIndex));
//        }
//
//        extractSpanString(orgStr);
        System.out.println(extractSpanString(orgStr));
        System.out.println(extractSpanString(orgStr2));
        System.out.println(extractSpanString(orgStr3));

    }

    private static List<String> extractSpanString(String orgStr) {
        List<String> results=new ArrayList<>();
        int fromIndex = 0;
        while (orgStr.indexOf("(", fromIndex) >= 0) {
            int leftIndex = orgStr.indexOf("(", fromIndex);
            int rightIndex = orgStr.indexOf(")", fromIndex);

            if (leftIndex !=fromIndex){
                results.add(orgStr.substring(fromIndex,leftIndex));
            }
            fromIndex = rightIndex + 1;
            results.add(orgStr.substring(leftIndex,rightIndex + 1));
        }
        if (fromIndex <orgStr.length()){
            results.add(orgStr.substring(fromIndex));
        }
        return  results;
    }
}
