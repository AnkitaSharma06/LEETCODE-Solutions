class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int n2,n3;
        int newn=n;
        while(n>0)
        {
            n2 = n%10;
            product = product*n2;
            n=n/10;
        }
        n=newn;
        while(n>0)
        {
            n3 = n%10;
            sum = sum+n3;
            n=n/10;
        }
        return (product-sum);
    }
}
