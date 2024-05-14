import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[3];
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            if(arr[0] == 0) break;
            System.out.println(triangle(arr));
        }
    }
    public static String triangle(Integer[] arr) {
        Arrays.sort(arr);
        //삼각형이 아닌 경우
        //가장 긴 변의 길이 < 나머지 두 변의 길이의 합 --> 삼각형임
        //가장 긴 변의 길이 >= 나머지 두 변의 길이의 합 --> 삼각형이 아님
        if(arr[2] >= (arr[0] + arr[1]))
            return "Invalid";
        else if (arr[0].equals(arr[1]) && arr[1].equals(arr[2]))
            return "Equilateral";
        else if (arr[0].equals(arr[1]) || arr[1].equals(arr[2]) || arr[0].equals(arr[2]))
            return "Isosceles";
        else return "Scalene";
    }
}