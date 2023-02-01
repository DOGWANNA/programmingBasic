import java.util.Arrays;
import java.util.Collections;

public class BaekJun5585 {
    int solution(int[] m, int money){
        Integer[] conv = Arrays.stream(m).boxed().toArray(Integer[]::new);
        Arrays.sort(conv,Collections.reverseOrder());
        int changes = 1000 - money;
        int coin = 0;
        for(int i : m){
            while (changes - i >= 0){
                changes -= i;
                coin++;
                System.out.println(changes);
            }
        }
        return coin;
    }

    public static void main(String[] args) {
        BaekJun5585 obj = new BaekJun5585();
        int answer = obj.solution(new int[]{500,100,50,10,5,1}, 380);
        System.out.println(answer);
    }
}
