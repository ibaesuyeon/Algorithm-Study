import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int divisor_count = Integer.parseInt(br.readLine());
        int[] arr = new int[divisor_count];
        String divisors = br.readLine();
        for(int i = 0; i<divisor_count; i++){
            arr[i] = Integer.parseInt(divisors.split(" ")[i]);
        }
        Arrays.sort(arr);
        int n = arr[0] * arr[divisor_count-1];
        System.out.println(n);
    }
}