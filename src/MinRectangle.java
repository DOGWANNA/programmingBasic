public class MinRectangle {
    public int solution(int[][] sizes) {
        //큰 값을 가로로, 작은 값을 세로로 고정시킨다.
        int maxlen = 0;
        int minlen = 0;
        int big = 0;
        int small = 0;
        for (int i = 0; i < sizes.length; i++) {
            maxlen = sizes[i][0];
            minlen = sizes[i][1];

            if (maxlen < minlen) {
                // 세로가 더 클 경우 가로로 바꿔준다.
                int tmp = maxlen;
                maxlen = minlen;
                minlen = tmp;
            }

            if (big < maxlen) {
                //가로 중 젤 긴 길이
                big = maxlen;
            }
            if (small < minlen) {
                //세로 중 젤 긴 길이
                small = minlen;
            }
        }
        return big * small;

        //Math.max를 이용한 풀이방법
//        int length = 0, height = 0;
//        for (int[] card : sizes) {
//            length = Math.max(length, Math.max(card[0], card[1]));
//            height = Math.max(height, Math.min(card[0], card[1]));
//        }
//        int answer = length * height;
//        return answer;
    }
    public static void main(String[] args) {
        MinRectangle obj = new MinRectangle();

        int answer = obj.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println(answer);
    }
}
