import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] stage = new double[N+1]; //0~5의 범위
        ArrayList<Double> failArr = new ArrayList<Double>(); // 실패율을 담을 list

        // 머물러있는 사용자 수
        for(int i : stages) {
            if(i == N+1){
                continue;
                //배열이 0~5까지 범위에만 있기 때문에 6은 통과
            }
            stage[i]++;
            System.out.println(i + "에 머물러있는 사용자 수 : " + stage[i]);
        }
        System.out.println(Arrays.toString(stage));

        // 스테이지에 도달한 명수
        double num = stages.length;  //8
        // 다음 스테이지로 올라갈때 줄어드는 사용자수를 계산하기 위해 사용
        double tmp = 0;

        // 실패율을 구한 후 다시 stage배열에 담고, fail 리스트에도 담아준다.
        for(int i=1; i<stage.length; i++){

            tmp = stage[i];
            //도달한 사용자수가 0이면, 실패율도 0
            if(num == 0){
                stage[i] = 0;
            }else{
                stage[i] = stage[i]/num; //첫번째 스테이지에서 시작하기 때문에 8

                num = num - tmp; // 스테이지 참여 인원 - 스테이지에 도달한 플레이어 수
            }
            failArr.add(stage[i]);
        }
        Collections.sort(failArr,Collections.reverseOrder());

        for(int i = 0; i < failArr.size(); i++){
            for(int j=1; j < stage.length; j++){
                if(failArr.get(i) == stage[j]){
                    answer[i] = j;
                    stage[j] = -1;
                    break;
                }
            }
        }
        return answer;

    }
    // 스테이지에 도달했으나 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
    // stages 배열의 size는 사람 수, 각 숫자는 각자 도전 중인 stage N+1 마지막 스테이지까지 클리어한 도전자임.
    // 계산한 실패율을 토대로 내림차순으로 정렬한다. 높은수 > 낮은수
    public static void main(String[] args) {
        FailureRate obj = new FailureRate();
        int[] answer = obj.solution(5, new int[]{4,4,4,4,4});
        System.out.println(Arrays.toString(answer));
    }
}
