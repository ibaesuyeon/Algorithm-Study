import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            String cheese = st.nextToken();
            if (cheese.endsWith("Cheese"))
                set.add(cheese);
        }
        if (set.size() >= 4)
            System.out.println("yummy");
        else System.out.println("sad");
    }
}