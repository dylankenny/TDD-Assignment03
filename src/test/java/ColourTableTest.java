import java.util.List;

import Assignment03.ColourTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColourTableTest {

    @Test
    public void testTableSize(){
        new ColourTable(2);
        new ColourTable(16);
        new ColourTable(1024);
    }

    @Test
    public void checkInvalidTableSizes(){
        new ColourTable(1025);
        new ColourTable(3);
    }

    @Test
    public void checkIfColourIsValid(){
        ColourTable table1 = new ColourTable(2);
        table1.add(255,0,0);
        table1.add(0,255,0);
    }


}
