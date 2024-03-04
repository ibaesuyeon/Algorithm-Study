import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long sum = 0;
        long count = 1;
        for(int i = 1; ; i++){
            sum = sum + i;
            if (sum > s)
                break;
            count++;
        }
        System.out.println(count-1);
    }
}
