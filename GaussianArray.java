import java.util.*;
public class GaussianArray {
    private double[][] system;
    
    public GaussianArray (double[][] system) {
        this.system = system;
    }
    
    private void multiply (double k, int rowNumber) {
        for(int i = 0; i < this.system[rowNumber].length; i++) {
            system[rowNumber][i] *= k;
        }
    }
    
    private void swap (int row1, int row2) {
        double[] temp = system[row1];
        system[row1] = system[row2];
        system[row2] = temp;
    }
    
    /**
     * Adds two rows together
     * @param k The scaling factor applied to the first row
     * @param row1 The number of the row to be added to row2
     * @param row2 The number of the row to be replaced after being added to row1
     */
    private void add (double k, int row1, int row2) {
        for(int i = 0; i < this.system[row2].length; i++) {
            system[row2][i] += system[row1][i]*k;
            if(Math.abs(system[row2][i])<0.000000000001)
                system[row2][i] = 0;
        }
    }
    
    public void simplify () {
        for(int i = 0; i < system.length; i++)
            for(int j = i+1; j < system.length; j++)
                add(-system[j][i]/system[i][i], i, j);
    }
    
    public double[][] getSystem () { return this.system; }
    
    public String toString () {
        String out = "";
        for(double[] array : system) {
            out += "[";
            for(double number : array)
                out += " "+number;
            out += " ]\n";
        }
        return out;
    }
}