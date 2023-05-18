// 1~1000의 자연수 중 3의 배수의 합 구하기 (w/ while statement)
public class Q2 {

    private static int num = 0;

    private static void sumPer3() {
        int index = 1;

        while (index++ <= 1000) {
            if (index % 3 == 0) {
                num += index;
            }
        }
    }

    public static void exec() {
        sumPer3();
        System.out.println(num);
    }
}
