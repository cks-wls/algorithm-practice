// 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
class Solution {
    public int solution(int n) {
        // 메서드를 모른다는 가정하고 풀기
        int quotient = n/7;
        int remain = n%7;
        boolean isAdd;
        if(remain == 0){
            isAdd = false;
        }else{
            isAdd = true;
        }
        int answer = isAdd ? quotient + 1 : quotient;
        return answer;
    }
}