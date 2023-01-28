import java.util.ArrayList;
import java.util.Arrays;

public class IHateRowNum {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);

        for(int i=1; i < arr.length; i++){
            if(arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    // 초기 값이 0이여서 첫 값이 일 경우 다룰 수 없다. 초기값을 어떻게 설정하여 배열의 범위를 벗어나지 않을 것인지 알아야함.

    public static void main(String[] args) {
        IHateRowNum obj = new IHateRowNum();
        int[] answer = obj.solution(new int[]{0,0,1,0,0,1,0});
        System.out.println(Arrays.toString(answer));
    }
}
