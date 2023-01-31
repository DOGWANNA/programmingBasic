public class SumOfDivisor {
    public int solution(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i == 0){
                answer += i;
            };
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfDivisor obj = new SumOfDivisor();
        int answer = obj.solution(12);
        System.out.println(answer);
    }
}
