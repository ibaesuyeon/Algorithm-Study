class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int w = 3; int h = 3;
        // w * h = brown + yellow
        // yellow = (w-2) * (h-2)
        for(w = 3; w<=brown/2; w++){
            h = (brown + yellow) / w;
            if(w >= h){
                if((w * h == brown + yellow)
                  && (yellow == (w-2)*(h-2))) {
                    answer[0] = w;
                    answer[1] = h;
                    break;                    
                } 
            }
        }
        return answer;
    }
}