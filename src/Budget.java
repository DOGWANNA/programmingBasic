import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if(budget < 0){
                break;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Budget obj = new Budget();
        int answer = obj.solution(new int[]{1,3,2,5,4}, 9);
        System.out.println(answer);
    }
}
