public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World 1");

        System.out.println(Counter.value);
        Counter.increase();
        Counter.increase();
        System.out.println(Counter.value);

        // 연습문제
        Q1.exec(); // 70.0
        Q2.exec(); // true
        Q3.exec(); // [881120, 1068234]
        Q4.exec(); // 1
        Q5.exec(); // a#b#c#d
        Q6.exec(); // [5,4,3,2,1]
        Q7.exec(); // "Life is too short"
        Q8.exec(); // 80
        Q9.exec(); // [1, 2, 3, 4, 5]
    }
}

