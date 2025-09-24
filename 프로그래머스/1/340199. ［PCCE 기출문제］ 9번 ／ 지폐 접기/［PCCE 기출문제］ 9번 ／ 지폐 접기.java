import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int wallet_w = Math.max(wallet[0], wallet[1]);
        int wallet_l = Math.min(wallet[0], wallet[1]);
        int bill_w = Math.max(bill[0], bill[1]);
        int bill_l = Math.min(bill[0], bill[1]);
        while(true) {
            if(Math.max(wallet_l, wallet_w) >= Math.max(bill_l, bill_w) && 
               Math.min(wallet_l, wallet_w) >= Math.min(bill_l, bill_w)){
                break;
            } else {
                if(bill_l > bill_w) {
                    bill_l = bill_l/2;
                    answer ++;
                } else if (bill_l<bill_w){
                    bill_w = bill_w/2;
                    answer ++;
                }
            }
        }
        return answer;
    }
}