// 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int[] num_list) {
        int arrLength = num_list.length;
        int answer = (arrLength >= 11) ? 0 : 1;
        for(int value : num_list){
            if(arrLength >= 11){
                answer += value;
            }else{
                answer *= value;
            }
        }
        return answer;
    }
}