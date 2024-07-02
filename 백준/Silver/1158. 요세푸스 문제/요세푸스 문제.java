import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i<=n; i++){
            list.add(i); //index는 0부터 시작
        }

        Queue<Integer> res = new LinkedList<>();
        int index = 0;
        while(!list.isEmpty()) {
            index = (index+k-1)%list.size();
            res.add(list.remove(index));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i<n-1; i++){
            sb.append(res.remove()).append(", ");
        }
        sb.append(res.remove()).append(">");
        System.out.println(sb);
    }
}