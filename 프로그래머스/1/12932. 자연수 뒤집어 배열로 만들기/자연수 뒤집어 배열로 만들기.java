class Solution {
    public long[] solution(long n) {
        String str = Long.toString(n);
        long[] answer = new long[str.length()];
        String[] strArr = str.split("");
        for(int i = 0; i<strArr.length; i++){
            answer[i] = Long.parseLong(strArr[strArr.length-i-1]);
        }
        return answer;
    }
}