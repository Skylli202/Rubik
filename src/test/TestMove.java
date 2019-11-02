package test;

public class TestMove extends TestCube{

    public void testMove(int i){

    }

    public void testMoveFront(){ // FACE 1
        System.out.println("Test moveFront");
        c.displayCube();
        c.moveFront();
        c.displayCube();
    }

}
