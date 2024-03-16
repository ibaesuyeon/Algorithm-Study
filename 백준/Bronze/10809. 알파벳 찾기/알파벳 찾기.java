import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] alphabets = new int[26];
        for(int i = 0; i<26; i++){
            alphabets[i] = -1; //초기화
        }

        for(int i = 0; i<s.length(); i++){
            for(int j = 0; j<26; j++){
                if(alphabets[j] == -1 && s.charAt(i) == (char)(j+65)){
                    alphabets[j] = i;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<26; i++){
            sb.append(alphabets[i]).append(" ");
        }
        System.out.println(sb);
    }
}
