// 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public int solution(int[] array) {
        int count = 0;
        for(int val : array){
            String s = val + "";
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '7') count ++;
            }
        }
        return count;
    }
}