class Solution {
    static int iOp_start = 0;
    static int iOp_end = 0;
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int iVideo_len = Integer.parseInt(video_len.split(":")[0])*60 + Integer.parseInt(video_len.split(":")[1]);
        int iPos = Integer.parseInt(pos.split(":")[0])*60 + Integer.parseInt(pos.split(":")[1]);
        iOp_start = Integer.parseInt(op_start.split(":")[0])*60 + Integer.parseInt(op_start.split(":")[1]);
        iOp_end = Integer.parseInt(op_end.split(":")[0])*60 + Integer.parseInt(op_end.split(":")[1]);
        
        iPos = skipOpening(iPos);
        // next or prev
        for(int i = 0; i<commands.length; i++){
            if(commands[i].equals("next")){
                iPos += 10;
                if(iPos > iVideo_len){
                    iPos = iVideo_len;
                }
            } else if(commands[i].equals("prev")) {
                iPos -= 10;
                if(iPos < 0){
                    iPos = 0;
                }
            }
            iPos = skipOpening(iPos);
        }
        // formatting
        int iM = iPos/60;
        int iS = iPos%60;
        String sM = "";
        String sS = ""; 
        
        if (iM<10){
            sM = "0" + Integer.toString(iM);
        } else if (iM>=10){
            sM = Integer.toString(iM);
        }
        
        if (iS<10){
            sS = "0" + Integer.toString(iS);
        } else if (iS>=10){
            sS = Integer.toString(iS);
        }

        answer = sM + ":" + sS;
        return answer;
    }
    public int skipOpening(int iPos) {
        // 오프닝 건너뛰기
        if(iPos >= iOp_start && iPos <= iOp_end) {
            iPos = iOp_end;
        }
        return iPos;
    }
}