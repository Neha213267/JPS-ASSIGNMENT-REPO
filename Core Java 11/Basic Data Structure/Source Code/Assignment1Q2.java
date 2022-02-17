
import java.util.ArrayList;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	ArrayList<Integer> armstrongNumbersList = new ArrayList<>();
 
        for(int i = min;i<=max;i++){
            if(armstrongCheck(i))
                armstrongNumbersList.add(i);

        }
        int [] arrayOfArmNumber = new int[armstrongNumbersList.size()];
        int i=0;

       for(Integer ele:armstrongNumbersList){
           arrayOfArmNumber[i] =ele;
           i++;
       }
         return  arrayOfArmNumber;

}
    
        public boolean armstrongCheck(int num){
            int a = num;
            int arm =0;
            while(a!=0){
                int remainder = a%10;
                arm =arm+ (int)Math.pow(remainder,3); // adds the cube of remainder into arm
                a = a/10; // remove the last digit
            }

            if(num==arm)
                return true;
            else
                return false;
        }
    }


public class Assignment1Q2 {

	public static void main(String[] args) {
		
		int min =100;
        int max=999;

        ArmstrongNumBetweenRange armstrongNumBetweenRange = new ArmstrongNumBetweenRange();
        int[] res = armstrongNumBetweenRange.armstrongNumbersInRange(min,max);

        for(int i:res){
            System.out.print(i+" ");
        }
    }
		

}