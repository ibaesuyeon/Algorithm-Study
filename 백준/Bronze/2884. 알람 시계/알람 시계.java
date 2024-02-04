import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int sumM = (H*60)+M;
        int res;

        if(sumM >= 45){
            res = ((H*60)+M) -45;
        }else{
            res = ((H*60)+M+1440) -45;
        }
        System.out.println(res/60 + " " + res%60);
    }
}