import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        double a = B % 10;
        double b = Math.floor((B%100)/10);
        double c = Math.floor(B/100);

        System.out.println((int)a*A);
        System.out.println((int)b*A);
        System.out.println((int)c*A);
        System.out.println(A*B);
    }
}