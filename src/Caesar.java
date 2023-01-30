public class Caesar {
    public String solution(String s, int n) {
        String answer = "";
        String[] strArr = s.split("");

        for(int i = 0; i < strArr.length; i++){
            if (strArr[i].equals(" ")){
                answer += " ";
                continue;
            }
            int asci = strArr[i].charAt(0); //각 글자 Char로 변환
            if(65 <= asci && asci <= 90){ // A-Z까지
                asci = (asci - 65 + n) % 26; //a or A로 돌아오는 것까지 포함해서 26임
                answer += String.valueOf((char)(asci + 65));
            }
            if(97 <= asci && asci <= 122){ //a-z까지
                asci = (asci - 97 + n) % 26;
//                answer += String.valueOf((char)(asci + 97));
                answer += (char)(asci + 97);  //Stirng에 어떻게 바로 char가 들어가는지??
            }


        }
        return answer;
    }
    public static void main(String[] args) {
        Caesar obj = new Caesar();
        String answer = obj.solution("a B z",4);
        System.out.println(answer);
    }
}
