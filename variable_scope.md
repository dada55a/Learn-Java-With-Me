# Scope of Variables:

**Scope of variable** defines how a specific variable is accessible within the program or across classes.

### Types of scope:

1. Member Variable (Class level Scope):
   
   These variables must be declared inside class (outside any function). They can be directly accessed anywhere in class.
   
   ```java
   public class Main
   {
       static int a;
       public static void main(String args[])
       {
           {
               
               a = 10;
               System.out.println(a);
           }
       }
   }
   ```
   
   
   

2. Local Variable (Method Level Scope):
   
   Variables declared inside a method have method level scope and can’t be accessed outside the method.
   
   ```java
   public class Main
   {
       public static void main(String args[])
       {
           {
               // The variable x has scope within
               // brackets
               int x = 10;
               System.out.println(x);
           }
            
           // Uncommenting below line would produce
           // error since variable x is out of scope.
    
           // System.out.println(x);
       }
   }
   ```

3. Loop Variable(Block scope):
   
   A variable declared inside pair of brackets “{” and “}” in a method has scope within the brackets only.
   
   ```java
   class Main
   {
       public static void main(String args[])
       {
           int x;
           for (x = 0; x < 4; x++)
           {
               System.out.println(x);
           }
    
          System.out.println(x);
       }
   }
   ```

> Output:
> 
> 11: error: cannot find symbol
>         System.out.println(x);


