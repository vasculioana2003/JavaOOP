package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author ioana11
 */
public class Calculator {
    
    public static void main(String[] args) throws IOException
    {
        System.out.println("Welcome to calculator. Select an option: 1. Add | 2.Substract | 3. Divide | 4. Multiply | 5. Modulo");
        
        System.out.println("Spreadsheet calculator. Select an option: 6. CellSum | 7. CellIncrement | 8.CellDecrement" );
        
        String inputOption = ReadConsole();
        int option = Integer.parseInt(inputOption);
        
        NumericCalculator numericOperations = new NumericCalculator();
        SpreadSheetCalculator cellOperations = new SpreadSheetCalculator();

        
        double result = 0;
        String input1;
        String input2;
        double x;
        double y;
        
        switch(option)
        {
            case 1:
                System.out.println("First number: ");
                input1 = ReadConsole();
                
                System.out.println("Second number: ");
                input2 = ReadConsole();
                
                x = Double.parseDouble(input1); //conversie explicita
                y = Double.parseDouble(input2);
                
                result = numericOperations.Sum(x, y);
                
                System.out.println("Result:" + result);
                
                break;
            case 2: 
                System.out.println("First number: ");
                input1 = ReadConsole();
                
                System.out.println("Second number: ");
                input2 = ReadConsole();
                
                x = Double.parseDouble(input1); //conversie explicita
                y = Double.parseDouble(input2);
                
                result = numericOperations.Difference(x, y);
                
                System.out.println("Result:" + result);
                                
                
                break;
               
            case 3: 
                System.out.println("First number: ");
                input1 = ReadConsole();
                
                System.out.println("Second number: ");
                input2 = ReadConsole();
                
                x = Double.parseDouble(input1); //conversie explicita
                y = Double.parseDouble(input2);
                
                result = numericOperations.Divide(x, y);
                
                System.out.println("Result:" + result);
                                
                
                break;

            case 4: 
                System.out.println("First number: ");
                input1 = ReadConsole();
                
                System.out.println("Second number: ");
                input2 = ReadConsole();
                
                x = Double.parseDouble(input1); //conversie explicita
                y = Double.parseDouble(input2);
                
                result = numericOperations.Multiply(x, y);
                
                System.out.println("Result:" + result);
                                
                
                break;

            case 5: 
                System.out.println("First number: ");
                input1 = ReadConsole();
                
                System.out.println("Second number: ");
                input2 = ReadConsole();
                
                x = Double.parseDouble(input1); //conversie explicita
                y = Double.parseDouble(input2);
                
                result = numericOperations.Modulo(x, y);
                
                System.out.println("Result:" + result);
                                
                
                break;
            
            case 6:
                System.out.println("First cell value:");
                Cell c1 = new Cell();                
                c1.value = ReadConsole();
                
                System.out.println("Second cell value:");
                Cell c2 = new Cell();                
                c2.value = ReadConsole();
                
                Cell sumResult = cellOperations.Sum(c1, c2);                
                System.out.println("Sum of cells: " + sumResult.value);
                
                cellOperations.Increment(c1);
                cellOperations.Increment(c2);
                cellOperations.Increment(c2);
                System.out.println("Incremented cell 1: " + c1.value);
                
                System.out.println("Incremented cell 2: " + c2.value);
                
                break;

            case 7:
                System.out.println("enter a cell value:");
                Cell c3 = new Cell();                
                c3.value = ReadConsole();

                cellOperations.Increment(c3);

                System.out.println("Incremented cell: " + c3.value);

            break;

            case 8:
                System.out.println("enter a cell value:");
                Cell c4 = new Cell();                
                c4.value = ReadConsole();

                cellOperations.Decrement(c4);

                System.out.println("Decremented cell: " + c4.value);

            break;
            
            //fibonacci
            case 9:
                Fibonacci fib = new Fibonacci();
                System.out.println("enter a number:");
                input1 = ReadConsole();

                x = Integer.parseInt(input1);


                fib.getFibOfN(x);

                // Static, fara instantiere de "fib"
                // Fibonacci.getStaticFibOfN(x);

        }  
    }

    private static String ReadConsole() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String result = reader.readLine();
        
        return result;
    }    
}
