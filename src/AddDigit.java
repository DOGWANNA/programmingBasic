public class AddDigit {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";
        for (int i = 0; i < str.length(); i++) {
            answer += (str.charAt(i)-'0');
        }
        return answer;
    }
    public static void main(String[] args) {
        AddDigit obj = new AddDigit();
        int answer = obj.solution(123);
        System.out.println(answer);
    }
}
