package Assignment03;

import java.util.ArrayList;
import java.util.List;

public class ColourTable {
    private int NoColours;
    private int count;
    private int[] palette;

    public ColourTable(int NoColours){
        if(NoColours>1024 || (NoColours&(NoColours-1)) !=0){
            throw new IllegalArgumentException("SIze must be a power of 2 and less than 1024");
        }
        this.NoColours = NoColours;
        this.count = 0;
        this.palette = new int[NoColours];
    }



}
