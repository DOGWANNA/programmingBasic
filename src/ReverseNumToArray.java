import java.util.Arrays;

public class ReverseNumToArray {
    public int[] solution(long n){
        String str = String.valueOf(n);

        int[] answer = new int[str.length()];
        int count = str.length();
        for(int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(count - 1) - '0';
            count--;
        }

        return answer;
    }


    public static void main(String[] args) {
        ReverseNumToArray obj = new ReverseNumToArray();
        int[] answer = obj.solution(12345);
        System.out.println(Arrays.toString(answer));

    }
}
