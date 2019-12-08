package objets;

import java.awt.*;

public class MyColor extends Color{
    private String color_name;
    private String color_shortName;

    // Constructor
    public MyColor(int r, int g, int b){
        super(r,g,b);
        autoSetName();
    }

    // Setter

    // Getter
    public String getColor_name() {
        return color_name;
    }

    public String getColor_shortName() {
        return color_shortName;
    }

    // Method
    private void autoSetName(){
        // Red #FF00000
        // Blue #0000FF
        // White #000000
        // Green #00FF00
        // Orange #FFCB00
        // Yellow #FFFF00
    }
}
