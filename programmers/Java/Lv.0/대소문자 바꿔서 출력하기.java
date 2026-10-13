// 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder(a);
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            
            if(Character.isUpperCase(c)){
                sb.replace(i, i + 1, (c + "").toLowerCase());
            }else{
             sb.replace(i, i + 1 , (c + "").toUpperCase());   
            }
        }
        System.out.println(sb.toString());
    }
}