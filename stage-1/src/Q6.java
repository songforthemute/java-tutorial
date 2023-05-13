import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// 정수 리스트를 역순으로 정렬하기
public class Q6 {

    private static final ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));

    private static void sortAsc(ArrayList<Integer> arrlist) {
        arrlist.sort(Comparator.reverseOrder());
    }

    public static void exec() {
        sortAsc(numList);

        System.out.println(numList);
    }
}
