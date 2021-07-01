package Q_for;

import java.io.*;

public class Gugudan {
    //baekjoon은 클래스명을 Main으로 수정해야 함
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<10; i++) {
            sb.append(n).append(" * ").append(i).append(" = ").append(n*i).append("\n");
        }

        System.out.print(sb);
    }
}
