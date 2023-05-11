public class Q2 {

  // 자연수를 입력받고, 홀수인지 짝수인지 판별하기
  public static boolean isOdd(Integer num) {
    //    if (num % 2 == 0) {
    //      return false;
    //    } else {
    //      return true;
    //    }

    return num % 2 == 0 ? false : true;
  }

  public static void exec() {
    System.out.println(isOdd(13));
  }
}
