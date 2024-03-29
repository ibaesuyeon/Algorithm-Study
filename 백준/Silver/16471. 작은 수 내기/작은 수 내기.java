import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int score = 0;
        int j = 0;
        for(int i = 0; i<n; i++){
            while (j < n && arr1[i] >= arr2[j]) {
                j++;
            }
            if (j < n) {
                score++;
                j++;
            }
        }
        if(score >= (n+1)/2)
            System.out.println("YES");
        else System.out.println("NO");
    }
}