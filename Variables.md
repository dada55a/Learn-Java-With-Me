# Variables

Variables are similar to jar where we store cookies.

```
Syntax:
datatype name;
or,
datatype name = value; 

Example:
int a;
int b=5;
```

**Things to conside while naming a variable:**

- A variable name can consist of Capital letters **A-Z**, lowercase letters **a-z** digits **0-9**, and two special characters such as **_** underscore and **$** dollar sign.
- The first character must not be a digit.
- Blank spaces cannot be used in variable names.
- Java keywords cannot be used as variable names.
- Variable names are case-sensitive.
- There is no limit on the length of a variable name but by convention, it should be between 4 to 15 chars.
- Variable names always should exist on the left-hand side of assignment operators.



### Types of Variable:

1. Local Variables:
   
   A variable defined within a block or method or constructor is called a local variable. These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function. The scope of these variables exists only within the block in which the variables are declared, i.e., we can access these variables only within that block. Initialization of the local variable is mandatory before using it in the defined scope.
   
   ```
   class Main {
       public static void main(String[] args)
       {
           int var = 5; // Declared a Local Variable
           System.out.println("Local Variable: " + var);
       }
   }
   ```
2. Instance Variables:
   
   Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block. As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed. Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used. Initialization of an instance variable is not mandatory. Its default value is 0. Instance variables can be accessed only by creating objects.
   
   ```
   class Main{
    
       public String boy; // Declared Instance Variable
    
       public nft()
       { // Default Constructor
    
           this.boy = "dada44"; // initializing Instance Variable
       }
   //Main Method
       public static void main(String[] args)
       {
    
           // Object Creation
           nft name = new nft();
           // Displaying O/P
           System.out.println("boy name is: " + name.geek);
       }
   }
   ```
3. Static Variables:
   
   Static variables are also known as class variables. 
   
   These variables are declared similarly as instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor or block. Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create. Static variables are created at the start of program execution and destroyed automatically when execution ends. Initialization of a static variable is not mandatory. Its default value is 0. If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically. If we access a static variable without the class name, the compiler will automatically append the class name.
   
   ```
   class Main {
      
     public static String boy = "dada44";         //Declared static variable
      
       public static void main (String[] args) {
           
           System.out.println("Geek Name is : "+Main.boy);
       }
   }
   ```
