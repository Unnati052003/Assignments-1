public class index
{
    public static void main(String args[])
    {
       int n = Integer.parseInt(args[0]);

       for(int i=1;i<=10;i++)
       {
        System.out.println(n + "*" + i + " = " +(n*i));
       }
    
    }
   
}







//javac index.java
//java index 5