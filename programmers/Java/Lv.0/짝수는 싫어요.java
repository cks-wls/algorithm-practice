// 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int[] solution(int n) {
        // n이 홀수인 경우 배열 길이 n / 2 + 1;
        // n이 짝수인 경우 배열 길이 n / 2
        int length = 0;
        double half = (double) n / 2;
        if(half >  n / 2 && half <  n / 2 + 1){
            length = n / 2 + 1;
        }else{
            length = n / 2;
        }
        int[] answer = new int[length];
        int j = 0;
        for(int i = 1; i <= n; i+= 2){
            answer[j] = i;
            j++;
        }
        return answer;
    }
}