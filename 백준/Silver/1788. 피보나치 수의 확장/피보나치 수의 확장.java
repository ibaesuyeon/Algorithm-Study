import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f[] = new int[1000001];
        f[0] = 0; f[1] = 1;

        if( n > 0)
            System.out.println(1);
        else if (n == 0)
            System.out.println(0);
        else {
            n = -n;
            if (n%2 == 0) {
                System.out.println(-1);
            }
            else {
                System.out.println(1);
            }
        }

        for(int i = 2; i<=n;i++){
            f[i] = (f[i-1] + f[i-2])%1000000000;
        }
        System.out.println(f[n]);
    }
}
