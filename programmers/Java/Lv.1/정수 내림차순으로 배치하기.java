// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
import java.util.*;
class Solution {
    public long solution(long n) {
        String numToStr = n + "";
        int length = numToStr.length();
        Integer[] arr = new Integer[length];
        for(int i = 0; i < length; i++){
            char c = numToStr.charAt(i);
            arr[i] = Character.getNumericValue(c);
        }
        Arrays.sort(arr, (a,b) -> b-a);
        StringBuilder sb = new StringBuilder();
        for(int val : arr){
            sb.append(val);
        }
        String s = sb.toString();
        long answer = Long.parseLong(s);
        return answer;
        
        
    }
}