package Variables;

/*
String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
*/

public class PrintVariables {
    public static void main(String[] args) {
        String name = "Hung"; //variable "name" type "String" value "Hung"
        int num = 21; //variable "num" type "int" value "21"
        float floatnum = 21.333f; //variable "floatnum" type "float" value "21.333"
        char letter = 'H';
        boolean bool = false; //variable "bool" type "boolean" value "false"


        System.out.println("My name is " + name);
        System.out.println(num);
        System.out.println(floatnum);
        System.out.println(letter);
        System.out.println(bool);

        num = 22; //Overwrite the value
        System.out.println(num);
        //Add "final" to stop overwrite the value
    }
}
