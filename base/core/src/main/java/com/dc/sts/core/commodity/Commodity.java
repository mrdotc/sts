package com.dc.sts.core.commodity;


import java.util.*;

public class Commodity {
    public static void main(String[] args) {
//        int[] A = new int[]{1,2,4,4,3};
//        int[] B = new int[]{2,3,1,3,1};
        int[] A = new int[]{};
        int[] B = new int[]{};
        int N = 4;
        System.out.println(solution(N, A, B));
    }

    public static boolean solution(int N, int A[], int B[]) {

        Map<String, Integer> paths = new HashMap<>();
        Map<String, Integer> allPaths = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < N; i++) {
            paths.put(sb.append(i).append(i + 1).toString(), i);
            sb.setLength(0);
        }
        for (int i = 0; i < A.length; i++) {
            allPaths.put(sb.append(A[i]).append(B[i]).toString(), i);
            sb.setLength(0);
            allPaths.put(sb.append(B[i]).append(A[i]).toString(), i);
            sb.setLength(0);

        }
        for (String path : paths.keySet()) {
            if (!allPaths.containsKey(path)) {
                return false;
            }
        }

        return true;

    }

}
