public class FindRemainderOne {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        FindRemainderOne obj = new FindRemainderOne();
        int answer = obj.solution(10);
        System.out.println(answer);
    }
}
