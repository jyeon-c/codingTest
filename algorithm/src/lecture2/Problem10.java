package lecture2;

import java.util.Scanner;

// 봉우리
public class Problem10 {
    public int solution(int[][] inputs) {
        int answer = 0;

        for(int i = 0; i < inputs.length; i++) {
            for(int j = 0; j < inputs.length; j++) {
                if(i != 0 && j != 0 && i != inputs.length -1 && j != inputs.length - 1) {
                    int temp = inputs[i][j];
                    if(inputs[i-1][j] < temp && inputs[i+1][j] < temp && inputs[i][j-1] < temp && inputs[i][j+1] < temp) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem10 T = new Problem10();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] inputs = new int[N+2][N+2];

        for(int i = 0; i < inputs.length; i++) {
            for(int j = 0; j < inputs.length; j++) {
                if(i == 0 || j == 0 || i == inputs.length -1 || j == inputs.length - 1) {
                    inputs[i][j] = 0;
                } else {
                    inputs[i][j] = sc.nextInt();
                }
            }
        }
        System.out.println(T.solution(inputs));
    }
}
