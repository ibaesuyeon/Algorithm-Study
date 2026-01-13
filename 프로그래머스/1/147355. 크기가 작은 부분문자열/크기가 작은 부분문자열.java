class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int p_len = p.length();
        for(int i = 0; i< t.length() - p_len +1; i++){
            String subT = t.substring(i, i + p_len);
            if(Long.parseLong(subT) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}