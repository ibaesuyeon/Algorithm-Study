import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char before = str.charAt(0);
        int count = 0;
        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) != before) {
                count++;
                before = str.charAt(i);
            }
        }
        if (count == 0 )
            System.out.println(0);
        else if (count == 1 || count == 2)
            System.out.println(1);
        else System.out.println(count/2 + count%2);
    }
}