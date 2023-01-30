import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JesseAndCookies {

    public static void main(String[] args) {
    
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++)
            {
            queue.add(scan.nextInt());
        }
        int count=0;
        while(queue.peek()<k)
            {
            if(queue.size()>=2)
                {
            int x=queue.remove();
            int y=queue.remove();
            y=x+2*y;
            queue.add(y);
            count++;
            }
            else
                {
                count=-1;
                break;
            }
        }
        System.out.println(count);
    }
}