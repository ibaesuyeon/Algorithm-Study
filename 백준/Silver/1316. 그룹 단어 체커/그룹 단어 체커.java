import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = n;

        for(int i = 0; i<n; i++){
            String str = br.readLine();

            int prev = 0;
            int[] alp = new int[26];

            for(int j = 0; j<str.length(); j++){
                int now = str.charAt(j);
                if(prev != now){
                    if (alp[now - 97] == 0) {
                        alp[now-97] ++; // 나온 적 없는 숫자면 나왔다고 체크해주기
                        prev = now;
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}