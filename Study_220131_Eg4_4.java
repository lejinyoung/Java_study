public class Study_220131_Eg4_4 {
    public static void main(String[] args) {

        int i = 0;
        double sum = 0;
        while (sum < 100) {
            i++;
            sum += i * Math.pow(-1, i + 1);
//            System.out.println(i);
//            System.out.println(sum);

//        for (i = 1; i < 10; i++) {
//            sum += i * Math.pow(-1, i + 1);
//            System.out.println(sum);
        }System.out.println(i);
    }
}
