// 문자열 바꾸기 (':' => '#')
public class Q5 {

  private static final String a = "a:b:c:d";
  private static String result;

  private static String convertStr(String str) {
    return str.replaceAll(":", "#");
  }

  public static void exec() {
    result = convertStr(a);
    System.out.println(result);
  }
}
