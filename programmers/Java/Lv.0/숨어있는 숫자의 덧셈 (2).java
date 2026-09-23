// 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = "";
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isDigit(c)){
                s += c;
            }else{
                if(s.length() > 0){
                 answer += Integer.parseInt(s);
                s = "";   
                }
            }
            if(i == my_string.length() - 1){
                if(s.length() > 0){
                 answer += Integer.parseInt(s);
                }
            }
        }
        return answer;
    }
}