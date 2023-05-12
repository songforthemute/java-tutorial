import java.util.Arrays;

// 주민등록번호 연월일 부분과 뒤의 숫자 부분으로 나누어 출력하기
public class Q3 {

  private static String result = Arrays.toString(dividePin("881120-1068234"));

  private static String[] dividePin(String pin) {
    return pin.split("-");
  }

  public static void exec() {
    System.out.println(result);
  }


}
