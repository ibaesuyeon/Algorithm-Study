import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rooms = new int[n];
        for(int i = 0; i<n; i++){
            rooms[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        long sum = n;
        for(int i = 0; i<n; i++){
            int neededSubD = 0;
            if((rooms[i] - b)>0){
                if ((rooms[i]-b)%c != 0){
                    neededSubD = (rooms[i]-b)/c + 1;
                }else neededSubD = (rooms[i]-b)/c;
                sum += neededSubD;
            }
        }
        System.out.println(sum);
    }
}