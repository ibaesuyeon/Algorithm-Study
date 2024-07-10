import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length;
        int n2 = n/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        //아ㅣㄴ진짜개배고프다.................................
            // 종류가 n/2개보다 많거나 같다면 : n/2개가 답
            // 종류가 n/2개보다 적다면 : 종류가 답
        }
        if(map.size()>= n2)
            return n2;
        else return map.size();
    }
}