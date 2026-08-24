// 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public int[] solution(int[] num_list) {
        int oddCount = 0;
        int evenCount = 0;
        for(int val : num_list){
            if(val % 2 == 1){
                oddCount ++;
            }else{
                evenCount ++;
            }
        }
        int[] answer = {evenCount, oddCount};
        return answer;
    }
}