import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        for(int i = 0 ;i<progresses.length; i++){
            int spear = 100 - progresses[i];
            if (spear % speeds[i] == 0){
                arr[i] = spear / speeds[i];              
            } else
                arr[i] = spear / speeds[i] +1;
        }
        int n = arr[0];
        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i<arr.length; i++){
            if(arr[i] <= n){
                count++;
            } else {
                list.add(count);
                n = arr[i];
                count = 1;
            }
        }
        list.add(count);
        return list;
    }
}