package lecture2;

import java.util.Scanner;

// 임시반장 정하기
// ** 같은 반이었던 횟수가 아닌 학생 수!
public class Problem11 {
    public int solution(int n, int[][] students) {
        int answer = 0; int max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++) {
            int cnt = 0;
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= 5; k++) {
                    // 같은 반의 학생이 있다면 cnt 값을 올리고 break
                    if(students[i][k] == students[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem11 T = new Problem11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
