import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = 0;
        HashMap<String, ArrayList<String>> map_team_member = new HashMap<>();
        HashMap<String, String> map_member_team = new HashMap<>();
        for(int i = 0; i<n; i++){
            ArrayList<String> members = new ArrayList<>();
            String team = br.readLine();
            x = Integer.parseInt(br.readLine());
            for(int j = 0; j<x; j++){
                String member = br.readLine();
                members.add(member);
                map_member_team.put(member, team);
            }
            map_team_member.put(team, members);
        }
        for(int i = 0; i<m; i++){
            String input = br.readLine();
            String type = br.readLine();

            if(type.equals("0")){
                ArrayList<String> list = map_team_member.get(input);
                Collections.sort(list);
                for(int j = 0; j<list.size(); j++) {
                    sb.append(list.get(j)).append("\n");
                }
                list.clear();
            }else if (type.equals("1")){
                sb.append(map_member_team.get(input)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
