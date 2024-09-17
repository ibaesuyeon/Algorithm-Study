import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0 ; i<n; i++){
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        long res = 0;
        for (long key : map.keySet()) {
            if (map.get(key)>max){
                max =map.get(key);
                res = key;
            }else if (map.get(key )==max){
                res = Math.min(res, key);
            }
        }
        System.out.println(res);

    }
}