import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] str = st.nextToken().split("\\.");
            map.put(str[1], map.getOrDefault(str[1], 0)+1);
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        for (String key : keySet){
            System.out.println(key + " " + map.get(key));
        }
    }
}