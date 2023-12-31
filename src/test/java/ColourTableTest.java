import java.util.List;

import Assignment03.ColourTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColourTableTest {

    @Test
    public void testTableSize(){
        new ColourTable(2);
        new ColourTable(16);
        new ColourTable(1024);
    }

//    @Test
//    public void checkInvalidTableSizes(){
//        new ColourTable(1025);
//        new ColourTable(3);
//    }

    @Test
    public void checkIfColourIsValid(){
        ColourTable table1 = new ColourTable(2);
        table1.add(255,0,0);
        table1.add(0,255,0);
    }

//    @Test
//    public void checkIfColourIsInvalid(){
//        ColourTable table2 = new ColourTable(2);
//        table2.add(256,0,0);
//        table2.add(256,0,0);
//    }

//    @Test
//    public void CheckIfPaletteIsFull(){
//        ColourTable table2 = new ColourTable(2);
//        table2.add(255,0,0);
//        table2.add(0,255,0);
//        table2.add(0,0,255);
//    }
//    @Test
//    public void CheckPaletteSizeIsInputted(){
//        ColourTable table3 = new ColourTable();
//        table3.add(255,0,0);
//        table3.add(0,255,0);
//    }

    @Test
    public void testToString() throws Exception{
        ColourTable table4 = new ColourTable(4);
        table4.add(255,0,0);
        table4.add(0,255,0);
        table4.add(0,0,255);
        table4.add(255,255,255);
        String output = "Palette:\n0:(255,0,0)\n1:(0,255,0)\n2:(0,0,255)\n3:(255,255,255)\n";
        System.out.println(output);

    }


}
