// 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int[] solution(int[] numbers, String direction) {
        // right -> 맨 끝 원소를 맨앞으로
        // left -> 맨 앞 원소를 맨끝으로
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            answer[0] = numbers[numbers.length -1];
            for(int i = 1; i < answer.length; i++){
                answer[i] = numbers[i-1];
            }
        }else{
            for(int i = 0; i < answer.length -1; i++){
                answer[i] = numbers[i+1];
            }
            answer[answer.length - 1] = numbers[0];
        }
        return answer;
    }
}