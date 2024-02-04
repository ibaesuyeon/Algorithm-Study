import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double score[] = new double[n];
        for (int i = 0; i<n; i++){
            score[i] = sc.nextDouble();
        }
        double m = Arrays.stream(score).max().getAsDouble();

        double sum = 0;
        for (int i = 0; i<n; i++){
            score[i] = score[i]/m*100;
            sum = sum + score[i];
        }
        System.out.println(sum/n);
    }
}
