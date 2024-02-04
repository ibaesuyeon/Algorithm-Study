import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = sc.nextInt();
        int sum = H * 60 + M + time;
        int resH = (sum/60)%24;
        int resM = sum%60;         
        System.out.println( resH + " " + resM);
    }
}