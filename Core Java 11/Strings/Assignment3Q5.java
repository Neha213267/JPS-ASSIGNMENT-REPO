
public class Assignment3Q5
{
	 public static void main(String[] args)
	 {
	 StringBuilder s = new StringBuilder("");
	 System.out.println(s);
	 s.append("StringBuilder");
	 s.append(" Is a peer class of String");
	 s.append(" That provides much of");
	 s.append(" The functionality of strings");
	 System.out.println(s);
    StringBuilder str= new StringBuilder("It is used to  at the specified index position");
    str.insert(14,"insert text");
    System.out.println(str);
    StringBuilder strnew= new StringBuilder("This method returns the reversed object on which it was called");
    System.out.println(strnew);
    strnew.reverse();
    System.out.println(strnew);
    }
    }
