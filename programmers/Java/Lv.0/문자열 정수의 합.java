// 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(int i = 0; i < num_str.length(); i++){
            char c = num_str.charAt(i);
            answer += Character.getNumericValue(c);    
        }
        return answer;
    }
}