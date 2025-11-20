class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if((int)arr[i] >= 65){
                if(index == 0){
                    arr[i] = Character.toUpperCase(arr[i]);
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);
                }               
            }
            index ++;
            if(arr[i] == ' '){
                index = 0;
            }
            answer += arr[i];
        }
        return answer;
    }
}