import java.util.ArrayList;
import java.util.Arrays;

public class RankingOfLotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> winList = new ArrayList<>();
        for (int i : win_nums){
            winList.add(i);
        }
        int maxRank = 0;
        int minRank = 0;
        int cnt = 0;
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if(winList.contains(lottos[i])){
                cnt++;
            }
            if(lottos[i]==0){
                zero++;
            }
        }

        maxRank = cnt + zero == 6 ? 1 :
                (cnt + zero == 5) ? 2 : (cnt + zero == 4) ? 3 : (cnt + zero == 3) ? 4 : (cnt + zero == 2) ? 5 : 6;
        minRank = cnt == 6 ? 1 :
                (cnt == 5) ? 2 : (cnt == 4) ? 3 : (cnt == 3) ? 4 : (cnt == 2) ? 5 : 6;

        int[] answer = {maxRank, minRank};
        return answer;
    }

    public static void main(String[] args) {
        RankingOfLotto obj = new RankingOfLotto();
        int[] answer = obj.solution(new int[]{0,0,0,0,0,0}, new int[]{38,19,20,40,15,25});
        System.out.println(Arrays.toString(answer));
    }
}
