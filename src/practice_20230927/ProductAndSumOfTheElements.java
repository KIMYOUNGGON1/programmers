package practice_20230927;

public class ProductAndSumOfTheElements {
//    정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
public static void main(String[] args) {
    int[] num_list = {1, 2, 3, 4};
    solution(num_list);
    }
    public static int solution(int[] num_list) {
        int answer = 0;

        int multipleOfList = num_list[0];
        int multipleOfListSum = num_list[0];

        for (int i = 1; i < num_list.length; i++) {
            multipleOfList *= num_list[i];
            multipleOfListSum += num_list[i];
        }

        multipleOfListSum *= multipleOfListSum;

        if (multipleOfList < multipleOfListSum) {
            answer = 1;
        }

        return answer;
    }
}

