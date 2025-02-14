import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] sorted_arr = Arrays.stream(arr).sorted().toArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<n; i++){
            sb.append(sorted_arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}