package Chapter05;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};
        // 배열의 첫번째 값으로 최대,최소를 초기화
        int max = score[0];
        int min = score[0];
        // 배열의 두번째 요소부터 읽기 위해 i의 값을 0이 아닌 1로 초기화
        for (int i=1; i<score.length; i++) {
            if (score[i]>max) {
                max = score[i];
            } else if (score[i]<min) {
                min = score[i];
            }
        }
        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);
    }
}
