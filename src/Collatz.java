public class Collatz {
        public int solution(int num) {
            int answer = 0;
            long lnum = (long)num;
            while (lnum != 1) {
                ++answer;
                if(lnum % 2 ==0){
                    lnum = lnum / 2;
                }else{
                    lnum = lnum * 3 + 1 ;
                }
                if(answer > 500){
                    return -1;
                }
                System.out.print("num : " + lnum);
                System.out.println("횟수 : " + answer);
            }
            return answer;
        }
    public static void main(String[] args) {
        Collatz obj = new Collatz();
        int answer = obj.solution(626331);
        System.out.println(answer);
    }
}
