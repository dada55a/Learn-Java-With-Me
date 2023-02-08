# Operator

Operators are used to perform operations on variables and values.

Java divides the operators into the following groups:

- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators
- Bitwise operators

## Arithmetic Operators

Arithmetic operators are used to perform common mathematical operations.

| Operator | Name           | Description                            | Example |
| -------- | -------------- | -------------------------------------- | ------- |
| +        | Addition       | Adds together two values               | x + y   |
| -        | Subtraction    | Subtracts one value from another       | x - y   |
| *        | Multiplication | Multiplies two values                  | x * y   |
| /        | Division       | Divides one value by another           | x / y   |
| %        | Modulus        | Returns the division remainder         | x % y   |
| ++       | Increment      | Increases the value of a variable by 1 | ++x     |
| --       | Decrement      | Decreases the value of a variable by 1 | --x     |

## Java Assignment Operators

Assignment operators are used to assign values to variables.

| Operator | Example | Same As    |
| -------- | ------- | ---------- |
| =        | x = 5   | x = 5      |
| +=       | x += 3  | x = x + 3  |
| -=       | x -= 3  | x = x - 3  |
| *=       | x *= 3  | x = x * 3  |
| /=       | x /= 3  | x = x / 3  |
| %=       | x %= 3  | x = x % 3  |
| &=       | x &= 3  | x = x & 3  |
| \|=      | x \|= 3 | x = x \| 3 |
| ^=       | x ^= 3  | x = x ^ 3  |
| >>=      | x >>= 3 | x = x >> 3 |
| <<=      | x <<= 3 | x = x << 3 |

## Java Comparison Operators

Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.

The return value of a comparison is either `true` or `false`. These values are known as *Boolean values*

| Operator | Name                     | Example |
| -------- | ------------------------ | ------- |
| ==       | Equal to                 | x == y  |
| !=       | Not equal                | x != y  |
| >        | Greater than             | x > y   |
| <        | Less than                | x < y   |
| >=       | Greater than or equal to | x >= y  |
| <=       | Less than or equal to    | x <= y  |

## Java Logical Operators

You can also test for `true` or `false` values with logical operators.

Logical operators are used to determine the logic between variables or values:

| Operator | Name        | Description                                             | Example            |
| -------- | ----------- | ------------------------------------------------------- | ------------------ |
| &&       | Logical and | Returns true if both statements are true                | x < 5 &&  x < 10   |
| \|       | Logical or  | Returns true if one of the statements is true           | x < 5 \| x < 4     |
| !        | Logical not | Reverse the result, returns false if the result is true | !(x < 5 && x < 10) |

### Precedence and Associativity of Operators

Precedence and associative rules are used when dealing with hybrid equations involving more than one type of operator. In such cases, these rules determine which part of the equation to consider first, as there can be many different valuations for the same equation. The below table depicts the precedence of operators in decreasing order as magnitude, with the top representing the highest precedence and the bottom showing the lowest precedence.




| Precedence | Operator                                   | Type                                                                                                                                                   | Associativity |
| ---------- | ------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------- |
| 15         | ()<br>[]<br>·                              | Parentheses<br>Array subscript<br>Member selection<br>                                                                                                 | Left to Right |
| 14         | ++<br>--                                   | Unary post-increment<br>Unary post-decrement                                                                                                           | Left to Right |
| 13         | ++<br>--<br>+<br>-<br>!<br>~<br>( *type* ) | Unary pre-increment<br>Unary pre-decrement<br>Unary plus<br>Unary minus<br>Unary logical negation<br>Unary bitwise complement<br>Unary type cast       | Right to left |
| 12         | *<br>/<br>%                                | Multiplication<br>Division<br>Modulus                                                                                                                  | Left to right |
| 11         | +<br>-                                     | Addition<br>Subtraction                                                                                                                                | Left to right |
| 10         | <<<br>>><br>>>>                            | Bitwise left shift<br>Bitwise right shift with sign extension<br>Bitwise right shift with zero extension                                               | Left to right |
| 9          | <<br><=<br>><br>>=<br>instanceof           | Relational less than<br>Relational less than or equal<br>Relational greater than<br>Relational greater than or equal<br>Type comparison (objects only) | Left to right |
| 8          | ==<br>!=                                   | Relational is equal to<br>Relational is not equal to                                                                                                   | Left to right |
| 7          | &                                          | Bitwise AND                                                                                                                                            | Left to right |
| 6          | ^                                          | Bitwise exclusive OR                                                                                                                                   | Left to right |
| 5          | \|                                         | Bitwise inclusive OR                                                                                                                                   | Left to right |
| 4          | &&                                         | Logical AND                                                                                                                                            | Left to right |
| 3          | \|                                         | Logical OR                                                                                                                                             | Left to right |
| 2          | ? :                                        | Ternary conditional                                                                                                                                    | Right to left |
| 1          | =<br>+=<br>-=<br>*=<br>/=<br>%=            | Assignment<br>Addition assignment<br>Subtraction assignment<br>Multiplication assignment<br>Division assignment<br>Modulus assignment                  | Right to left |


