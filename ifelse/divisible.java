package ifelse;
public class divisible {
    public static void main(String[] args) {
        int num=10;
        if(num%5==0 && num%3==0){
            System.out.println("divisible by both 5 and 3");
        }
        else if(num%5==0){
            System.out.println("divisible by 5");
        }
        else if(num%3==0){
            System.out.println("divisible by 3");
        }
        else{
            System.out.println("not divisible by both 5 and 3");
        }
    }
    
}
