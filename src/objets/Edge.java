package objets;

public class Edge extends Piece {
    /**
     * This class extends piece and represent the "edge" piece of a rubik cube
     * A rubik cube edge do have two color
     */

    // Attribute
    private MyColor c1;
    private MyColor c2;

    // Constructor
    public Edge(int x, int y, int z, MyColor c1, MyColor c2){
        super(x,y,z);

        // Color one
        this.c1 = c1;

        // Color two
        this.c2 = c2;
    }

    public Edge(Edge e){
        /**
         * Copy constructor
         */
        super(e.x, e.y, e.z);
        this.c1 = e.c1;
        this.c2 = e.c2;
    }

    // Setter
    // Getter
    // Method
    @Override
    public String toString() {
        String res = "";
        res += "Edge (" + this.x + "," + this.y + "," + this.y + ") - [" + this.c1.getColor_shortName() + ", " + this.c2.getColor_shortName() + "]";
        return res;
    }
}
