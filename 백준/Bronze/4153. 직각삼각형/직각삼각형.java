import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if(arr[0] == 0) break;

            if (isPythagoras(arr)) {
                sb.append("right").append("\n");
            } else sb.append("wrong").append("\n");
        }
        System.out.println(sb);
    }
    public static boolean isPythagoras(int[] arr){
        Arrays.sort(arr);
        if((arr[2]*arr[2]) == (arr[1]*arr[1]) + (arr[0]*arr[0])){
            return true;
        } else return false;
    }
}
