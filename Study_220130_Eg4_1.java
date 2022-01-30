public class Study_220130_Eg4_1 {
    public static void main(String[] args) {

        int x;
        x = 11;
        if (10 < x && x < 20) System.out.println("True1");   // &&을 꼭 해야하나?

        char ch_1;
        ch_1 = 'a';
        if (ch_1 != ' ') System.out.println("True2");

        char ch_2;
        ch_2 = 'x';
        if (ch_2 == 'x' || ch_2 == 'X') System.out.println("True3");

        char ch_3;
        ch_3 = '2';
        if ('0' <= ch_3 && ch_3 <= '9') System.out.println("True4");

        char ch_4;
        ch_4 = 'b';
        if ('A' <= ch_4 && ch_4 <= 'z') System.out.println("True5");    // 영문 대문자가 더 앞쪽에 위치

        int year;
        year = 400;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) System.out.println("True6");

        boolean powerOn;
        powerOn = false;
        if (powerOn == false) System.out.println("True7");   // boolean 변수가 뭐지?

        String str;
        str = "yes";
        if (str == "yes") System.out.println("True8");
    }
}
