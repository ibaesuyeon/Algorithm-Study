import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        int n = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<arr.length; i++){
            int res_idx = 0;
            if(arr[i] != n ) {
                list.add(n);
            }
            n = arr[i];
        }
        list.add(arr[arr.length -1]);
    return list;
    }
}