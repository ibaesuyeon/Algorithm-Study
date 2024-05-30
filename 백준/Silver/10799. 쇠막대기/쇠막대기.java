import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0; int res = 0;
        char prev = '0';
        for(int i = 0; i<input.length(); i++ ){
            char c = input.charAt(i);
            if (c == '('){ // case 1
                count ++;
            }
            else if (c == ')') {
                if (prev == '(') { // case 2 (레이저)
                    count--;
                    res+= count;
                }
                else { // case 3 (막대의 끝)
                    res++;
                    count--;
                }
            }
            prev = c; // 조건문 검증이 끝난 후 저장해주어야 함
        }
        System.out.println(res);
    }
}