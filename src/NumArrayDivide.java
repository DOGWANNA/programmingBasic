import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumArrayDivide {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
                cnt++;

            }
        }
        int[] answer = new int[list.size()];
        if(cnt == 0){
            return new int[]{-1};
        }else{

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        NumArrayDivide obj = new NumArrayDivide();
        int[] answer = obj.solution(new int[]{3,2,6}, 10);
        System.out.println(Arrays.toString(answer));
    }
}
