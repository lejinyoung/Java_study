public class Study_220130_Eg3_6 {
    public static void main(String[] args) {
        int fahrenheit = 100;

//        float celcius = 5/9 * (fahrenheit - 32);    결과값이 0.0이 나온다. 왜지? -> 아마 int와 float의 연산이어서?
//        int celcius = 5/9 * (fahrenheit - 32);    이렇게 해도 결과값이 0.0이다.
//        혹시나 하는 마음에 float farenheit를 했는데도 결과는 0.0이다. 아마 5/9에 문제가 있는 것 같다.

//        System.out.println((float)fahrenheit); int를 float로 바꿀 때에는 (float)OOO 이다.
        float celcius = (((float)fahrenheit - 32) * 5/9);   // 반올림 어떻게 하지.

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celcius: " + celcius);
    }
}
