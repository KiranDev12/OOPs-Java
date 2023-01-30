public class test {
    public static void main(String args[])
    throws ClassNotFoundException{
        Class myClass = Class.forName("Test");
        // System.out.println(myClass.toString());
        System.out.println(myClass.getPackage());
    }
}
