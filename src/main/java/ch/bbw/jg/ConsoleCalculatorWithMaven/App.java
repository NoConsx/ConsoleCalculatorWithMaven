package ch.bbw.jg.ConsoleCalculatorWithMaven;

/**
 * 
 * @author Joel Galli
 * @version 19.01.2020
 *
 */

public class App 
{
    public static void main( String[] args )
    {
       Calculator calculator = new Calculator();
       int valueA = 0;
       int valueB = 0;
       
       System.out.println("==================");
       System.out.println("Console Calculator");
       System.out.println("==================");
       System.out.println("");
       
       valueA = 10;
       valueB = 20;
       
       System.out.println("Sum "  + valueA + " + " + valueB + " = " + calculator.sum(valueA, valueB));
       System.out.println("========================================================================");
       System.out.println("");
       System.out.println("========================================================================");
       System.out.println("Difference "  + valueA + " - " + valueB + " = " + calculator.subtr(valueA, valueB));
    }
}
