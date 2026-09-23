// 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        // case 2가지. 1. n이 배열 안에있는 두 수 사이에 있는 경우
        // 2. n이 배열 끝 수 보다 크거나 작은 경우
        Arrays.sort(array);
        int lowNum = 0;
        int highNum = 0;
        if(array[0] > n){
            return array[0];
        }else if(array[array.length - 1] < n){
            return array[array.length -1];
        }else{
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] == n){
                    return n;
                }else{
                    if(array[i] < n && array[i+1] > n){
                        lowNum = array[i];
                        highNum = array[i+1];
                        break;
                    }
                }
            }
            return ((n-lowNum) <= (highNum - n)) ? lowNum : highNum;
        }
        
    }
}