// 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
// 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
import java.util.*;
class Solution {
    public Integer[] solution(int l, int r) {
        // 0과 5 로만 이루어진 숫자 숫자만 리턴
        List<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            String[] arr = (i + "").split("");
            int count = 0;
            for(String s : arr){
                if(s.contains("5") || s.contains("0")) count++;
            }
            if(count == arr.length) list.add(i);
        }
        if(list.size() == 0) list.add(-1);
        return list.toArray(new Integer[0]);
    }
}