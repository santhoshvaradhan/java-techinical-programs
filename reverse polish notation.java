//reverse polish notation
import java.util.*;
 class Test
{
    public static void main(String[]args)
    {
        String[] tokens={"1","3","+","4","*"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens)
    {
        int retunvalue=0;
        String Operator="+-*/";
        Stack<String> stack=new Stack<String>();
        for(String read:tokens)
        {
            if(!Operator.contains(read))
            {
                stack.push(read);
                //System.out.println("push");
            }
            else
            {
                int a=Integer.valueOf(stack.pop());
                int b=Integer.valueOf(stack.pop());
               // System.out.println(a);
                //System.out.println(b);
                //System.out.println("pop");
                switch(read)
                {
                    case "+":
                        stack.push(String.valueOf(a+b));
                        //System.out.println(stack.pop());
                        break;
                    case "-":
                        stack.push(String.valueOf(a-b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        //System.out.println(stack.pop());
                        break;
                    case "/":
                        stack.push(String.valueOf(a/b));
                        break;
                }
            }
        }
        retunvalue=Integer.valueOf(stack.pop());
    return retunvalue ;
    }
     
}
