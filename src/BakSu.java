public class BakSu {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += i%2==0 ? "수" : "박";
        }
        return answer;
    }
    public static void main(String[] args) {
        BakSu obj = new BakSu();
        String answer = obj.solution(4);
        System.out.println(answer);
    }
}
