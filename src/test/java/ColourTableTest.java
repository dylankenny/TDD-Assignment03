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


}
