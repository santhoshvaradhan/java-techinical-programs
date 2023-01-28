//solution for word break
import java.util.*;
class SFWB {
    public static void main(String[] args) {
        String string;
        String[] dict=new String[]{"santhosh","pradeep"};
        Scanner in=new Scanner(System.in);
        System.out.println("enter the word :");
        string=in.nextLine();
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+1;j<=string.length();j++)
            {
                String substring=string.substring(i,j);
                for(int k=0;k<dict.length;k++)
                {
                    if(dict[k].equals(substring))
                    {
                        System.out.println("yes the substring is present in dictionary:"+substring);
                    }
                }
            }
        }
    }
}
