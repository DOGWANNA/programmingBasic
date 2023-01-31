public class AddDivisor {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 1; //1은 모든 수의 약수이므로 미리 포함
            for (int j = 2; j <= i; j++) {
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt % 2 == 0){
                answer += i;
                System.out.println(answer + "+" + i + " = "+ answer);
            }else{
                answer -= i;
                System.out.println(answer + "-" + i + " = "+ answer);
            }
        }
        return answer;

//        public int solution(int left, int right) {
//            int answer = 0;
//
//            for (int i=left;i<=right;i++) {
//                //제곱수인 경우 약수의 개수가 홀수
//                if (i % Math.sqrt(i) == 0) {
//                    answer -= i;
//                }
//                //제곱수가 아닌 경우 약수의 개수가 짝수
//                else {
//                    answer += i;
//                }
//            }
//
//            return answer;
//        } //제곱수인 경우 약수의 개수가 홀수이다.
    }

    public static void main(String[] args) {
        AddDivisor obj = new AddDivisor();
        int answer = obj.solution(24,27);
        System.out.println(answer);
    }
}
