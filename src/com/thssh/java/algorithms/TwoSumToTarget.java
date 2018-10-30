package com.thssh.java.algorithms;

import java.util.*;

public class TwoSumToTarget {
    public static void main(String[] args){
        final int MAX_NUM = 100;
        final int MAX_SUM_SIZE = 1000;
        int timer = 0;
        int instanceSize = 100 * 10000;
        Random r = new Random();
        long allStart = System.currentTimeMillis();
        do{
            int numsL = r.nextInt(2+ MAX_SUM_SIZE);
            List<Integer> numList = new ArrayList<>(numsL);
            for(int i=0; i<numsL;i++){
                numList.add(r.nextInt(MAX_NUM));
            }
            Integer[] nums = numList.toArray(new Integer[numsL]);
            int target = r.nextInt(MAX_NUM);
            long start = System.currentTimeMillis();
            int[] solution = solution_0(nums, target);
            timer += System.currentTimeMillis()-start;
//            System.out.println(Arrays.toString(nums)+ " -> " +Arrays.toString(solution));
        }while (instanceSize-- > 0);

        System.out.println("time: " + timer);
        System.out.println("all time: " + (System.currentTimeMillis() - allStart));
//        int[] solution = solution_0(new int[]{2, 7, 11, 15}, 9);
//        System.out.println(Arrays.toString(solution));
//        solution = solution_0(new int[]{3,2,4}, 6);
//        System.out.println(Arrays.toString(solution));
    }

    static int[] solution_1(Integer[] nums, int target){
        if(nums.length<=0) return null;
        final int il = nums.length;
        int il2 = (il >> 2) - 1;

        int pot = 2;
        while((il2 >>= 1) > 0) pot <<= 1;
        final int bitMod = pot - 1;
        final int[] bucket = new int[pot];
        final int[] linked = new int[il];

        try {
            final int firstVal = nums[0];

            for (int i = 1; i < il; i++) {
                int currNum = nums[i];
                int complement = target - currNum;

                if (complement == firstVal) {
                    return new int[] { 0, i };
                }

                int complementLLIndex = bucket[complement & bitMod];
                while(complementLLIndex != 0) {
                    if(nums[complementLLIndex] == complement) {
                        //Found
                        return new int[] { complementLLIndex, i };
                    }
                    complementLLIndex = linked[complementLLIndex];
                }
                int currNumLLIndex = currNum & bitMod;
                linked[i] = bucket[currNumLLIndex];
                bucket[currNumLLIndex] = i;
            }
        }catch (Exception e){
            System.out.println(Arrays.toString(nums));
            e.printStackTrace();
        }
        return null;
    }
    static int[] solution_0(Integer[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    static int[] solution(Integer[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length;j++){
                if(i != j && nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
