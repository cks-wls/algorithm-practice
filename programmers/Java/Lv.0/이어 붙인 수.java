// 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int[] num_list) {
        String oddTotal = "";
        String evenTotal = "";
        for(int val : num_list){
            if(val % 2 == 0){
                evenTotal += val;
            }else{
                oddTotal += val;
            }
        }
        int answer = Integer.parseInt(oddTotal) + Integer.parseInt(evenTotal);
        return answer;
    }
}