import java.util.Arrays;

public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        String[] strArr = dartResult.split("^[0-10]*$");
        System.out.println(Arrays.toString(strArr));
        return answer;
    }

    public static void main(String[] args) {
        DartGame obj = new DartGame();
        obj.solution("1S2D*3T");
    }
}
