// 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        String[] answerArr = new String[arr.length];
        int i = arr.length - 1;
        for(String value : arr){
            answerArr[i] = value;
            i--;
        }
        String answer = String.join("", answerArr);
        return answer;
    }
}