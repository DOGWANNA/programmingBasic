
public class NumAndEnglish {
    String[] strArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public int solution(String s) {
        for(int i = 0; i<10; i++){
            s = s.replace(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        NumAndEnglish obj = new NumAndEnglish();
        int answer = obj.solution("one4seveneight");
        System.out.println(answer);
    }
}
