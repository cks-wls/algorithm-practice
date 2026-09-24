// 정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
// 단, arr에 2가 없는 경우 [-1]을 return 합니다.
class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                if(firstIndex == -1){
                    firstIndex = i;
                }else{
                    lastIndex = i;
                }
            }
        }
        if(firstIndex != -1 && lastIndex == -1) lastIndex = firstIndex;
        int[] answer = new int[lastIndex - firstIndex + 1];
        if(firstIndex == -1 && lastIndex == -1) {
            answer[0] = -1;
        }else{
            for(int i = firstIndex; i <= lastIndex; i++){
                answer[i - firstIndex] = arr[i];
            }
        }
        return answer;
    }
}