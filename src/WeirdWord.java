public class WeirdWord {
    public String solution(String s) {
        String answer = "";

        String[] strArray = s.split("");

        int sNum = 0;
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(" ")){
                answer += " ";
                sNum = 0;
                continue;
            }
            if(sNum % 2 == 0){
                strArray[i] = strArray[i].toUpperCase();
                sNum++;
            }else if(sNum % 2 != 0){
                strArray[i] = strArray[i].toLowerCase();
                sNum++;
            }
            answer += strArray[i];
        }
        return answer;
    }

    public String solution2(String s) {
        String answer = "";


        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split[i].length(); j++) {
                if(!split[i].equals("")) {
                    if(j % 2 == 0) {
                        answer+= (split[i].charAt(j) +"").toUpperCase();
                    }else {
                        answer+= (split[i].charAt(j) +"").toLowerCase();
                    }
                }else {
                    break;
                }
            }
            if(!split[i].equals("")) answer += " ";
        }

        return answer.strip();
    }

    public static void main(String[] args) {
        WeirdWord obj = new WeirdWord();
        System.out.println(obj.solution2("java python javascript"));
    }
}
