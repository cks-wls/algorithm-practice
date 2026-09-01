// 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        int len = 0;
        for(String val : arr){
            if(!val.equals("")){
                len ++;
            }
        }
        String[] answer = new String[len];
        int i = 0;
        for(String val : arr){
            if(!val.equals("")){
                len ++;
                answer[i] = val;
                i++;
            }
        }
        return answer;
    }
}