import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            String[] input = br.readLine().split(" ");
            if (input[1].equals("enter")){
                map.put(input[0], input[1]);
            } else if(input[1].equals("leave") || map.containsKey(input[0]))
                map.remove(input[0]);
        }
        StringBuilder sb = new StringBuilder();
        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort(Collections.reverseOrder());
        for(String key : keySet){
            sb.append(key).append("\n");
        }
        System.out.println(sb);
    }
}