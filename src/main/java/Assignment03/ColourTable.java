package Assignment03;

import java.util.ArrayList;
import java.util.List;

public class ColourTable {
    private int NoColours;
    private int count;
    private int[] palette;

    public ColourTable(int NoColours){
        // Checking that the size of the palette is satisfying requirements
        if(NoColours>1024 || (NoColours&(NoColours-1)) !=0){
            throw new IllegalArgumentException("SIze must be a power of 2 and less than 1024");
        }
        // Initializing variables
        this.NoColours = NoColours;
        this.count = 0;
        this.palette = new int[NoColours];
    }

    public void add(int red,int green,int blue) throws IllegalArgumentException {
        CheckRGBValues(red,green,blue);

        int rgb = createRGB(red,green,blue);

        if (CheckDuplication(rgb)){
            return;
        }
        if (CheckIfPaletteIsFull()){
            throw new IllegalArgumentException("Palette is full");
        }
        palette[count++] = rgb;



    }
    private void CheckRGBValues(int red,int green,int blue) {
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
            throw new IllegalArgumentException("Invalid RGB value");
        }
    }

    private int createRGB(int red,int green,int blue){
        return(red << 16) | (green << 8) | blue;
    }

    private boolean CheckDuplication(int rgb){
        //checking if colour is already in the palette
        for(int i =0; i< count; i++){
            if(palette[i] == rgb){
                return true;
            }
        }
        return false;
    }

    private boolean CheckIfPaletteIsFull(){
        return count >= NoColours;
    }




}
