// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int val : numbers){
            list.add(val);
        }
        int answer = 0;
        Integer[] arr = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(Integer val : arr){
            if(!list.contains(val)) answer += val;
        }
        return answer;
    }
}