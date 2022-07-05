class StringEx {
    public static void main(String[] args) {
        String name = "JA" + "VA";
        String str = name + 8.0; // 문자열 + 숫자 = 문자열

        System.out.println(name); // JAVA
        System.out.println(str); // JAVA8.0
        System.out.println(7 + " "); // 7
        System.out.println(" " + 7); //  7
        System.out.println(7 + ""); // 7
        System.out.println("" + 7); // 7
        System.out.println("" + ""); // 아무것도 나오지 않음. 공백
        System.out.println(7 + 7 + ""); // 14
        System.out.println("" + 7 + 7); // 77
    }    
}
