import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String[] std_num = new String[num];

        for(int i = 0; i < num; i++){
            std_num[i] = br.readLine();
        }
        int num_length = std_num[0].length();
        HashSet<String> set = new HashSet<>();

        for(int j = 1; j<=num_length; j++){
            for(int i = 0; i<num; i++){
                set.add(std_num[i].substring(num_length-j));
            }
            if(set.size() == num){
                System.out.println(j);
                break;
            }
            set.clear();
        }
    }
}
