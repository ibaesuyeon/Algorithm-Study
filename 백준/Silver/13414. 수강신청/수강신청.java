import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int limit = Integer.parseInt(st.nextToken());
        int input = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(int i = 0; i<input; i++){
            String student = br.readLine();
            if (set.contains(student)){
                set.remove(student);
            }
            set.add(student);

        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            limit--;
            if (limit == 0)  break;
        }
    }
}