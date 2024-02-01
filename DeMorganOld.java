/*
* Activity 1.3.6
*/
import java.util.Scanner;

public class DeMorganOld{
    public static void main(String[] args){

        // all combinations for step 5
        // showing !(a&&b) == !a || !b
        step5(true, true);
        step5(true, false);
        step5(false, true);
        step5(false, false);


    } // close main() method



    // if all we were interested in were the boolean value
    // we could do this very simply
    public static void step5simple(boolean a, boolean b){
        boolean ans = !(a&&b);
        System.out.print("!(" +a+ " && " +b+ ") is: " + ans);
        ans = !a || !b;
        System.out.println("\t\t!" +a+ " || !" +b+ " is: " + ans);
    } // close step5() method



    // BUT in the upcoming steps we will be required to use conditionals
    // so we'll do it this way
    public static void step5(boolean a, boolean b){
        // !(a&&b)
        if (!(a && b)) 
            System.out.println("NOT ("+a+" AND "+b+") evaluates to true");
        else 
            System.out.println("NOT ("+a+" AND "+b+") evaluates to false");

        // confirm the above is equivalent to !a || !b
        if (!a || !b) 
            System.out.println("NOT "+a+" OR NOT "+b+") evaluates to true");
        else 
            System.out.println("NOT "+a+" OR NOT "+b+") evaluates to false");

        System.out.println();
    } // close method



} // close class
