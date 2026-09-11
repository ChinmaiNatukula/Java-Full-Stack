package problems;

public class count {
    public static void main(String[] args) {
        int n=27439924;
        int count=0;
        while(n>0){
            int rem=n%10;
             n=n/10;
            count++;
        }
        System.out.println(count);
    }
    
}
