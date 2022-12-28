public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int number) {
        int sum = 0;
        if (number < 0) {
            return 0;
        } else
            for (int i = 1; i < number; i++) {
                if (i % 3 == 0) {
                    sum += i;
                } else if (i % 5 == 0) {
                    sum += i;
                }
            }
        return sum;
    }

//    public int solution(int number) {
//        return IntStream.range(0, number)
//                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
//                .sum();
}
