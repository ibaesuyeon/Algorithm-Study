import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int res = 0;
        while(true){
            if (input.contains("c=")){
                input = input.replaceFirst("c=","-");
                res++;
            } else if (input.contains("c-")){
                input = input.replaceFirst("c-","-");
                res++;
            } else if (input.contains("dz=")){
                input = input.replaceFirst("dz=","-");
                res++;
            } else if (input.contains("d-")){
                input = input.replaceFirst("d-","-");
                res++;
            } else if (input.contains("lj")){
                input = input.replaceFirst("lj","-");
                res++;
            } else if (input.contains("nj")){
                input = input.replaceFirst("nj","-");
                res++;
            } else if (input.contains("s=")){
                input = input.replaceFirst("s=","-");
                res++;
            } else if (input.contains("z=")){
                input = input.replaceFirst("z=","-");
                res++;
            } else {
                break;
            }
        }
        input = input.replaceAll("-", "");
        res += input.length();
        System.out.println(res);
    }
}