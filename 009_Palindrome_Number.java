import java.lang.Math;
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x, reversed = 0;
        
        while (temp > 0) {
            int last = temp % 10;
            
            reversed *= 10;
            reversed += last;
                
            temp = temp / 10;
        }
        
        return reversed == x;
    }
}