package objets;

import java.awt.*;
import java.util.ArrayList;

public class Cube {
    /**
     * This class represente the cube
     * it do have 8 corners, each of them are unique
     * and 12 edge, each of them are unique
     * and 6 center that aren't movable piece : no class for them
     *
     */

    // Attribute
    private CollectionOfPiece collecOfPiece = new CollectionOfPiece();

    // Corner - level 0
    private Corner x0y0z0;
    private Corner x2y0z0;
    private Corner x0y2z0;
    private Corner x2y2z0;

    // Corner - level 2
    private Corner x0y0z2;
    private Corner x2y0z2;
    private Corner x0y2z2;
    private Corner x2y2z2;

    // Edge - level 0
    private Edge x1y0z0;
    private Edge x0y1z0;
    private Edge x2y1z0;
    private Edge x1y2z0;

    // Edge - level 1
    private Edge x1y0z1;
    private Edge x0y1z1;
    private Edge x2y1z1;
    private Edge x1y2z1;

    // Edge - level 1
    private Edge x1y0z1;
    private Edge x0y1z1;
    private Edge x2y1z1;
    private Edge x1y2z1;

    // Constructor
    // Setter
    // Getter
    // Method
    @Override
    public String toString(){
        /**
         * Affichage textuelle de l'état du Cube
         */
        String res = "";
        String spacing = "      ";
        String endl = "\n";

        res += spacing + x0y0z2.

        return res;
    }
}
