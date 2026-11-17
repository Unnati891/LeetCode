class Solution {
    public double myPow(double x, int n) {
        long power=n;
        if(power<0){
            power=-power;
            return 1.0/powSol(x,power);
        }
        return powSol(x,power);
    }
    public double powSol(double x,long n){
        if(n==0){
            return 1.0;
        }
        double half =powSol(x,n/2);
        if(n%2==0){
            return half*half;
        }
        return half*half*x;
    }
}