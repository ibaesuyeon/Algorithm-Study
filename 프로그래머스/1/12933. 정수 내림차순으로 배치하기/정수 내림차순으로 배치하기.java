import java.util.*;
import java.util.Collections.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] strArr = Long.toString(n).split("");
        int num = strArr.length; //자릿수

        Integer[] arr = new Integer[num];
        for(int i = 0; i<num; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int a : arr){
            answer = answer*10 + a;
        }
        return answer;
    }
}