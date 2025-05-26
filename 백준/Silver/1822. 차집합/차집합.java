import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int[] B;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());
        int[] A = new int[nA];
        B = new int[nB];

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<nA; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<nB; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(B);

        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i<nA; i++){
            if (!binarySearch(A[i])){
                res.add(A[i]);
            }
        }
        Collections.sort(res);
        sb.append(res.size()).append("\n");
        if (res.size() != 0){
            for (Integer r : res) {
                sb.append(r).append(" ");
            }
        }
        System.out.println(sb);
    }
    public static boolean binarySearch(int a){
        int st = 0; int end = B.length - 1;
        while(st<=end) {
            int mid = (st+end)/2;
            if (a > B[mid]) {
                st = mid + 1;
            } else if (a < B[mid]) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}