import java.util.Scanner;
public class Fibo_no_recursion {
    public static void main(String args[]){
        System.out.println("enter the number of fibonacci numbers:");
        Scanner n=new Scanner(System.in);
        int count=2;
        int number=n.nextInt();
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
        n.close();

    }
}
