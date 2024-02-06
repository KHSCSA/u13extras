public class Strings {
    public static void main(String[] args){
        // JVM does some 'optimizing'
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));



    }
    
}
