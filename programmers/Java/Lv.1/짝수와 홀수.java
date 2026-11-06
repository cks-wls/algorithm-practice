// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
class Solution {
    public String solution(int num) {
        if((int)Math.abs(num) % 2 == 1){
            return "Odd";
        }
        return "Even";
    }
}