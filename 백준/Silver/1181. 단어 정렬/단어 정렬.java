import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        for(int i =0 ; i<n; i++){
            set.add(br.readLine());
        }
        String arr[] = new String[set.size()];
        set.toArray(arr);
        Arrays.sort(arr, (o1, o2) -> {
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }else{
                return o1.length()-o2.length();
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
