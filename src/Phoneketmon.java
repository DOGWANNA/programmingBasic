import java.util.ArrayList;

public class Phoneketmon {
    public int solution(int[] nums) {
        int num = nums.length/2;

        ArrayList<Integer> list = new ArrayList();
        for(int i : nums){
           if(!(list.contains(i))){
               list.add(i);
           }
        }
        if(list.size() < num){
            return list.size();
        }else{
            return num;
        }

    }
    public static void main(String[] args) {
        Phoneketmon obj = new Phoneketmon();
        int answer = obj.solution(new int[]{3,3,3,2,2,2});
        System.out.println(answer);
    }
}
