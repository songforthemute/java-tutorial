# Stage 1

---

## 목차

- [소스 코드 개요](#소스-코드-개요)
- [변수와 네이밍](#변수와-네이밍)
- [자료형](#자료형)

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

- `List`


- `Map`


- `Set`


- 커스텀 자료형
  ```java
  class Human {
    /* 클래스 정의 */
  }
  Human Lee; // Human 자료형의 인스턴스 Lee 생성
  ```