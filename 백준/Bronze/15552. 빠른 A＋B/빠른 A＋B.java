import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int A, B;

        for(int i = 0; i<T; i++){
            String[] nums = br.readLine().split(" ");
            A = Integer.parseInt(nums[0]);
            B = Integer.parseInt(nums[1]);
            bw.write((A + B) +"\n");
        }
        bw.flush();
        bw.close();
    }
}