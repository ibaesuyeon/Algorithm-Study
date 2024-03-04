import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int N, T;
    static long res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        ArrayList<Long> time = new ArrayList<>();
        for(int i = 0; i < N ; i++) {
            st = new StringTokenizer(br.readLine());
            long start = Long.parseLong(st.nextToken());
            long gap = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());

            for(int j = 0 ; j < n ; j++) {
                time.add(start + gap*j);
            }
        }
        Collections.sort(time);
        if(time.get(0) >= T ) res = time.get(0) - T;
        else if(time.get(time.size() - 1) < T) res = -1;
        else {
            long left = 0;
            long right = time.size() -1;
            long mid = (left+right)/2;

            while(left<right) {
                mid = (left+right)/2;
                if(time.get((int)mid)==T) {
                    System.out.println(0);
                    return;
                }
                else if(time.get((int)mid)>T) right = mid;
                else   left = mid+1;
            }

            res = time.get((int)right)-T;
        }
        System.out.println(res);
    }
}
