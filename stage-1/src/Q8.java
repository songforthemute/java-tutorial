import java.util.HashMap;

// grade 맵에서 "B" 값 추출하기
public class Q8 {

    private static final HashMap<String, Integer> grade = new HashMap<>();

    private static void init() {
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
    }

    private static int getElem(String key) {
        return grade.get(key);
    }

    public static void exec() {
        init();

        int result = getElem("B");

        System.out.println(result);
    }
}
