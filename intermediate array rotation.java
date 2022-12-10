import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Rotate an Array in Java");
        int i,j,k,n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=in.nextInt();
        int [] nums=new int[n];
        int [] result=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<nums.length;i++)
        {
            nums[i]=in.nextInt();
        }
        System.out.println("Enter number of step to rotate:");
        //k is step value which means number of step to rotate;
        k=in.nextInt();
        // for loop for rotate the elements ;
        if(k<=n)
        {
        for(i=0;i<k;i++)
        {
            result[i]=nums[nums.length-k+i];
        }
        for(j=i;j<nums.length;j++)
        {
            result[j]=nums[j-i];
        }
        System.out.println("Array after rotation:");
        for(i=0;i<nums.length;i++)
        {
            System.out.println(result[i]);
        }
        }
         else
        {
            System.out.println("your are eligible for voting");
        }
    }
}
