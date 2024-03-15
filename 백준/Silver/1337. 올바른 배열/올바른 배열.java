import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        ArrayList<Integer> max = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int count = 0;
            if(list.contains(list.get(i))) count++;
            if(list.contains(list.get(i)+1)) count++;
            if(list.contains(list.get(i)+2)) count++;
            if(list.contains(list.get(i)+3)) count++;
            if(list.contains(list.get(i)+4)) count++;
            max.add(count);
        }
        Collections.sort(max, Collections.reverseOrder());
        System.out.println(5-max.get(0));
    }
}
