import java.util.ArrayList;
import java.util.Arrays;

public class NthNumber {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            int from = commands[i][0];
            int to = commands[i][1];
            int n = commands[i][2];

            System.out.println(from + "," + to + "," + n);
            int[] arr = Arrays.copyOfRange(array, from-1, to);
            Arrays.sort(arr);
            intArr.add(arr[n-1]);
        }
        int[] answer = new int[intArr.size()];

        for (int i = 0; i < intArr.size(); i++) {
            answer[i] = intArr.get(i);
        }
        return answer;
    }
    // 굳이 Arr안써도 배열의 길이가 고정되어있기 때문에 코드를 더 짧게 할 수 있었다.
    public static void main(String[] args) {
        NthNumber obj = new NthNumber();
        int[] answer = obj.solution(new int[]{1,5,2,6,3,7,4},new int[][]{{2,5,3},{4,4,1},{1,7,3}});
        System.out.println(Arrays.toString(answer));
    }
}
