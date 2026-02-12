class Solution {
    public int fib(int n) {
        int nextNum=0;
        int firstNum=0;
        int secondNum=1;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        for(int i=2;i<=n;i++){  
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
        return nextNum;
    }
}
