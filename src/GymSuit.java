import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        HashSet<Integer> resSet = new HashSet<>();
        HashSet<Integer> loSet = new HashSet<>();

        for(int i: reserve) {
            resSet.add(i);
        }

        for(int i: lost) {
            if(resSet.contains(i)) {
                resSet.remove(i);
            }
            else {
                loSet.add(i);
            }
        }

        for(int i: resSet) {
            if(loSet.contains(i-1)) {
                loSet.remove(i - 1);
            }
            else if(loSet.contains(i+1)) {
                loSet.remove(i + 1);
            }
        }

        answer = n - loSet.size();

        return answer;
    }
//    public int solution(int n, int[] lost, int[] reserve) {
//        int count = 0; // 빌린 학생 숫자
//
//        Arrays.sort(lost);
//        Arrays.sort(reserve);
//
//        for (int i = 0; i < lost.length; i++) { // 도난 당한 학생 == 여분이 있는 학생일 경우 여분이 없는 것으로 처리
//            for (int j = 0; j < reserve.length; j++) {
//                if(lost[i] == reserve[j]){
//                    reserve[j] = -1;
//                    break;
//
//                }
//            }
//        }
//
//        for (int i = 0; i < lost.length; i++) {
//
//            for (int j = 0; j < reserve.length; j++) {
//                if(lost[i] == (reserve[j]-1) || lost[i] == (reserve[j]+1)){ //여분을 빌려주면 다시 빌려줄 수 없게 처리
//                    reserve[j] = -1;
//                    count++;
//                    break;
//                }
//            }
//        }
//        return n - lost.length + count;
//    }
    public static void main(String[] args) {
        GymSuit obj = new GymSuit();
        int answer = obj.solution(5, new int[]{4,2}, new int[]{3,5});
        System.out.println(answer);
    }
}
