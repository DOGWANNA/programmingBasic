import java.util.Arrays;

public class FindPrimeNum {
//    public int solution(int n) {
//        int answer = 0;
//        for (int i = 2; i <= n; i++) {
//            boolean flag = true;
//            for (int j = 2; j < Math.sqrt(i); j++) { //sqrt의 의미?? 소수인지 판별할 자연수의 제곱근을 기준으로 그 숫자의 약수들의 곱셈은 대칭적으로 곱셈이 일어나기 때문
//                if (i % j == 0) {
//                    System.out.println(Math.sqrt(i));
//                    flag = false;
//                    break;
//                }
//                if (flag) {
//                    answer++;
//                }
//            }
//        }
//        return answer;
//    }

    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i + i; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = 2; i < arr.length; i++) { // 소수에 0과 1은 포함되지 않기때문에 제외한다.
            if(arr[i]==1){
                answer++;
            }
        }
        return answer;
    }
    //        에라토스테네스의 체. 소수가 되는 수의 배수를 지우면 남은 건 소수뿐. 소수는 배수가 아니다.
    //        제곱근을 이용하는 방법.. Math.sqrt()

    public static void main(String[] args) {
        FindPrimeNum obj = new FindPrimeNum();
        int answer = obj.solution(10);
        System.out.println(answer);
    }
}
