// 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때, arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for(int val : arr){
            length += val;
        }
        int[] answer = new int[length];
        int j = 0;
        for(int val : arr){
            for(int i = 0; i < val; i++){
                answer[j] = val;
                j++;
            }
        }
        return answer;
    }
}