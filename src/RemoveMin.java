import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMin {

    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(arr.length > 1){
            // 길이가 1이 아니면, 최솟값 뽑아내기
            // 최솟값이 있는만큼 배열의 길이 차감함
            // 최솟값이 아니면 list에 add. (배열의 길이가 몇일지 모르기때문에 list 사용)
            // list에 있는 것을 answer에 복사
            int[] clone = arr.clone();
            Arrays.sort(clone);
            min = clone[0];
            int length = arr.length;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==min){
                    length--;
                    continue;
                }
                list.add(arr[i]);
            }
            answer = new int[length];
            for(int i = 0; i < length; i++){
                answer[i] = list.get(i);
            }

        }else{
            answer = new int[]{-1};
        }
        return answer;
    }
    public static void main(String[] args) {
        RemoveMin obj = new RemoveMin();
        int[] answer = obj.solution(new int[]{4,3,2,1});
        System.out.println(Arrays.toString(answer));
    }
}
