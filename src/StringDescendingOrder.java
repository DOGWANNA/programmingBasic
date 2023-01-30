import java.util.Arrays;
import java.util.Collections;

public class StringDescendingOrder {
    public String solution(String s) {
        String[] strArr = s.split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            str.append(strArr[i]);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringDescendingOrder obj = new StringDescendingOrder();
        String answer = obj.solution("Zbcdefg");
        System.out.println(answer);
    }

}
