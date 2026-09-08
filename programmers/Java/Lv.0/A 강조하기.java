// 문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            char c = myString.charAt(i);
            if(c == 'a'){
                answer += Character.toUpperCase(c);
            }else if(c == 'A'){
                answer += c;
            }else{
                answer += Character.toLowerCase(c);
            }
        }
        return answer;
    }
}