import java.util.Arrays;
import java.util.Collections;

public class Descending {
    public long solution(long n) {
        String s = n + "";
        String [] strArr = s.split("");
        Arrays.sort(strArr,Collections.reverseOrder());
        String str = String.join("",strArr);
        return Long.parseLong(str);
    }
    public long solution2(long n) {
        long answer = 0;
        String[] strArr = (n + "").split("");
        Integer[] intArr = new Integer[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(intArr, Collections.reverseOrder());
        String s = Arrays.toString(intArr).replace("[","").replace("]","").replace(",","").replace(" ", "");

        return Long.parseLong(s);
    }
    public static void main(String[] args) {
        Descending obj = new Descending();
        long answer = obj.solution(118372);
        System.out.println(answer);
    }
}
