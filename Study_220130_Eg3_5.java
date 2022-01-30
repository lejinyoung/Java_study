public class Study_220130_Eg3_5 {
    public static void main(String[] args) {
        int num = 10;

//        char result;
//        result = num > 0 ? '+' : '-'; -> result라는 변수를 생성하고자 했으나 문제 의도에 맞지 않아 pass

//        System.out.println(num > 0 ? '양수' : '음수');  // 따옴표는 안돼. 한글자만 돼.
        System.out.println(num > 0 ? "양수" : (num == 0 ? "0" : "음수"));  // 쌍따옴표로 해줘야 문자열이 되는 듯.
    }
}

// 따옴표랑 쌍따옴표에 차이가 있다는 사실을 알게 되었다.