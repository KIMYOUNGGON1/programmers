package practice_20230927;

public class StringToUpperCase {
//    알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
    public static void main(String[] args) {
        solution("avxk");
    }

    public static String solution(String myString) {
        String toCastUpper = myString.toUpperCase();
        String answer = toCastUpper;
        return answer;
    }
}
