public class BaekJun8858 {
    int solution(String test){
        String[] strArr = test.split("");
        int score = 0;
        int answer = 0;

        for(String s : strArr){
            if(s.equals("O")){
                score++;
                answer += score;

            }else{
                score = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        BaekJun8858 obj = new BaekJun8858();
        int answer = obj.solution("OOXXOXXOOO");
        System.out.println(answer);
    }
}
