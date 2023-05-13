import java.util.HashMap;

// 매직 넘버 제거하기
public class Q10 {

    private static final HashMap<CoffeeType, Integer> priceMap = new HashMap<>();

    private static void init() {
        priceMap.put(CoffeeType.AMERICANO, 3000); // 1: 아메리카노
        priceMap.put(CoffeeType.ICED_TEA, 4000); // 2: 아이스티
        priceMap.put(CoffeeType.CAFE_LATTE, 5000); // 3: 카페라떼
    }

    private static void printPrice(CoffeeType type) {
        System.out.printf("가격은 %d원 입니다.%n", priceMap.get(type));
    }

    public static void exec() {
        init();

        printPrice(CoffeeType.ICED_TEA);
    }

    private enum CoffeeType {
        AMERICANO,
        ICED_TEA,
        CAFE_LATTE
    }
}
