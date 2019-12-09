package objets;

import java.util.ArrayList;

public abstract class Piece {
    /**
     * This class represent any mobile part of the rubik cube
     */

    // Attribute
    protected int x;
    protected int y;
    protected int z;

    // Constructor
    public Piece(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Setter
    // Getter
    // Method
    public void swap(Piece p){
        /**
         * This method do swap the position between the instance this and p
         *
         * This method isn't break proof @Dec-12-2019
         */
        int storage_x = this.x;
        int storage_y = this.y;
        int storage_z = this.z;

        this.x = p.x;
        this.y = p.y;
        this.z = p.z;

        p.x = storage_x;
        p.y = storage_y;
        p.z = storage_z;
    }

    public static void swap(Piece p1, Piece p2){
        /**
         * This method do swap the position between the instance p1 and p2.
         * This is a STATIC method, using two parameter
         *
         * this method isn't break proof @Dec-12-2019
         */

        int storage_x = p1.x;
        int storage_y = p1.y;
        int storage_z = p1.z;

        p1.x = p2.x;
        p1.y = p2.y;
        p1.z = p2.z;

        p2.x = storage_x;
        p2.y = storage_y;
        p2.z = storage_z;
    }
}
