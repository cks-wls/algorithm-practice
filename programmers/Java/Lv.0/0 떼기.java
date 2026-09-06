// 정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public String solution(String n_str) {
                String[] arr = n_str.split("");
        int i = 0;
        while(true){
            if(arr[i].equals("0")){
                i++;
            }else{
                break;
            }
        }
        String answer = "";
        for(int j = i; j < arr.length; j++){
            answer += arr[j];
        }
        return answer;
        
    }
}