// 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
class Solution {
    public int[] solution(String myString) {
        char c = myString.charAt(myString.length() - 1);
        if(c == 'x'){
            myString += "@";
        }
        String[] arr = myString.split("x");
        int length = arr.length;
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("@")){
                answer[i] = 0;
            }else{
             answer[i] = arr[i].length();   
            }
        }
        return answer;
    }
}