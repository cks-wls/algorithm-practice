// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for(int val : arr){
            sum += val;
        }
        double average = sum / arr.length;
        return average;
    }
}