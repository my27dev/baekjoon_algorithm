package Q_for;

import java.io.*;

public class PrintN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i =num;i>0;i--){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
