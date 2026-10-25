// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
import java.util.*;
class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : array){
            if(map.containsKey(val)){
                int ordinalVal = map.get(val);
                map.put(val, ordinalVal + 1);
            }else{
             map.put(val, 1);   
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        int maxNum = list.get(0);
        for(int val : list){
            if(maxNum < val) maxNum = val;
        }
        if(list.indexOf(maxNum) != list.lastIndexOf(maxNum)) return -1;
        List<Integer> listKey = new ArrayList<>(map.keySet());
        return listKey.get(list.indexOf(maxNum));
    }
}