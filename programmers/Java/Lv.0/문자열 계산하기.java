// my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
class Solution {
    public int solution(String my_string) {
        String[] array = my_string.split(" ");
        int answer = Integer.parseInt(array[0]);
        for(int i = 1; i < array.length; i += 2){
            String operator = array[i];
            int num = Integer.parseInt(array[i+1]);
            if(operator.equals("+")){
                answer += num;
            }else{
                answer -= num;
            }
        }
        return answer;
    }
}