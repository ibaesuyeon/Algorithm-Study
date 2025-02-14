import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<n; i++){
            String[] command = br.readLine().split(" ");
            switch (command[0]){
                case "1":
                    stack.addLast(Integer.parseInt(command[1]));
                    break;
                case "2":
                    if (stack.isEmpty())
                        sb.append(-1+"\n");
                    else sb.append((stack.removeLast())+"\n");
                    break;
                case "3":
                    sb.append((stack.size())+"\n");
                    break;
                case "4":
                    if (stack.isEmpty())
                        sb.append((1)+"\n");
                    else sb.append((0)+"\n");
                    break;
                case "5":
                    if (stack.isEmpty())
                        sb.append((-1)+"\n");
                    else sb.append((stack.getLast())+"\n");
                    break;
                default: break;
            }
        }
        System.out.println(sb);
    }
}