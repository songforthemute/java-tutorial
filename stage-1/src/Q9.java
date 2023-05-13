import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// numbers 리스트에서 중복 숫자 제거하기
public class Q9 {

    private static final ArrayList<Integer> numbers = new ArrayList<>(
        Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5)
    );


    public static void exec() {
        HashSet<Integer> set = new HashSet<>(numbers);
        ArrayList<Integer> arrList = new ArrayList<>(set);

        System.out.println(arrList);
    }
}
