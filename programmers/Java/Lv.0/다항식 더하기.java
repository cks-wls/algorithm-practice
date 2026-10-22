// 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.
class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");
        int xNum = 0;
        int num = 0;
        for(String s : arr){
            if(s.contains("x")){
                if(s.length() == 1){
                xNum += 1;    
                }else{
                 String a = "";
                for(int i = 0; i < s.indexOf("x"); i++){
                    a += s.charAt(i);
                }
                    xNum += Integer.parseInt(a);
                }
            }else{
                num += Integer.parseInt(s);
            }
        }
        if(xNum == 0 && num != 0){
            return num + "";
        }else if(xNum != 0 && num == 0){
            if(xNum == 1) return "x";
            return xNum + "x";
        }else if(xNum != 0 && num != 0){
            if (xNum == 1) return "x" + " + " + num;
            return xNum + "x" + " + " + num; 
        }else{
            return num + "";
        }
    }
}