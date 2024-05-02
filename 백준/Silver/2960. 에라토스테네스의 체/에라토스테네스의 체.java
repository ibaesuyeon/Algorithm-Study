import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] sieve = new int[n+1]; // 배열 설정
        for(int i = 2; i<=n; i++){
            sieve[i] = i;
        }

        int count = 0;
        sieving:
        for(int i = 2; i<=n; i++){
            if (sieve[i] == 0) continue;
//            for(int j = i+i; j<=n; j+=i){ // 원래 소수를 구하던 방식
            for(int j = i; j<=n; j+=i){ // 소수도 삭제하는 방식
                if (sieve[j] == 0) continue;
                count++;
                if(count == k){
                    System.out.println(sieve[j]);
                    break sieving;
                }
                sieve[j] = 0;
            }
        }
    }
}