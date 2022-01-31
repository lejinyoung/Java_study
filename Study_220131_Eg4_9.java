public class Study_220131_Eg4_9 {
    public static void main(String[] args) {

        int i = 0;
        int num = 12345;
        int sum = 0;


        while (num > 1) {
            i++;
            num /= 10;
        }
        System.out.println(num);
    }
}
