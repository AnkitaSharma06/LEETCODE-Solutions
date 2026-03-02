class Solution {
    public int reverse(int x) {
        int rev=0;
        int newrev=0;
        int len1=0;
        int len2=0;
        int num1=x;
        int num2=x;
        while(num1>0){
            len1++;
            num1 = num1/10;
        }
        while(num2<0){
            len2++;
            num2 = num2/10;
        }
        for(int i=0 ; i<len1 ; i++){
            int temp1 = x%10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && temp1 > 7))
                return 0;
            rev = (rev*10)+temp1;
            x = x/10;
        }
        for(int i=0 ; i<len2 ; i++){
            int temp2 = x%10;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && temp2 < -8))
                return 0;
            rev = (rev*10)+temp2;
            x = x/10;
        }
        return rev;
    }
}
