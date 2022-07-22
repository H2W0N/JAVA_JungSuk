package Chapter05;

public class ArrayEx11 {
    // 배열에 0~9가 각각 몇개인지 셀 수 있음
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i=0; i<numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i<numArr.length; i++) {
            counter[numArr[i]]++;
        }
//        for (int j : numArr) {
//            counter[j]++;
//        }
        for (int i=0; i<numArr.length; i++) {
            System.out.println(i + "의 갯수 : " + counter[i]);
        }
    }
}
