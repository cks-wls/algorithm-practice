// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
import java.util.*;
class Solution {
    public Integer[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int val : arr){
            if(val % divisor == 0) list.add(val);
        }
        if(list.size() == 0) list.add(-1);
        Collections.sort(list, (a,b) -> a-b);
        Integer[] arr1 = list.toArray(new Integer[0]);
        return arr1;
    }
}