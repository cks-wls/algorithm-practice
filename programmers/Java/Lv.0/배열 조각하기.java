// 정수 배열 arr와 query가 주어집니다.
// query를 순회하면서 다음 작업을 반복합니다.
// - 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
// - 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
// 위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
import java.util.*;
class Solution {
    public Integer[] solution(int[] arr, int[] query) {
        // 인덱스가 짝수면 query[i] + 1부터 끝까지 제거
        // 인덱스가 홀수면 0 ~ query[i] - 1까지 제거
        Deque<Integer> deque = new ArrayDeque<>();
        for(int val : arr){
            deque.offer(val);
        }
        for(int i = 0; i < query.length; i++){
            int size = deque.size();
            if(i % 2 == 0){
                for(int j = query[i] + 1; j < size; j++){
                    deque.pollLast();
                }
            }else{
                for(int j = 0; j < query[i]; j++){
                    deque.poll();
                }
            }
        }
        return deque.toArray(new Integer[0]);
    }
}