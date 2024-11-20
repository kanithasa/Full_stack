import java.util.Scanner;
public class Sample1 {
    public static void main(String args[]){
        
        int number=10;
        int prev=0;
        int next=1;
       
        for(int i=0;i<=number;i++){
            System.out.print(prev+" ");
            int temp=next;
            next=temp+prev;
            prev=temp;
        
        }

        System.out.println(prev+" "+next+" ");
        

    }
}
