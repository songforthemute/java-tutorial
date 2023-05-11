public class Q1 {

  // 점수를 입력받고 평균 구하기
  static public double getAverage(int... nums) {
    double sum = 0;

    for (Integer var : nums) {
      sum += var;
    }

    return sum / nums.length;
  }

  static public void exec() {
    System.out.println(getAverage(80, 75, 55));
  }
}
