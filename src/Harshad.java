public class Harshad {
    public boolean solution(int x) {
        boolean answer = true;
        String s = x + "";
        String[] strArr = s.split("");
        int hap = 0;
        for(String s2 : strArr){
            hap += Integer.parseInt(s2);
        }
        if(x%hap!=0){
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Harshad obj = new Harshad();
        boolean answer = obj.solution(11);
        System.out.println(answer);
    }
}
