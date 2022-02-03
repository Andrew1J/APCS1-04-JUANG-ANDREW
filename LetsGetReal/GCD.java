public class GCD{
    public static void main(String[] args){
        System.out.println(gcd(6,4));
    }
    public static int gcd(int a, int b){
        if(a==0)return b;
        if(b==0)return a;
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        while((big%small)!=0){
            small = big%small;
            big = small;
        }
        return small;
    }
}
