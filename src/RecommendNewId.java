
public class RecommendNewId {
    public String solution(String new_id) {
        //replaceAll 활용하기.
//        long before = Runtime.getRuntime();
        // 1단계
        String answer = new_id.toLowerCase();

        // 2단계
        answer = answer.replaceAll("[^-_.a-z0-9]",""); //-_. a부터z 0부터 9가 아니면 공백으로

        // 3단계
        answer = answer.replaceAll("[.]{2,}","."); // .이 2번 반복이면 .으로 ,의 의미?

        // 4단계
        answer = answer.replaceAll("^[.]|[.]$",""); // 시작과 끝이 .이면 "으로

        // 5단계
        if(answer.equals("")){
            answer += "a";
        }

        // 6단계
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$",""); // 문자열 끝에 .이면 삭제
        }

        // 7단계
        if(answer.length() <= 2){
            while(answer.length() < 3){
                answer += answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        RecommendNewId obj = new RecommendNewId();
        String answer = obj.solution("z-+.^.");
        System.out.println(answer);
    }
}

//정규 표현식 사용해보기.