package Java11;

interface SimpleIntrest{
	double SI(double Principle, double Amt, double Rate);
	}
public class Q1{

    public static void main( String[] args ) {
    SimpleIntrest ref;
    ref = (double P, double R, double T) -> {return (P*R*T)/100;};
    
    System.out.println("Simple Interest = " + ref.SI(1000,5.5,2.5));
    } 
}