import java.util.Arrays;

// 평균 점수 구하기 (w/ for each)
public class Q5 {

    private static int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};

    private static double getAvg() {
        double sum = Arrays.stream(marks).sum();

        return sum / marks.length;
    }

    public static void exec() {
        System.out.println(getAvg());
    }
}
