class Solution {
    public long solution(long n) {
        boolean b = false;
        for(long i = 1; i<=n; i++){
            if(n/i == i && n%i == 0){
                b = true;
                return (i+1)*(i+1);
            }
        }
        return -1; 
    }
}