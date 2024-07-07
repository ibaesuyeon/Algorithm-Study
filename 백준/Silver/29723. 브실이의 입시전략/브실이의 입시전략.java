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
        int k = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            Integer getting_score = Integer.parseInt(st.nextToken());

            map.put(name, getting_score);
        }

        int score = 0;
        for(int i = 0; i<k; i++){
            String lecture = br.readLine();
            score+= map.get(lecture);
            map.remove(lecture);
            m--;
        }

        List<String> keySet = new ArrayList<>(map.keySet());

        //get min
        int min = score;
        keySet.sort(new Comparator<String>() {
            @Override //오름차순
            public int compare(String o1, String o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });
        for(int i = 0; i<m; i++){
            min += map.get(keySet.toArray()[i]);
        }

        //get max
        int max = score;
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        for(int i = 0; i<m; i++){
            max += map.get(keySet.toArray()[i]);
        }
        System.out.println(min + " " + max);

    }
}