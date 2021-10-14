package Q_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareX {
    public static void main(String[] args) throws IOException {

        //buffer로 입력값 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //공백이 있는 경우 토큰으로 구분하여 가져옴
        StringTokenizer st = new StringTokenizer(br.readLine());

//       첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        System.out.println("n : "+ n + " x : " + x);

        // 이후에 입력되는 값에 따라 출력할 문자를 저장해두기 위해 스트링빌더 객체 생성
        StringBuilder sb = new StringBuilder();

       //다음줄 출력을 인식을 위해 token 한번더 생성?
        st = new StringTokenizer(br.readLine());

        for(int i =0; i<n; i++){

            int now = Integer.parseInt(st.nextToken());

            if(now < x)
                sb.append(now).append(" ");

        }
        System.out.println(sb.delete(sb.length()-1,sb.length()));

    }
}
