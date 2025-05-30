import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
            int sum = 0;
            
            for(int num = 1; num<=n; num++) {
            	if(num%2 == 0) {
                    sum -= num;
                } else {
                    sum += num;
                }
            }
            sb.append("#").append(test_case).append(" ").append(sum).append("\n");           
		}
        System.out.println(sb);
	}
}