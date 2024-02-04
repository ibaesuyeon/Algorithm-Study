import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time[] = new int[n];
        int y_price = 0 ; int m_price = 0;
        for(int i = 0; i<n; i++){
            time[i] = sc.nextInt();
            y_price = y_price + ((time[i]/30)+1)*10;
            m_price = m_price + ((time[i]/60)+1)*15;
        }

        if(m_price < y_price)
            System.out.println("M " + m_price);
        if(m_price > y_price)
            System.out.println("Y " + y_price);
        if(m_price == y_price)
            System.out.println("Y M " + m_price);
    }
}