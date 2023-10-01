package practice_20230927;

public class TheFirstNegativeNumber {
//    정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, -5};
        System.out.println(solution(num_list));

    }

    public static int solution(int[] num_list) {
        int answer = num_list[0];

        if (answer < 0) {
            answer = 0;
        } else {
            for (int i = 1; i < num_list.length; i++) {
                if (num_list[i] < 0) {
                    answer = i;
                    break;
                } else {
                    answer = -1;
                }
            }
        }
        return answer;
    }
}
