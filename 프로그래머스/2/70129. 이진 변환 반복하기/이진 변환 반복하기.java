class Solution {
    public int[] solution(String s) {
        int convert_count = 0;
        int remove_count = 0;
        String str = s;
        while(true) {
            String[] ss = str.split("");
            for(int i = 0; i<ss.length; i++){
                if(ss[i].equals("0")){
                    remove_count ++;
                }
            }
            str = str.replaceAll("0", "");
            str = Integer.toBinaryString(str.length());
            convert_count ++;
            if(str.equals("1")) {
                break;
            }
        }
        int[] answer = {convert_count, remove_count};
        return answer;
    }
}