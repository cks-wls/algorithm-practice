// 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
// - 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
// 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int a, int b) {
        int gcdVal = gcd(a, b);
        b /= gcdVal;
        if(isPrime(b)) return 1;
        return 2;
        
    }
    public int gcd(int a, int b){
        // 나머지로 시행한 최대공약수도 같은 결과 값을 가져옴
        while(a != 0){
            int r = b % a;
            b = a;
            a = r;
        }
        return b;
    }
    public boolean isPrime(int n){
        // 2와 5만 소인수로 갖는가?
        // 1, 2, 5, 10, 20, 25, 50, ...
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }else if(n % 5 == 0){
                n /= 5;
            }else{
                return false;
            }
        }
        return true;
        
    }
}