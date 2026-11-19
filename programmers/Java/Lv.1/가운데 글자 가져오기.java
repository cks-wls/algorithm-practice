// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
class Solution {
    public String solution(String s) {
        // 길이가 짝수 일때
        StringBuilder sb = new StringBuilder();
        int middleIndex = s.length() / 2;
        if(s.length() % 2 == 0){
            sb.append(s.charAt(middleIndex - 1));
            sb.append(s.charAt(middleIndex));
        }else{
         // 길이가 홀수 일때   
            sb.append(s.charAt(middleIndex));
        }
        return sb.toString();
    }
}