package test;

public class TestPivot extends TestCube{

    public void TestPivot(int i){ // ALL test pass successfully 02/11 - elouan
        switch (i){
            case 1:
                TestPivot1(); // Test pass successfully 02/11 - elouan
                break;
            case 2:
                TestPivot2(); // Test pass successfully 02/11 - elouan
                break;
            case 3:
                TestPivot3(); // Test pass successfully 02/11 - elouan
                break;
            case 4:
                TestPivot4(); // Test pass successfully 02/11 - elouan
                break;
            case 5:
                TestPivot5(); // Test pass successfully 02/11 - elouan
                break;
            case 6:
                TestPivot6(); // Test pass successfully 02/11 - elouan
                break;
            default:
                System.out.println("The face number : " + i + " does not exist.");
        }
    }

    public void TestPivot1(){
        System.out.println("Test pivotFace on face 1");
        c.displayCube();
        c.pivotFace(1);
        c.displayCube();
    }

    public void TestPivot2(){
        System.out.println("Test pivotFace on face 2");
        c.displayCube();
        c.pivotFace(2);
        c.displayCube();
    }

    public void TestPivot3(){
        System.out.println("Test pivotFace on face 3");
        c.displayCube();
        c.pivotFace(3);
        c.displayCube();
    }

    public void TestPivot4(){
        System.out.println("Test pivotFace on face 4");
        c.displayCube();
        c.pivotFace(4);
        c.displayCube();
    }

    public void TestPivot5(){
        System.out.println("Test pivotFace on face 5");
        c.displayCube();
        c.pivotFace(5);
        c.displayCube();
    }

    public void TestPivot6(){
        System.out.println("Test pivotFace on face 6");
        c.displayCube();
        c.pivotFace(6);
        c.displayCube();
    }
}
