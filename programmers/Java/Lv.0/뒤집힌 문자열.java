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