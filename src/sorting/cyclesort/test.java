package sorting.cyclesort;

public class test {
    public static void main(String[] args) {
        int a=201234;
        int ans=isPrime(a);
        System.out.println(ans);
    }
    public static int isPrime(int n){
        int ans=0;
        while(n!=0){
            ans=(ans*10)+n%10;
            n=n/10;
        }
        return ans;
    }
}
