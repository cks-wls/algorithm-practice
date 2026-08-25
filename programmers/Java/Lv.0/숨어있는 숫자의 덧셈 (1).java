// 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split("");
        int answer = 0;
        for(int i = 0; i < arr.length; i++){
            char c = my_string.charAt(i);
            if(Character.isDigit(c)){
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}