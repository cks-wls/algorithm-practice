// 문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
class Solution {
    public String solution(String myString, String pat) {
        int index = myString.lastIndexOf(pat);
        String answer = "";
        for(int i = 0; i < index + pat.length(); i++){
            answer += myString.charAt(i);
        }
        return answer;
    }
}