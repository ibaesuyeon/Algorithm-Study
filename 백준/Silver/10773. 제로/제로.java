import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<k; i++){
            int input = Integer.parseInt(br.readLine());
            if(input != 0)
                stack.push(input);
            else
                stack.pop();
        }
        int res = 0;
        for(int s :stack){
            res+= s;
        }
        System.out.println(res);
    }
}