class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != ' '){
                int ascii = 0;
                if(Character.isUpperCase(arr[i])){
                    ascii = (int)(arr[i] - 'A');
                    ascii += n;
                    if(ascii >= 26){
                        ascii -= 26; //알파벳 개수만큼 빼기
                    }
                    arr[i] = (char)(ascii+'A');

                } else {
                    ascii = (int)(arr[i] - 'a');
                    ascii += n;
                    if(ascii >= 26){ 
                        ascii -= 26; //알파벳 개수만큼 빼기
                    }
                    arr[i] = (char)(ascii+'a');
                }
            }
        }
        for (char c : arr) {
            answer += c;
        }
        return answer;
    }
}