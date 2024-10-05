import java.util.Scanner;
public class Sample1 {
    public static void main(String args[]){
        
        int count=2;
        int number=10;
        int prev=0;
        int next=1;
       
        while (count<number){
            System.out.print(prev+" ");
            int temp=next;
            next=temp+prev;
            prev=temp;
            count++;
        }

        System.out.println(prev+" "+next+" ");
        

    }
}
