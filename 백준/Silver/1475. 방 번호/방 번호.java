import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String room_num = br.readLine();
        int[] nums = new int[9];
        for (int i = 0; i < room_num.length(); i++) {
            int num = room_num.charAt(i) - '0';
            if (num == 9) nums[6]++;
            else nums[num]++;
        }
        nums[6] = nums[6]/2 + nums[6]%2;
        Arrays.sort(nums);
        System.out.println(nums[8]);
    }
}