import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 1; i<=n; i++){
            list.add(i);
        }
        int index = 0;
        while(list.size() > 1){
            index = (index + (k - 1)) % list.size();
            sb.append(list.remove(index)).append(", ");
        }
        sb.append(list.remove()).append(">");
        System.out.println(sb);
    }
}
