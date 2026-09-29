import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        String str = "";
        for(int i = 0; i < my_str.length(); i++){
            if(i % n == n-1){
                str += my_str.charAt(i);
                list.add(str);
                str = "";
            }else if( i == my_str.length() - 1){
                str += my_str.charAt(i);
                list.add(str);
            }
            else{
                 str += my_str.charAt(i);   
                }
        }
        return list.toArray(new String[0]);
    }
}