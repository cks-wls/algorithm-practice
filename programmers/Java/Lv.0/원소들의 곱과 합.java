// 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int[] num_list) {
        int multipleNum = 1;
        int addNum = 0;
        for(int value : num_list){
            multipleNum *= value;
            addNum += value;
        }
        return (multipleNum < Math.pow(addNum, 2)) ? 1 : 0;
    }
}