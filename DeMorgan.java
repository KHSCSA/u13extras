public class DeMorgan {
    public static void main(String[] args){

        System.out.println("\nShowing not(a and b) == (not a) or (not b)");
        step5(true, true);
        step5(true, false);
        step5(false, true);
        step5(false, false);

        System.out.println("\nShowing not (a or b) == (not a) and (not b)");
        step6(true, true);
        step6(true, false);
        step6(false, true);
        step6(false, false);

    } // close main
    

    public static void step5(boolean a, boolean b){
        boolean ans = !(a&&b);
        System.out.print("!(" +a+ " && " +b+ ") is: " + ans);
        ans = !a || !b;
        System.out.println("\t\t!" +a+ " || !" +b+ " is: " + ans);
    }

    public static void step6(boolean a, boolean b){
        boolean ans = !(a||b);
        System.out.print("!(" +a+ " || " +b+ ") is: " + ans);
        ans = !a && !b;
        System.out.println("\t\t!" +a+ " && !" +b+ " is: " + ans);
    }

} // close Main
