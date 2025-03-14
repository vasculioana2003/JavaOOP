package lab2;

/**
 *
 * @author ioana11
 */
class Cell {
    String value;
}

public class SpreadSheetCalculator{
    
    public Cell Sum(Cell c1, Cell c2)
    {
        Cell cellResult = new Cell();
        Double result = Double.parseDouble(c1.value) + Double.parseDouble(c2.value);
        
        cellResult.value = result.toString();
        
        return cellResult;
    }
    
    public void Increment(Cell c1) 
    {
        Double convertedValue = Double.parseDouble(c1.value);
        
        convertedValue++;
        
        c1.value = convertedValue.toString();
    }

    public void Decrement(Cell c1) 
    {
        Double convertedValue = Double.parseDouble(c1.value);
        
        convertedValue--;
        
        c1.value = convertedValue.toString();
    }


}

