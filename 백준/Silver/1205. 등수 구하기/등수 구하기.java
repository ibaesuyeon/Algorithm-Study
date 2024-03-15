import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int taesu = sc.nextInt();
        int p = sc.nextInt();

        int[] rank_list = new int[n];
        for(int i = 0; i<n; i++){
            rank_list[i] = sc.nextInt();
        }
        int rank = 1;
        if(n==p && rank_list[rank_list.length-1] >=taesu)
            System.out.println(-1);
        else {
            for (int i = 0; i < rank_list.length; i++) {
                if (taesu < rank_list[i])
                    rank++;
                else break;
            }
            System.out.println(rank);
        }
    }
}
