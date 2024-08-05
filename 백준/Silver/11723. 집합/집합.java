import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            String command = st.nextToken();
            Integer x = null;
            if(st.hasMoreTokens())
                x = Integer.parseInt(st.nextToken());
            switch (command) {
                case "add":
                    if (!list.contains(x)) list.add(x);
                    else break;
                    break;
                case "remove":
                    if (list.contains(x)) list.remove(x);
                    else break;
                    break;
                case "check":
                    if (list.contains(x)) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "toggle":
                    if (list.contains(x)) list.remove(x);
                    else list.add(x);
                    break;
                case "all":
                    list = new ArrayList<>();
                    for (int j = 1; j<=20; j++){
                        list.add(j);
                    }
                    break;
                case "empty":
                    list = new ArrayList<>();
                    break;
                default:break;
            }
        }
        System.out.println(sb);
    }
}