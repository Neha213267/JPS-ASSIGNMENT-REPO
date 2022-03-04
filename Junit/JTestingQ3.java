
public class JTestingQ3 {public static double withdraw(double amt) throws  InsufficientBalanceException {
    double balance = 600 ;
    try {
        if(balance<amt){// balance is less than the amount you want to take out
            throw new InsufficientBalanceException ("Insufficient Funds");
        }
        balance -= amt ;
        return balance;
    }
    catch (RuntimeException re){
        System.out.println("Exception");
    }
    return balance;
}
}
class InsufficientBalanceException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InsufficientBalanceException(String str)
{
    super(str);
}
}



