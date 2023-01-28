public class Ternary {
    public int solution(int n) {
        StringBuffer str = new StringBuffer();
        String ternaryStr = Integer.toString(n,3);
        str = str.append(ternaryStr).reverse();
        ternaryStr = str.toString();
        return Integer.parseInt(ternaryStr,3);
    }
    public static void main(String[] args) {
        Ternary obj = new Ternary();
        int answer = obj.solution(45);
        System.out.println(answer);

    }
}
