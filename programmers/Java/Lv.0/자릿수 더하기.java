// 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
class Solution {
    public int solution(int n) {
        String numToStr = n + "";
        int answer = 0;
        for(int i = 0; i < numToStr.length(); i++){
            char val = numToStr.charAt(i);
            answer += Character.getNumericValue(val);
        }
        return answer;
    }
}