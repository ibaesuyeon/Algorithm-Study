import java.util.*;
import java.time.*;

class Solution {
    public String solution(int a, int b) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "MON");
        map.put(2, "TUE");
        map.put(3, "WED");
        map.put(4, "THU");
        map.put(5, "FRI");
        map.put(6, "SAT");
        map.put(7, "SUN");
        LocalDate date = LocalDate.of(2016,a,b);
        int day = date.getDayOfWeek().getValue();
        return map.get(day);    
    }
}