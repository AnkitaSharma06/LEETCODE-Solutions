class Solution {
    public boolean isPalindrome(int x) {
        int num1=x;
        int num2=x;
        int reverse=0;
        int count=0;
        while(x>0){
            x=x/10;
            count++;
        }
        if(num1==0){
            return true;
        }
        if(num1>0){
            for(int i=0 ; i<count ; i++){
                reverse = (reverse*10) + (num1%10);
                num1 = num1/10;
            }
            if(reverse==num2){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
