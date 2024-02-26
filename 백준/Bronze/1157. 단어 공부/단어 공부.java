import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        int[] alphabets = new int[26];

        for(int i = 0; i<input.length(); i++){
            int alphabet = input.charAt(i);
            alphabets[alphabet-65]++;
        }
        int max = 0;
        int ascii = 63;
        for(int i = 0; i<26; i++){
            if(max < alphabets[i]){
                max = alphabets[i];
                ascii = i+65;
            } else if (max != 0 && max == alphabets[i]){
                ascii = 63;
            }
        }
        System.out.println((char)ascii);
    }
}
