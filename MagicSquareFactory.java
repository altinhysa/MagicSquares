
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class MagicSquareFactory {

    
    
    public  MagicSquare createMagicSquare(int size) {

        
        MagicSquare square = new MagicSquare(size);

        
        int row = 0;
        int col = size / 2;

        
        for (int i = 1; i <= size*size; i++) {
            square.placeValue(col, row, i);

            
            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;

            
            if (square.readValue(nextCol, nextRow) != 0) {
                nextRow = (row + 1) % size;
                nextCol = col;
            }

            row = nextRow;
            col = nextCol;
        }

        return square;
    }

}
