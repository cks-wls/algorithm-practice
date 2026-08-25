class Solution {
    public int solution(int[] sides) {
        // 두변이상이 길이가 같을때를 생각해야함
        int maxSide = 0;
        int sidesSum = 0;
        for(int val : sides){
            if(maxSide <= val){
                maxSide = val;
            }
        }
        for (int val : sides){
            sidesSum += val;
        }
        sidesSum -= maxSide;
        if(maxSide < sidesSum){
            return 1;
        }
        return 2;
    }
}