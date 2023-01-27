// Madian of two sorted array
import java.util.Arrays;
class MOTSA
{
    public static  int[] arr3;
    public static int a;
    public static String sorting(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            int min=i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[min]>array[j])
                {
                    min=j;
                }
            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }
        return  Arrays.toString(array);
    }
    public static void findmedian(int array1[])
    {
        
        if(array1.length%2!=0)
        {
             a=array1.length/2;
            System.out.println(array1[a]);
        }
        else
        {
            a=array1.length/2;
            System.out.println(array1[a-1]+"\n"+array1[a]);
        }
    }
    public static void main(String[] args) {
        int[] arr1={3,2,};
        int[] arr2={1,6,5};
        int a=arr1.length;
        int b=arr2.length;
        arr3=new int[a+b];
        System.arraycopy(arr1,0,arr3,0,a);
        System.arraycopy(arr2,0,arr3,a,b);
        System.out.println(Arrays.toString(arr3));
        String array2=sorting(arr3);
        System.out.println(array2);
         findmedian(arr3);
        }
}
