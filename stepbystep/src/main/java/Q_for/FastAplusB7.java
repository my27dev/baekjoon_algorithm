package Q_for;

import java.io.*;
import java.util.StringTokenizer;

public class FastAplusB7 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");

//            sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())).append("\n");
        }
        System.out.print(sb);
    }

}
