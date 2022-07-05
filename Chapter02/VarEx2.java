class VarEx2 {
    public static void main(String[] args) {
    // x에 저장된 값 y로 옮기기
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x : " + x + " y : " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x : " + x + " y : " + y);
    }
}
