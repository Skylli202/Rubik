package objets;

public class Edge extends Piece {
    private MyColor c1;
    private MyColor c2;

    public Edge(int x, int y, int z, MyColor c1, MyColor c2){
        super(x,y,z);

        // Color one
        this.c1 = c1;
        this.list.add(this.c1);

        // Color two
        this.c2 = c2;
        this.list.add(this.c2);
    }

    @Override
    public String toString() {
        String res = "";
        res += "Edge (" + this.x + "," + this.y + "," + this.y + ") - [" + this.c1.getColor_shortName() + ", " + this.c2.getColor_shortName() + "]";
        return res;
    }
}
