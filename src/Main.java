import java.util.Arrays;

public class Main {
    public int solution(String s) {
        int answer = 0;
        String[] strArr = s.split("");
        int score = 0;

        for(String ox : strArr){
            if(ox.equals("O")){
                score++;
                answer += score;
            }else{
                score = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "OXOOOXXXOXOOXOOOOOXO";
        System.out.println(method.solution(s));
    }
}

//import java.util.Arrays;
//
//public class Main {
//    public int solution(int num){
//        int answer = 0;
//        int changes = 1000-num;
//        int[] change_kind = {500, 100, 50, 10, 1};
//        Integer[] kind_sort = Arrays.stream(change_kind).boxed().toArray(Integer[]::new);
//
//        for(int i : kind_sort){
//            while(changes - i >= 0){
//                System.out.println("종류 : " + i);
//                System.out.println("현재 잔돈 : " + changes);
//                System.out.println();
//                changes -= i;
//                answer++;
//            }
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main obj = new Main();
//        int num1= 160;
//        int coin = obj.solution(num1);
//        System.out.println(coin);
//    }
//}