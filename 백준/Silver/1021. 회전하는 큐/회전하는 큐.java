import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i<=n; i++){
            list.offer(i);
        }

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[m];
        for(int i = 0; i<m; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for(int i = 0; i<m; i++){
            int element = list.indexOf(arr[i]);
            int half_index = 0;
            if(list.size() %2 == 0)
                half_index = list.size()/2-1;
            else half_index = list.size()/2;

            if (element <= half_index) {
                for(int j = 0; j < element; j++) {
                    list.offerLast(list.pollFirst());
                    count++;
                }
            }else {
                for(int j = 0; j < list.size()-element; j++) {
                    list.offerFirst(list.pollLast());
                    count++;
                }
            }
            list.pollFirst();
        }
        System.out.println(count);
    }
}
