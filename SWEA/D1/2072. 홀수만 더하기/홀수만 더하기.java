import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int sum = 0;
            for(int j = 0; j<10; j++){
                int num = sc.nextInt();
                if (num%2 != 0){
                    sum += num;
                }
            }
            sb.append("#").append(test_case).append(" ").append(sum).append("\n");
        }
        System.out.println(sb);
	}
}