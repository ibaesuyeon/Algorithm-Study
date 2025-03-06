import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i<n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque();
            String word = br.readLine();
            stack.push(word.charAt(0));
            for(int j = 1; j<word.length(); j++){
                if (!stack.isEmpty() && stack.peek().equals(word.charAt(j))){
                    stack.pop();
                } else stack.push(word.charAt(j));
            }
            if (stack.size() == 0)
                sum++;
        }
        System.out.println(sum);
    }
}