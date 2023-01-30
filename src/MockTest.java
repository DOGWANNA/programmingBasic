import java.util.ArrayList;
import java.util.Arrays;

public class MockTest {
    public int[] solution(int[] answers) {
        // answer에 i값 바꾸는 식을 주어서
        ArrayList<Integer> list = new ArrayList<>();
        int[] pattern1 = {1,2,3,4,5};
        int[] pattern2 = {2,1,2,3,2,4,2,5};
        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == pattern1[i % pattern1.length]){
                cnt[0]++;
            }
            if(answers[i] == pattern2[i % pattern2.length]){
                cnt[1]++;
            }
            if(answers[i] == pattern3[i % pattern3.length]){
                cnt[2]++;
            }
        }
        int max = cnt[0];
        if(cnt[1] > max){max = cnt[1];}
        if(cnt[2] > max){max = cnt[2];}
//        int max = Math.max(Math.max(cnt[0] ,cnt[1]),cnt[2]);


        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] == max){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        MockTest obj = new MockTest();
        int[] answer = obj.solution(new int[]{1,3,2,4,2});
        System.out.println(Arrays.toString(answer));

    }
}
