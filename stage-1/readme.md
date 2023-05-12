# Stage 1

---

## 목차

- [소스 코드 개요](#소스-코드-개요)
- [변수와 네이밍](#변수와-네이밍)
- [자료형](#자료형)
- [형변환과 final](#형변환과-final)
- [러닝 포인트](#러닝-포인트)

---

### 소스 코드 개요

```java
// Main.java
public class HelloWorld {

  public static void main(String[] args) {

    System.out.println("Hello World");
  }
}
```

- `public` 메서드 접근 제어자, 외부에서 접근 가능
- `static` '정적' 키워드, 인스턴스 생성없이 사용 가능
    - 메서드 뿐만 아니라 멤버 변수도 정적 선언 가능
    ```java
    // Counter.java
    public class Counter {
  
        public static int value = 0;
  
        public static void increase() {
            value++;
        }
    }
    
    // Main.java
    public class Main {
  
      public static void main(String[] args){
  
        System.out.println(Counter.value); // 0
        Counter.increase();
        Counter.increase();
        System.out.println(Counter.value); // 2
      }
    }
    ```

- `void` 메서드의 리턴 타입
- `String[] args` 문자열 배열 타입 매개변수
- `System.out.println` 자바 내장, 표준 출력, 문자열 출력 메서드
    - 인텔리제이 단축어 `sout`


- `main`
    - Java 프로그램 진입점(Entry point)
    - 프로그램이 시작될 진입점
    - JVM이 프로그램을 실행할 때 호출하는 메서드
    - 프로그램 실행에 필요한 초기화 작업 수행
    - 필요 클래스 및 객체 생성, 메서드를 호출해 실행 흐름 결정
    - 프로그램의 진입점이므로 반드시 하나의 클래스에만 작성

- 인텔리제이에서 작성한 Java 파일 실행 시, `.class` 파일을 만드는 컴파일 과정(javac.exe)과 실행 과정(java.exe)을 실행

---

### 변수와 네이밍

- 변수명
    - 숫자로 시작할 수 없음
    - 언더스코어(_)와 달러($) 기호 외 특수 문자 사용 불가
    - 자바 언어 키워드 사용 불가
        - ex. `abstract new default implements this do ...`


- 클래스명
    - 파스칼 케이스 사용

    - 메서드명
        - 카멜 케이스 사용

---

### 자료형

**원시 타입**

- `int`
    - `-2 ^ 31 ~ 2 ^ 31 - 1` 32bit(부호 1bit + 31bit)
    - `int oct = 023` `0`으로 시작하면 8진수
    - `int hex = 0xC` `0x`로 시작하면 16진수


- `long`
    - `-2 ^ 63 ~ 2 ^ 63 - 1` 64bit(부호 1bit + 63bit)
        - int 타입의 최대값보다 큰 경우 접미사에 `L` 혹은 `l`을 누락하면 컴파일 에러 발생


- `float`
- `double`
    - 자바에서 실수형 기본값이 double므로, float 타입 변수에 값 대입시 접미사에 `F` 혹은 `f`를 누락하면 컴파일 에러 발생


- `boolean`
    - cf 1. `"kim" == "lee"` 참조값 비교
    - cf 2. `"kim".equals("lee")` 문자열 비교


- `char`
    - `char ascii = 97` ASCII 코드 표현
    - `char uni = '\u0061'` Unicode 표현

**참조 타입**

- `String`
    - `"lee"` 문자열 값 참조 방식, JVM의 intern pool 메모리 공간에 해당 문자열 값 저장 이후, 동일 문자열 선언 시 caching된 문자열 반환
    - `new String("Lee")` String 객체 생성 방식, 항상 새로운 객체 생성
    - `str.indexOf(str2)` 특정 문자열 시작 인덱스 반환
    - `str.contains(str2)` 특정 문자열 포함 여부 반환
    - `str.charAt(idx)` 특정 인덱스의 문자 반환
    - `str.replaceAll(targetStr, newStr)` 특정 문자열을 다른 문자열로 변환한 문자열 반환
    - `str.substring(start, end)` 문자열 중 특정 부분 추출
    - `str.toUpperCase()` 모두 대문자로 변환한 문자열 반환, cf. `str.toLowerCase()`
    - `str.split(div)` 특정 구분자로 구획을 나눈 문자열 배열 반환
    - `String.format("I ate %d %s.", count, food)` 문자열 포맷 코드를 통해 대입한 결과 문자열 반환, C의 printf 문법과 동일
        - `%s` 문자열, 어떤 자료형을 대입해도 문자열로 변환되어 출력
        - `%c` 문자
        - `%d` 정수
        - `%f` 부동소수
        - `%o` 8진수
        - `%x` 16진수
        - `%%` %문자, 이스케이프 문자 처리와 유사
        - cf 1. `System.out.println()` 포매팅된 문자열 출력
        - cf 2. `System.out.printf()` 포매팅 후, 문자열 출력


- `StringBuffer`
- `StringBuilder`
    - 문자열을 추가하거나 변경할 때 사용하는 자료형
    - `strBuf.toString()` StringBuffer를 String 자료형으로 반환
    - 문자열은 불변하므로, 문자열을 더하기 연산을 사용해 계속해서 더하는 것은 계속해서 새로운 객체가 생성되는 데 반해, StringBuffer 객체를 사용하는 것은 그렇지 않음
    - 하지만, 자료형 자체는 StringBuffer가 더 무겁고 느리기에 문자열 변경이 빈번한 경우에 사용하는 것이 적합
    - cf. `StringBuilder` 자료형은 StringBuffer와 유사하며 사용법도 동일하지만 성능은 보다 우수, 동기화가 고려될 필요가 없다면 적합, 그러나 멀티 스레드 환경에서는
      StringBuffer가 보다 안전
      ```java
      StringBuffer sb = new StringBuffer();
      sb.append("hello"); // 버퍼에 문자열 추가
      sb.append("world");
      sb.insert(1, " "); // 특정 위치에 문자열 삽입
      String blended = sb.toString(); // "hello world"
      sb.subString(0, 4); // "hell", String 자료형의 메서드와 동일
      ```


- `Array`
    - ex 1. `int[] odds = {1, 3, 5, 7, 9};` 배열 리터럴 선언
    - ex 2. `String[] weeks = new String[7];` 배열의 길이는 불변
    - `arr.length` 배열의 길이
        - cf. `ArrayIndexOutOfBoundsException` 배열의 길이를 벗어나는 값 취득 시도 시 발생하는 에러


- `List`
    - 배열과 유사하나, 길이가 가변적
    - cf. `ArrayList`, `Vector`, `LinkedList` 등의 List 인터페이스 구현체 존재
        ```java
        import java.util.ArrayList; // ArrayList를 사용하기 위한 클래스 import
        import java.util.Arrays; // Array를 ArrayList로 변환하기 위한 클래스 import
        import java.util.Comparator; // ArrayList를 정렬하기 위한 클래스 import
      
        public class Example {
      
            public static main(String[] args) {
      
                ArrayList<String> fruits = new ArrayList<>(); // J2SE 5.0 이후로 제네릭 사용 권고
                // 제네릭 미사용시 ArrayList에 추가되는 객체는 Object 타입으로 인식하고,
                // 이 경우, ArrayList 내 원소 취득 시 타입캐스팅 필요
      
                fruits.add("apple"); // 원소 삽입
                fruits.add("banana");
                fruits.add(1, "peach"); // 위치 지정 원소 삽입
      
                System.out.println(fruits.get(1)); // "peach"
                System.out.println(fruits.size()); // 3
                System.out.println(fruits.contains("apple")); // true
                System.out.println(fruits.remove("banana")); // 객체 삭제 후 결과 boolean 반환, true
                // System.out.println(fruits.contains(2)); // 항목 삭제 후 결과 항목 반환, "banana"
      
                String[] numArr = {"456", "789", "123"};
                ArrayList<String> numList = new ArrayList<>(Arrays.asList(numArr)); // 리스트 객체로 변환
                // == new ArrayList<>(Arrays.asList("456", "789", "123"));
      
                System.out.println(numList); // ["456", "789", "123"]
                System.out.println(String.join(",", numList)); // "456,789,123"
      
                numList.sort(Comparator.naturalOrder()); // 오름차순 정렬
                // Comparator.reverseOrder() // 내림차순 정렬
                System.out.println(numList); // ["123", "456", "789"]
            }
        }
        ```


- `Map`
    - key - value 관계 자료구조, 순차적이지 않으며 key를 통해 value 접근
    - == Associative array, Hash
    - cf. `HashMap`, `LinkedHashMap`, `TreeMap` 등의 Map 인터페이스 구현체 존재
        - `LinkedHashMap` 입력된 순서대로 데이터를 저장
        - `TreeMap` 입력된 key의 오름차순 순서대로 데이터를 저장


- `HashMap`
    ```java
    import java.util.HashMap;
    
    public class Example {
  
      public static void main(String[] args){
  
        HashMap<String, String> map = new HashMap<>(); // 제네릭 사용
        map.put("human", "사람"); // 할당
        map.put("fruit", "과일");
        
        System.out.println(map.keySet()); // [human, fruit], Set 타입 반환
  
        System.out.println(map.get("human")); // "사람"
        System.out.println(map.get("javascript")); // null
  
        System.out.println(map.getOrDefault("typescript", "타입스크립트")); // "타입스크립트", null이 아닌 디폴트 값 반환
        System.out.println(map.containsKey("fruit")); // true
        System.out.println(map.remove("people")); // "사람", 항목 삭제 후 key에 해당하는 value 반환
  
      }
    } 
    ```


- `Set`
    - 순서가 없으므로 인덱스를 이용한 접근 불가
    - cf. `HashSet`, `TreeSet`, `LinkedHashSet` 등의 Set 인터페이스 구현체 존재
        - `TreeSet` 오름차순으로 값을 정렬해 저장
        - `LinkedHashSet` 입력한 순서대로 값을 정렬해 저장
    ```java
    import java.util.Arrays;
    import java.util.HashSet;
  
    public class Example {
  
        public static void main(String[] args){
  
            HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
            System.out.println(set); // [e, H, l, o]
  
            // 제네릭으로 int 사용 시, int의 Wrapper 클래스 Integer 사용
            HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
            HashSet<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
  
            // 교집합
            HashSet<Integer> intersection = new HashSet<>(s1);
            intersection.retainAll(s2);
            System.out.println(intersection); // [3, 4]
  
            // 합집합
            HashSet<Integer> union = new HashSet<>(s1);
            union.addAll(s2);
            System.out.println(union); // [1, 2, 3, 4, 5, 6]
  
            // 차집합
            HashSet<Integer> subtract = new HashSet<>(s1);
            subtract.removeAll(s2);
            System.out.println(subtract); // [1, 2]
 
            subtract.add(3); // 값 추가
            subtract.addAll(4, 5); // 여러 값 추가
            subtract.remove(5); // 값 제거
        }
    }
    ```


- `enum`
    ```java
    public class Example {
  
        enum CoffeeType {
            AMERICANO,
            CAFELATTE,
            BLACKTEA
        }
  
        public static void main(String[] args){
  
            System.out.println(CoffeeType.AMERICANO); // AMERICANO
            System.out.println(CoffeeType.CAFELATTE); // CAFELATTE
            System.out.println(CoffeeType.BLACKTEA); // BLACKTEA
  
            for(CoffeeType type: CoffeeType.values()) { // CoffeeType.values(): CoffeeType의 배열 반환 
                System.out.println(type); // AMERICANO CAFELATTE BLACKTEA
            }
    }
    ```


- 커스텀 자료형
  ```java
  class Human {
    /* 클래스 정의 */
  }
  Human Lee; // Human 자료형의 인스턴스 Lee 생성
  ```

---

### 형변환과 final

**형변환**

```java
public class Example {

  public static void main(String[] args) {

    String num = "123";

    // 문자열 -> 정수
    int n = Integer.parseInt(num); // 123

    // 정수 -> 문자열
    String str1 = String.valueOf(n); // "123"
    String str2 = Integer.toString(n); // "123"

    String pi = "3.14"; // 실수 형태 문자열 -> 정수: NumberFormatException 에러

    // 문자열 -> 실수
    double d = Double.parseDouble(pi); // 3.14

    // 실수 -> 정수 // 반대는 캐스팅 X
    int n2 = (int) d; // 3
  }
}
```

**final**

- 자료형에 값을 단 한 번만 설정할 수 있게 강제하는 키워드
- 즉, 상수 선언
    - 변수 : 재할당 불가, 단 한 번만 할당
    - 메서드 : 재정의 불가
    - 클래스 : 확장 불가
- cf. Unmodifiable List
    - 리스트의 경우 final로 선언 시, 리스트에 값을 추가 및 삭제는 가능, 식별자에 재할당만 불가능
    - 값 추가 및 삭제도 불가능하게 동결하려는 경우, `List.of(collection)` 사용

    ```java
    final int myNumber = 10;
    
    public final void myMethod() {
    System.out.println("This is a final method.");
    }
    
    public final class MyClass {
    // ...
    }
    ```

  
---

### 러닝 포인트

- 배열 내 요소 순회하기 (Q1)
    ```java
    static public double getAverage(int... nums) {
       double sum = 0;
  
       for (Integer var : nums) {
           sum += var;
       }
    
       return sum / nums.length;
    }
    ```
    - `nums`: `int[]`
    - `...`: 'varargs', **가변 인수**를 나타내는 다중 변수 선언 연산자
    - 가변 인수는 실제 배열은 아니며, 블록 내에서 **배열처럼** 동작
        - 자바스크립트 함수 선언문의 유사 배열 객체인 `arguments` 이터러블과 유사
        - 실제 배열이 아니므로, `sort()` 등의 배열 메서드 사용 불가
        - 실제 배열이 아니므로, `length` 속성 없음
    - 실제 배열을 사용하는 것보다 느릴 수 있음


- 자바스크립트와 같은 삼항 연산자 사용 가능 (Q2)


- static 컨텍스트에서 non-static 메서드 참조 불가 (Q3)
    - non-static 메서드는 클래스의 인스턴스 소속
    - static 메서드는 클래스 자체 소속
    - static 컨텍스트에서 non-static 메서드를 호출 시, 해당 컨텍스트에 클래스의 현재 인스턴스에 대한 정보가 없으므로, 컴파일러는 메서드가 호출되어야 하는 클래스의 인스턴스 확인 불가능


- 문자열 타입에서 인덱스 접근 시, 배열처럼 접근 불가 (Q4)
    - `str.charAt(idx)` 메서드 사용


- 자바에서 클래스의 멤버 변수에 직접 초기화나 할당 연산을 수행하는 코드는 필드 초기화 시, 혹은 생성자, 메서드 내부에서 수행 (Q5)