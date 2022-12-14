import java.util.*;


public class hasNextUse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = new String();
        int i = 1;
        while (in.hasNext()) {
            s = in.nextLine();
            System.out.println(i+" "+s);
            i++;
        }
        in.close();
    }
}