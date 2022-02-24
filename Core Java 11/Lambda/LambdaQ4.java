
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;

@FunctionalInterface
interface RemoveDup
{
    public int removeDup(String str);
}
public class LambdaQ4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        ArrayList<String> list = new ArrayList<>();

        Predicate<String> filterEmp = (p)-> {
            if(Math.floorMod(p.length(),2)==0)
                return  true;
            else
                return false;
        };

        employeeList.stream()
                .filter(filterEmp)
                .forEach(p->list.add(p));

        return  list;
    }
    public static void main(String[] args) {
        
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("BruceBanner");
        employeeList.add("PeterParker");
        employeeList.add("IronMan");
        employeeList.add("Hulk");
        employeeList.add("Gamora");
        employeeList.add("MaryJane");

        LambdaQ4 lambda = new LambdaQ4();
        System.out.println(lambda.removeOddLength(employeeList));

    }
}