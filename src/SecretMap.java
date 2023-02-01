import java.util.Arrays;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] strArr = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            strArr[i] = String.format("%0"+n+"d",Long.parseLong(Long.toBinaryString(arr1[i] | arr2[i]))); //값이 5자리 미면이면 0으로 표시. 비트 연산자 or 사용
            // 2,6번 테스트 케이스 통과되지 않아 수정 테스트 케이스의 표현범위가 많아 에러난듯..
            strArr[i] = strArr[i].replace('0',' ');
            strArr[i] = strArr[i].replace('1','#');
        }
        return strArr;
    }
    public static void main(String[] args) {
        SecretMap obj = new SecretMap();
        String[] answer = obj.solution(6,new int[]{46,33,33,22,31,50},new int[]{27,56,19,14,14,10});
        System.out.println(Arrays.toString(answer));
    }
}
