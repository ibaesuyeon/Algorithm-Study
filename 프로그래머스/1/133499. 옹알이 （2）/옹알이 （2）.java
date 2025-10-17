class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canBabble = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i<babbling.length; i++){
            for(int j = 0; j<canBabble.length; j++){
                
                if(babbling[i].contains(canBabble[j]+canBabble[j])){
                    break;
                }
                babbling[i] = babbling[i].replaceAll(canBabble[j], "-");
            }
            
            if(babbling[i].replaceAll("-","").equals("")){
               answer ++; 
            }
        }
        return answer;
    }
}