import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int count = 0;
        for(int i = 1; i<=Integer.parseInt(n); i++){
            int num = i;
            if (num/10 == 0) count++; //num이 한 자릿수
            else if (num/100 == 0) count++; //num이 두자릿수
            else { //num이 세자릿수 //어차피 1000은 한수가 아님
                int first = num/100;
                int second = num%100/10;
                int third = num%10;
                if (first-second == second-third){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}