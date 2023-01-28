import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NotArrive {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant)
            map.put(player, map.getOrDefault(player,0) + 1);
        for(String player : completion)
            map.put(player, map.get(player) - 1);

        for(String key : map.keySet()) {
            if(map.get(key) == 1) {
                answer = key;
            }
        }

        return answer;


    }
    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> participantList = new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> completionList = new ArrayList<>(Arrays.asList(completion));
//        for (int i = 0; i < participantList.size(); i++) {
//            for (int j = 0; j < completion.length; j++) {
//                if(participantList.get(i).equals(completion[j])){
//                    participantList.remove(i);
//                }
//            }
//        }
        // 이중포문 말고 인덱스 값으로 반환
        for(String s : completionList) {
            participantList.remove(s);
        }
//        participantList.removeAll(completionList);
        return participantList.get(0);
    }
    public static void main(String[] args) {
        NotArrive obj = new NotArrive();
        String answer = obj.solution2(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println(answer);
    }
}
