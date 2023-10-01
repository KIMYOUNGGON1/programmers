package practice_20230927;

public class TransformingTheSequenceAccordingToTheCondition {
//    정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        solution(arr);
    }

    public static int[] solution(int[] arr) {
        int[] calcValue = new int[arr.length];
        calcValue = arr;
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if ((calcValue[i] >= 50) && (calcValue[i] % 2 == 0)) {
                answer[i] = calcValue[i] / 2;
                System.out.println("This value is bigger than 50");
            } else if ((calcValue[i] < 50) && (calcValue[i] % 3 == 0)) {
                answer[i] = calcValue[i] * 2;
            }
            System.out.println("This is calculated value " + answer[i]);
        }


        return answer;
    }
}
