
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leo
 */
public class Calculation {
    private String calcString;
    private double subResult;
    private double result;
    private List<String> subCalculation; 
    
    private static final String SQUARE_PATTERN;
    private static final String CUBE_PATTERN;
    private static final String ROOT_PATTERN;
    private static final String PERCENTAGE_PATTERN;            
    private static final String MULTIPLIKATION_PATTERN = '[0-9]+(?(?=\.{1})\.{1}[0-9]+\*{1}|\*{1})[0-9]+(?(?=\.{1})\.{1}[0-9]+|)';
    private static final String ADDITION_PATTERN = '[0-9]+(?(?=\.{1})\.{1}[0-9]+\+{1}|\+{1})[0-9]+(?(?=\.{1})\.{1}[0-9]+|)';
    private static final String SUBSTRACTION_PATTERN = '[0-9]+(?(?=\.{1})\.{1}[0-9]+\-{1}|\-{1})[0-9]+(?(?=\.{1})\.{1}[0-9]+|)';
    private static final String DIVISION_PATTERN = '[0-9]+(?(?=\.{1})\.{1}[0-9]+\/{1}|\/{1})[0-9]+(?(?=\.{1})\.{1}[0-9]+|)';
            
    private void listConstruct() {
        this.subCalculation = new ArrayList();
    }
    private void setCalcString(String calcString) {
        this.calcString = calcString;
    }
    
    public Calculation(String calcString) {
        this.listConstruct();
        this.setCalcString(calcString);
    }
}
