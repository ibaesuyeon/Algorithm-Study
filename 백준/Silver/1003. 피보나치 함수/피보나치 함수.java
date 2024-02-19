import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer f[][] = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        f[0][0] = 1;
        f[0][1] = 0;
        f[1][0] = 0;
        f[1][1] = 1;

        for(int i = 0; i< t; i++){
            int n = Integer.parseInt(br.readLine());
            f[n] = fibo(n);
            System.out.println(f[n][0] + " " + f[n][1]);
        }
    }
    public static Integer[] fibo(int n){
        if(f[n][0] == null || f[n][1] == null){
            f[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
            f[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
        }
        return f[n];
    }
}
