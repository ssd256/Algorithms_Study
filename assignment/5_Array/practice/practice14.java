	public class ArrayPractice {
    public void pracitce14() {
      // 로또 번호 자동 생성기 작성 -> 1 ~ 45의 정수
      // 중복 없이 오름차순으로 정렬하여 출력
      int[] lotto = new int[6];
      boolean[] isUsed = new boolean[47];
      int random;
      int count = 0;

      do {
        random = (int)(Math.random()*45+1);
        if(!isUsed[random]) {
          isUsed[random] = true;
          lotto[count] = random;
          count++;
        }
      } while(count < 6);

      Arrays.sort(lotto);

      for(int i = 0; i < lotto.length; i++) {
        System.out.print(lotto[i] + " ");
      }
    } // practice14 end
} // class end
