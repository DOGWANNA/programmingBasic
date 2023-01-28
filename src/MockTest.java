import java.util.ArrayList;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : answers){
            list.add(i);
        }
        int[] pattern1 = {1,2,3,4,5};
        int[] pattern2 = {2,1,2,3,2,4,2,5};
        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};

        //패턴 별로 정답 개수에 해당하는 변수를 어떻게 할당할 것인가???
        for (int i = 0; i < list.size(); i++) {
            list.get(i)
        }
        //정답 갯수 별로 answer에 넣어야하는 개수가 다르다. 어떻게??

        return answer;
    }
    public static void main(String[] args) {
        MockTest obj = new MockTest();
        int[] answer = obj.solution(new int[]{1,2,3,4,5});
    }
}
