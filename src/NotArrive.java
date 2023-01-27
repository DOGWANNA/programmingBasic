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

    public static void main(String[] args) {
        NotArrive obj = new NotArrive();
        String answer = obj.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println(answer);
    }
}
