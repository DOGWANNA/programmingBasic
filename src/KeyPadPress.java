public class KeyPadPress {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10; // 맨 아랫줄 10 11 12로
        int right = 12;
        for(int i : numbers){
            System.out.println("left : " + left + " , right : " + right);
            if(i == 1 || i == 4 || i == 7){
                answer += "L";
                left = i;

            }else if(i == 3 || i == 6 || i == 9){
                answer += "R";
                right = i;
            }else{
                if(i == 0 ){ i += 11;} // 0을 11로 취급할거기 때문에 변환
                int leftDis = Math.abs(i-left)/3 + Math.abs(i-left)%3;
                int rightDis = Math.abs(i-right)/3 + Math.abs(i-right)%3; //현재 수와 현재 손가락 위치를 계산해서 거리를 구함.
                System.out.println(leftDis + " , " + rightDis);
                if(leftDis < rightDis){
                    answer += "L";
                    left = i;
                }else if(leftDis > rightDis){
                    answer += "R";
                    right = i;
                }else{
                    if(hand.equals("left")){
                        answer += "L";
                        left = i;
                    }else {
                        answer += "R";
                        right = i;
                    }
                }
            }

        }
        return answer;

    }
    public static void main(String[] args) {
        KeyPadPress obj = new KeyPadPress();
        String answer = obj.solution(new int[]{7,0,8,2,8,3,1,5,7,6,2},"left");
        System.out.println(answer);
    }
}
