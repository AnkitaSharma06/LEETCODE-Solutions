class Solution {
    public int addDigits(int num) {
        int len=0;
        int count=0;
        int sum=0;
        int temp=num;
        int newSum=0;
        while(temp>0){
            len++;
            temp=temp/10;
        }
        if(len==1){
            newSum=num;
        }
        else{
            while (num > 0) {  
                sum += num % 10;
                num = num / 10;
            }
            newSum=sum;
            while(sum>0){
                count++;
                sum=sum/10;
            }
            if(count>1){
                return addDigits(newSum);
            }
        }
        return newSum;
    }
}
