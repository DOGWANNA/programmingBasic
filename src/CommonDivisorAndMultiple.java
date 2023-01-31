import java.util.Arrays;

public class CommonDivisorAndMultiple {
    public int[] solution(int n, int m) {
        // 최대공약수 산출 후 최소공배수 계산
        int max = Math.max(n,m);
        int min = Math.min(n,m);

        while(min != 0){
            //유클리드 호제법 > 최대공약수 산출
            // a를 b로 나눈 나머지를 r이라 하면, a, b의 최대공약수는 b와 r의 최대공약수와 같다. (단 a > b)
            int r = max % min;
            max = min;
            min = r;
        }
        int multi = n * m / max;   // 최소 공배수 = 두수의 곱 / 최대공약수
        int answer[] = {max, multi};
        return answer;
    }
    public static void main(String[] args) {
        CommonDivisorAndMultiple obj = new CommonDivisorAndMultiple();
        int[] answer = obj.solution(2,5);
        System.out.println(Arrays.toString(answer));
    }
}
