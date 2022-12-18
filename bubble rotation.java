// bubble rotation using LinkedList
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int n,key;
        // n is number of elements
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=in.nextInt();
        LinkedList<Integer> list1=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element"+(i+1)+":");
            int element=in.nextInt();
            list1.add(element);
        }
        System.out.println("Before rotaion");
        System.out.println(list1);
        System.out.println("Enter the number of step to rotate:");
        //key is number of rotate
        key=in.nextInt();
        for(int i=1;i<=key;i++)
        {
            for(int j=n-1;j>0;j--)
            {
                int temp1=list1.get(j);
                int temp2=list1.get(j-1);
                list1.set(j-1,temp1);
                list1.set(j,temp2);
            }
        }
        System.out.println("After rotation");
        System.out.println(list1);
    }
}
