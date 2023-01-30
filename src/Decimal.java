import java.util.ArrayList;

public class Decimal {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    for(int l=2; l < sum ; l++){
                        if(sum%l == 0){
                            //더해진 수 전까지 나누어 떨어진다면 소수가 아니므로 for문 정지
                            break;
                        }
                        if(l == sum-1){
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Decimal obj = new Decimal();
        int answer = obj.solution(new int[]{1,2,7,6,4});
        System.out.println(answer);
    }
}
