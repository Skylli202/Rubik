package objets;

import java.util.ArrayList;

public class Piece {
    protected int x;
    protected int y;
    protected int z;

    protected ArrayList<MyColor> list = new ArrayList<MyColor>();

    public Piece(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
