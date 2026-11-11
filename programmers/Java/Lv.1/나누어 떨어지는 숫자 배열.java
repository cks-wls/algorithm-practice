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