import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();
        int[] alphabets1 = calculate(word1);
        int[] alphabets2 = calculate(word2);

        int res = 0;
        for(int i = 0; i<26; i++){
            res += Math.abs(alphabets1[i] - alphabets2[i]);
        }
        System.out.println(res);
    }
    public static int[] calculate(String word){
        int[] alphabets = new int[26];
        for(int i = 0; i<word.length(); i++){
            alphabets[word.charAt(i)- 'a'] ++;
        }
        return alphabets;
    }
}
