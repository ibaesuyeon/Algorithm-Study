import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> num2name = new HashMap<>();
        HashMap<String, Integer> name2num = new HashMap<>();
        for(int i = 0; i<n; i++){
            String name = new StringTokenizer(br.readLine()).nextToken();
            num2name.put(i+1, name);
            name2num.put(name, i+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<m; i++){
            String input = new StringTokenizer(br.readLine()).nextToken();
            if(input.charAt(0)>=49 && input.charAt(0)<=57) {
                sb.append(num2name.get(Integer.parseInt(input)) + "\n");
            }else sb.append(name2num.get(input) + "\n");
        }
        System.out.println(sb);
    }
}
