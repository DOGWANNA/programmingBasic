import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddTwoNum {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if(i==j){
                    continue;
                }
                if(!(list.contains(tmp + numbers[j]))){
                    System.out.println(tmp + numbers[j]);
                    list.add(tmp + numbers[j]);
                }
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        AddTwoNum obj = new AddTwoNum();
        int[] answer = obj.solution(new int[]{2,1,3,4,1});
        System.out.println(Arrays.toString(answer));
    }
}
