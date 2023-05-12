// 주민등록번호에서 성별을 나타내는 숫자 출력하기
public class Q4 {

  private static final String pin = "881020-1068234";


  private static char getGender(String pin) {
    return (char) pin.charAt(7);
  }

  private static char gender = getGender(pin);

  public static void exec() {
    System.out.println(gender);
  }
}
