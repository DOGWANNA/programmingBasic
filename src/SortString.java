import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortString {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add((strings[i].charAt(n)+"")+strings[i]);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1,list.get(i).length());
        }
        return answer;
    }
    public static void main(String[] args) {
        SortString obj = new SortString();
        String[] answer = obj.solution(new String[]{"sun", "bed", "car"}, 1);
        System.out.println(Arrays.toString(answer));
    }

}
