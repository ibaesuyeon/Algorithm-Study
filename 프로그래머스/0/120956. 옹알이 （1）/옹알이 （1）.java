class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i<babbling.length; i++){
            while(true){
                if(babbling[i].contains("aya")){
                    babbling[i] = babbling[i].replaceFirst("aya", "-");
                } else if(babbling[i].contains("ye")){
                    babbling[i] = babbling[i].replaceFirst("ye", "-");
                } else if(babbling[i].contains("woo")){
                    babbling[i] = babbling[i].replaceFirst("woo", "-");
                } else if(babbling[i].contains("ma")){
                    babbling[i] = babbling[i].replaceFirst("ma", "-");
                } else break; 
            }
            babbling[i] = babbling[i].replaceAll("-", "");
            if(babbling[i].equals("")){
                answer ++;
            }
        }
        return answer;
    }
}