import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        map.put("R", 0); map.put("T", 0);
        map.put("C", 0); map.put("F", 0);
        map.put("J", 0); map.put("M", 0);
        map.put("A", 0); map.put("N", 0);
        
        for(int i = 0; i<survey.length; i++){
            String[] type = survey[i].split("");
        
            switch(choices[i]){
                case 1 :
                    map.put(type[0], map.get(type[0]) + 3); break;
                case 2 :
                    map.put(type[0], map.get(type[0]) + 2); break;
                case 3 :
                    map.put(type[0], map.get(type[0]) + 1); break;
                case 4 : break;
                case 5 :
                    map.put(type[1], map.get(type[1]) + 1); break;
                case 6 :
                    map.put(type[1], map.get(type[1]) + 2); break;
                case 7 :
                    map.put(type[1], map.get(type[1]) + 3); break;
                default : break;
            }
        }
        if(map.get("R") < map.get("T")){
            answer+= "T";    
        } else answer += "R"; 

        if(map.get("C") < map.get("F")){
            answer+= "F";    
        } else answer += "C"; 

        if(map.get("J") < map.get("M")){
            answer+= "M";    
        } else answer += "J"; 

        if(map.get("A") < map.get("N")){
            answer+= "N";    
        } else answer += "A"; 
        
        return answer;
    }
}