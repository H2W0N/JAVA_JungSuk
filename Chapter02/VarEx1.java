class VarEx1 {
    public static void main(String[] args) {
        /*
        * 변수란? 단 하나의 값을 저장할 수 있는 메모리 공간
        * 변수는 알 수 없는 값이 남아있을 수 있으므로 반드시 초기화해서 사용
        * 변수의 값을 저장할 때는 대입 연산자 '=' 사용
        * 자바에서는 오른쪽의 값을 왼쪽 변수에 저장
        * 그래서 대입연산자의 왼쪽에는 반드시 변수가 와야함
        */
        
        int year = 0; // 변수 year를 선언하고 0으로 초기화
        int age = 14; // 변수 age를 선언하고 14로 초기화
        
        System.out.println(year);
        System.out.println(age);
        
        year = age + 2000; // 변수 age의 값에 2000을 더해서 변수 year에 저장
        age = age + 1; // 변수 age에 저장된 값은 1 증가시킴

        System.out.println(year);
        System.out.println(age);
    }
}