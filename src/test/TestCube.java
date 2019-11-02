package test;

import objets.Cube;

public class TestCube {
    protected Cube c;

    public TestCube(){
        c = new Cube();
    }
    public TestCube(boolean b){
        c = new Cube(b);
    }
}
