import java.util.ArrayList;
import java.util.Arrays;

// 문자열 리스트를 문자열로 만들기
public class Q7 {

    private static ArrayList<String> myList = new ArrayList<>(
        Arrays.asList("Life", "is", "too", "short")
    );

    private static String getString(ArrayList<String> arrlist) {
        return String.join(" ", arrlist);
    }

    public static void exec() {
        String result = getString(myList);

        System.out.println(result);
    }
}
