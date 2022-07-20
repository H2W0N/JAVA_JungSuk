package Chapter05;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        // 배열 abc와 num을 붙여서 하나의 배열로 만들기
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length); // abc[0]에서 result[0]으로 abc.length개의 데이터를 복사
        System.arraycopy(num, 0, result, abc.length, num.length); // num[0]에서 result[abc.length]로 num.length개의 데이터를 복사
        System.out.println(result); // 다른 배열들과 달리 char 배열은 for문을 사용하지 않고도 print()나 println()으로 배열에 저장된 모든 문자를 출력할 수 있음

        // 배열 abc를 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        // number의 인덱스6 위치에 3개를 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);

    }
}
