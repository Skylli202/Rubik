package objets;

import java.awt.*;

public class Corner extends Piece {
    /**
     *
     */

    // Attribute
    private MyColor c1;
    private MyColor c2;
    private MyColor c3;

    // Constructor
    public Corner(int x, int y, int z, MyColor c1, MyColor c2, MyColor c3){
        // Call parent constructor
        super(x,y,z);

        // Color one
        this.c1 = c1;

        // Color two
        this.c2 = c2;

        // Color three
        this.c3 = c3;
    }

    public Corner(Corner c){
        /**
         * Copy constructor
         */
        super(c.x, c.y, c.z);
        this.c1 = c.c1;
        this.c2 = c.c2;
        this.c3 = c.c3;
    }

    // Setter
    // Getter
    // Method
    @Override
    public String toString() {
        String res = "";
        res += "Corner (" + this.x + "," + this.y + "," + this.y + ") - [" + this.c1.getColor_shortName() + ", " + this.c2.getColor_shortName() + ", " + this.c3.getColor_shortName() + "]";
        return res;
    }
}
