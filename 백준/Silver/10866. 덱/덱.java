import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static LinkedList<Integer> deque = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[] instruction;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            instruction = new String[2];
            instruction[0] = st.nextToken();
            if(st.hasMoreTokens()) {
                instruction[1] = st.nextToken();
            }
            instruct(instruction);
        }
        System.out.println(sb);
    }
    public static void instruct(String[] instruction){
        if(instruction[0].equals("push_front")){
            deque.addFirst(Integer.parseInt(instruction[1]));
        }else if(instruction[0].equals("push_back")){
            deque.addLast(Integer.parseInt(instruction[1]));
        }else if(instruction[0].equals("pop_front")){
            if(!deque.isEmpty())
                sb.append(deque.pollFirst() + "\n");
            else sb.append(-1 + "\n");
        }else if(instruction[0].equals("pop_back")){
            if(!deque.isEmpty())
                sb.append(deque.pollLast() + "\n");
            else sb.append(-1 + "\n");
        }else if(instruction[0].equals("size")){
            sb.append(deque.size() +"\n");
        }else if(instruction[0].equals("empty")){
            if(deque.isEmpty())
                sb.append(1 + "\n");
            else sb.append(0 + "\n");
        }else if(instruction[0].equals("front")){
            if(!deque.isEmpty())
                sb.append(deque.getFirst() + "\n");
            else sb.append(-1 + "\n");
        }else if(instruction[0].equals("back")){
            if(!deque.isEmpty())
                sb.append(deque.getLast() + "\n");
            else sb.append(-1 + "\n");
        }
    }
}
