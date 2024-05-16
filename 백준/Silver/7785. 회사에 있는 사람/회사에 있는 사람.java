import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String>  map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if(state.equals("enter")) {
                map.put(name, state);
            } else {
                map.remove(name);
            }
        }
        ArrayList list = new ArrayList();
        for(Map.Entry entry : map.entrySet()){
            list.add(entry.getKey());
        }
        list.sort(Comparator.reverseOrder());
        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}