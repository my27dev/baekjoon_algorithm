package Q_for;

import java.io.*;
import java.util.StringTokenizer;

public class FastAplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
           sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }
        System.out.println(sb);
    }
}
