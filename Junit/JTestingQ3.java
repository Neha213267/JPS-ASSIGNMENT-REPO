
public class JTestingQ3 {public static double withdraw(double amount) throws  InsufficientBalanceException {
    double balance = 10000 ;
    try {
        if(balance<amount){
            throw new InsufficientBalanceException ("Insufficient Funds");
        }
        balance -= amount ;
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



