package objets;

import java.awt.*;

public class MyColor {
    private int red;
    private int green;
    private int blue;

    private String color_name;
    private String color_shortName;

    // Constructor
    public MyColor(int r, int g, int b){
        /**
         * Constructor of MyColor from the 3 value RGB
         */

        this.red = r;
        this.green = g;
        this.blue = b;

        autoSetName();
    }

    public MyColor(String str, boolean isShort){
        /**
         * Constructor from a simple string, string should be an implemented color
         * Implemented color at December 8 2019 are :
         * R or RED
         * B or BLUE
         * W or WHITE
         * G or GREEN
         * O or ORANGE
         * Y or YELLOW
         */

        if(isShort)
            this.color_shortName = str;
        else
            this.color_name = str;

        autoSetColor();
        autoSetName();
    }

    public MyColor(MyColor c){
        /**
         * Copy constructor
         */

        // TODO: 08/12/2019 copy constructor
    }

    // Setter

    // Getter
    public int getRed(){
        return this.red;
    }

    public int getGreen(){
        return this.green;
    }

    public int getBlue(){
        return this.blue;
    }

    public String getColor_name() {
        return color_name;
    }

    public String getColor_shortName() {
        return color_shortName;
    }

    // Method
    private void autoSetName(){
        /**
         * This method recognize the color (from the value of the 3chan RGB)
         * And set the attribute color_name and color_shortName of the instance to the correct value
         */

        // Red #FF00000
        if((this.getRed() == 255) && (this.getGreen() == 0) && (this.getBlue() == 0)){
            this.color_name = "RED";
            this.color_shortName = "R";
        }

        // Blue #0000FF
        else if((this.getRed() == 0) && (this.getGreen() == 0) && (this.getBlue() == 255)){
            this.color_name = "BLUE";
            this.color_shortName = "B";
        }

        // White #FFFFFF
        else if((this.getRed() == 255) && (this.getGreen() == 255) && (this.getBlue() == 255)){
            this.color_name = "WHITE";
            this.color_shortName = "W";
        }

        // Green #00FF00
        else if((this.getRed() == 0) && (this.getGreen() == 255) && (this.getBlue() == 0)){
            this.color_name = "GREEN";
            this.color_shortName = "G";
        }
        // Orange #FFCB00
        else if((this.getRed() == 255) && (this.getGreen() == 200) && (this.getBlue() == 0)){
            this.color_name = "ORANGE";
            this.color_shortName = "O";
        }

        // Yellow #FFFF00
        else if((this.getRed() == 255) && (this.getGreen() == 255) && (this.getBlue() == 0)){
            this.color_name = "YELLOW";
            this.color_shortName = "Y";
        }

        // throw an IllegalStateException because there is no other color in the Rubik cube than Red, Green, Blue, Orange, Yellow and white
        else{
            throw new IllegalStateException("@autoSetName : cannot recognize the color - only RGBWYO are supported");
        }
    }

    @Deprecated
    private int autoSetColor(String color_shortName){
        /**
         * Javadoc of Java.awt.Color :https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html
         * information about Color(int rgb) are :
         *      red value is stored in bit 16 to 23
         *      green value is stored in bit 8 to 15
         *      blue value is stored in bit 0 to 7
         *
         * No longer supported - shouldn't be use
         * DO NOT delete if we need what's have been done her for other purpose later on
         */

        // Red #FF0000
        if(this.color_shortName.equalsIgnoreCase("R")){
            return (int)(255*(Math.pow(2,16)) + (0*(Math.pow(2,8))) + 0);
        }

        // Blue #0000FF
        if(this.color_shortName.equalsIgnoreCase("B")){
            return 255;
        }

        // White #FFFFFF
        if(this.color_shortName.equalsIgnoreCase("W")){
            return (int)(255*(Math.pow(2,16)) + (255*(Math.pow(2,8))) + 255);
        }

        // Green #00FF00
        if(this.color_shortName.equalsIgnoreCase("G")){
            return (int)(0*(Math.pow(2,16)) + (255*(Math.pow(2,8))) + 0);
        }

        // Orange #FFCB00
        if(this.color_shortName.equalsIgnoreCase("B")){
            return (int)(255*(Math.pow(2,16)) + (200*(Math.pow(2,8))) + 0);
        }

        // Yellow #FFFF00
        if(this.color_shortName.equalsIgnoreCase("B")){
            return (int)(255*(Math.pow(2,16)) + (255*(Math.pow(2,8))) + 0);
        }

        // throw an IllegalStateException because there is no other color in the Rubik cube than Red, Green, Blue, Orange, Yellow and white
        else{
            throw new IllegalStateException("@autoSetName : cannot recognize the color - only RGBWYO are supported");
        }
    }
    private void autoSetColor(){
        /**
         * This method recognize the color from the attribut color_name or color_shortName
         * and set the correct value of the RGB channel into the attribut red, green and blue of the instance.         *
         */

        // TODO: 08/12/2019 before entering in those if/elseif we have to check that color_name and color_shortName do not define two different color e.g: color_name="RED" and color_shortName="W"
        // Red #FF0000
        if(this.color_shortName.equalsIgnoreCase("R") || this.color_name.equalsIgnoreCase("RED")){
            this.red = 255;
            this.green = 0;
            this.blue = 0;
        }

        // Blue #0000FF
        else if(this.color_shortName.equalsIgnoreCase("B") || this.color_name.equalsIgnoreCase("Blue")){
            this.red = 0;
            this.green = 0;
            this.blue = 255;
        }

        // White #FFFFFF
        else if(this.color_shortName.equalsIgnoreCase("W") || this.color_name.equalsIgnoreCase("WHITE")){
            this.red = 255;
            this.green = 255;
            this.blue = 255;
        }

        // Green #00FF00
        else if(this.color_shortName.equalsIgnoreCase("G") || this.color_name.equalsIgnoreCase("GREEN")){
            this.red = 0;
            this.green = 255;
            this.blue = 0;
        }

        // Orange #FFCB00
        else if(this.color_shortName.equalsIgnoreCase("O") || this.color_name.equalsIgnoreCase("ORANGE")){
            this.red = 255;
            this.green = 200;
            this.blue = 0;
        }

        // Yellow #FFFF00
        else if(this.color_shortName.equalsIgnoreCase("Y") || this.color_name.equalsIgnoreCase("YELLOW")){
            this.red = 255;
            this.green = 255;
            this.blue = 0;
        }

        // throw an IllegalStateException because there is no other color in the Rubik cube than Red, Green, Blue, Orange, Yellow and white
        else{
            throw new IllegalStateException("@autoSetName : cannot recognize the color - only RGBWYO are supported");
        }
    }
}
