/*package problems;

public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;
        while(num>0) {
            int rem = num%10;
            sum = sum + (rem*rem*rem);
            num = num/10;
        }
        if(temp==sum) {
            System.out.println(temp + " is an Armstrong number");
        }
        else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
    
}*/





package problems;

public class armstrong {
    public static void main(String[] args){
        int num=1634;
        int temp=num;
        int count=0;
        int sum=0;
        while(num>0){
            count++;
            temp/=10;
            
        }
        temp=num;
        while(temp>0){
            int ld=temp%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power=power*ld;
            }
            sum=sum+power;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println(num+ " is an Armstrong number");
        }
        else{
            System.out.println(num+ " is not an Armstrong number");
        }
    }
}