package Chapter05;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 버블정렬!
        int[] numArr = new int[10];

        for (int i=0; i<numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random()*10));
        }
        System.out.println();

        for (int i=0; i<numArr.length-1; i++) {
            boolean changed = false; // 자리 바꿈이 발생했는지 체크

            for (int j=0; j<numArr.length-1; j++) {
                if(numArr[j] > numArr[j+1]) {
                    // 양 옆을 비교해서 값이 작으면 바꿈
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true; // 자리를 바꿨으니 false를 true로
                }
            }

            if (!changed) break; // 자리바꿈이 없으면 반복문 탈출

            for (int k=0; k<numArr.length; k++) {
                System.out.print(numArr[k]); // 정렬된 결과를 출력
            }
            System.out.println();
        }
    }
}
