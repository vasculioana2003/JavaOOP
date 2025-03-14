/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import lab2.*;

/**
 *
 * @author alexb
 */
class Cell {
    String value;
    
    int row = 0;    
    char column;
    
    static int totalCells = 0;
    
    public Cell()
    {
        value = "";
        row = 1;
        column = 'A';
        
        totalCells++;
    }
    
    public Cell(String value, int row, char column)
    {
        this.value = value;
        this.row = row;
        this.column = column;
        
        totalCells++;
    }
    
}

public class SpreadSheetCalculator{
    
    public Cell Sum(Cell c1, Cell c2)
    {
       Double result = Double.parseDouble(c1.value) + Double.parseDouble(c2.value);
        
        Cell cellResult = new Cell(result.toString(), c1.row, 'R');
       // cellResult.value = result.toString(); - no need
        
        return cellResult;
    }
    
    public void Increment(Cell c1)
    {
        Double convertedValue = Double.parseDouble(c1.value);
        
        convertedValue++;
        
        c1.value = convertedValue.toString();
   }
}

