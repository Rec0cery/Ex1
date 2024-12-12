import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "";
        int base;
        int max1, max2;
        String quit="quit";
        System.out.println("Ex1 class solution:");
        while (!num1.equals(quit) && !num2.equals(quit))
        {
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.nextLine();
            if (!num1.equals(quit)&&num1 != null && !num1.isEmpty())
            {
                System.out.println("num1= " + num1 + " is a number: " + Ex1.isNumber(num1) + ", value: " + Ex1.number2Int(num1));
                if (Ex1.number2Int(num1) == -1) System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
                if (Ex1.number2Int(num1) != -1)
                {
                    System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
                    num2 = sc.nextLine();
                    if  (!num2.equals(quit)&&num2 != null && !num2.isEmpty())
                    {
                        System.out.println("num2= " + num2 + " is a number: " + Ex1.isNumber(num2) + ", value: " + Ex1.number2Int(num2));
                        if (Ex1.number2Int(num2) == -1)
                        {
                            System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
                        }
                        else
                        {
                            System.out.print("Enter a base for output: a number [2,16] \n");
                            base = sc.nextInt();
                            if(base>=2&&base<=16)
                            {
                                String[] Values = new String[4];
                                Values[0] = num1;
                                Values[1] = num2;
                                Values[2] = Ex1.int2Number(Ex1.number2Int(num1) + Ex1.number2Int(num2), base);
                                Values[3] = Ex1.int2Number(Ex1.number2Int(num1) * Ex1.number2Int(num2), base);
                                System.out.println(num1 + " + " + num2 + " = " + Values[2]);
                                System.out.println(num1 + " * " + num2 + " = " + Values[3]);
                                System.out.println("Max number over [" + num1 + "," + num2 + "," + Values[2] + "," + Values[3] + "] is: " + Values[Ex1.maxIndex(Values)]);
                            }
                            else break;
                        }
                    }
                    else if(num2.equals(quit))
                    {
                        System.out.print("quitting now...");
                    }
                }
                //else break;
            }
            else if(num1.equals(quit))
            {
                System.out.print("quitting now.....");
            }

        }
    }
}
