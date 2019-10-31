package objets;

import static java.lang.Boolean.TRUE;

public class Cube {

    private int[][] rubiksCube = new int[6][9]; // 1

    public Cube(boolean finished) {
        if (finished == TRUE) {
            this.setFinished();
        } else {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 9; j++) {
                    rubiksCube[i][j] = 0;
                }
            }
        }
    }

    public void pivotFace(int i){
        /* Rotation horaire
        0 1 2     6 3 0
        3 4 5  -> 7 4 1
        6 7 8     8 5 2
         */
        int tmp[] = rubiksCube[i];

        rubiksCube[i][0] = tmp[6];
        rubiksCube[i][1] = tmp[3];
        rubiksCube[i][2] = tmp[0];
        rubiksCube[i][3] = tmp[7];
        rubiksCube[i][5] = tmp[1];
        rubiksCube[i][6] = tmp[8];
        rubiksCube[i][7] = tmp[5];
        rubiksCube[i][8] = tmp[2];
    }

    public void moveRight() {
        // pivot de la face
        pivotFace(2);

        // Rotation des facettes adjascentes
        int tmp1[] = rubiksCube[1];
        int tmp3[] = rubiksCube[3];
        int tmp5[] = rubiksCube[5];
        int tmp6[] = rubiksCube[6];

        rubiksCube[1][2] = tmp6[2];
        rubiksCube[1][5] = tmp6[5];
        rubiksCube[1][8] = tmp6[8];

        rubiksCube[5][8] = tmp1[8];
        rubiksCube[5][5] = tmp1[5];
        rubiksCube[5][2] = tmp1[2];

        rubiksCube[3][0] = tmp5[8];
        rubiksCube[3][3] = tmp5[5];
        rubiksCube[3][6] = tmp5[2];

        rubiksCube[6][2] = tmp3[6];
        rubiksCube[6][5] = tmp3[3];
        rubiksCube[6][8] = tmp3[0];
    }

    public void moveLeft() {
        // pivot de la face
        pivotFace(4);

        // Rotation des facettes adjascentes
        int tmp3[] = rubiksCube[1];
        int tmp1[] = rubiksCube[1];
        int tmp5[] = rubiksCube[1];
        int tmp6[] = rubiksCube[1];

        rubiksCube[1][0] = tmp5[0];
        rubiksCube[1][3] = tmp5[3];
        rubiksCube[1][7] = tmp5[7];

        rubiksCube[6][0] = tmp1[0];
        rubiksCube[6][3] = tmp1[3];
        rubiksCube[6][7] = tmp1[7];

        rubiksCube[3][2] = tmp6[6];
        rubiksCube[3][5] = tmp6[3];
        rubiksCube[3][8] = tmp6[0];

        rubiksCube[5][0] = tmp3[8];
        rubiksCube[5][3] = tmp3[5];
        rubiksCube[5][7] = tmp3[2];
    }

    public void moveBack() {
        // pivot de la face
        pivotFace(3);

        // Rotation des facettes adjascentes
        int tmp2[] = rubiksCube[2];
        int tmp4[] = rubiksCube[3];
        int tmp5[] = rubiksCube[5];
        int tmp6[] = rubiksCube[6];

        rubiksCube[2][2] = tmp6[2];
        rubiksCube[2][5] = tmp6[5];
        rubiksCube[2][8] = tmp6[8];

        rubiksCube[5][8] = tmp2[8];
        rubiksCube[5][5] = tmp2[5];
        rubiksCube[5][2] = tmp2[2];

        rubiksCube[4][0] = tmp5[8];
        rubiksCube[4][3] = tmp5[5];
        rubiksCube[4][6] = tmp5[2];

        rubiksCube[6][2] = tmp4[6];
        rubiksCube[6][5] = tmp4[3];
        rubiksCube[6][8] = tmp4[0];
    }

    public void moveDown() {

    }

    public void moveUp() {
        // pivot de la face
        pivotFace(5);

        // Rotation des facettes adjascentes
        int tmp1[] = rubiksCube[1];
        int tmp2[] = rubiksCube[2];
        int tmp3[] = rubiksCube[3];
        int tmp4[] = rubiksCube[4];

        rubiksCube[3][2] = tmp4[2];
        rubiksCube[3][1] = tmp4[1];
        rubiksCube[3][0] = tmp4[0];

        rubiksCube[2][2] = tmp3[2];
        rubiksCube[2][1] = tmp3[1];
        rubiksCube[2][0] = tmp3[0];

        rubiksCube[1][2] = tmp2[2];
        rubiksCube[1][1] = tmp2[1];
        rubiksCube[1][0] = tmp2[0];

        rubiksCube[4][2] = tmp1[2];
        rubiksCube[4][1] = tmp1[1];
        rubiksCube[4][0] = tmp1[0];
    }

    public void moveFront() {
        // pivot de la face
        pivotFace(1);

        // Rotation des facettes adjascentes
        int tmp2[] = rubiksCube[2];
        int tmp4[] = rubiksCube[4];
        int tmp5[] = rubiksCube[5];
        int tmp6[] = rubiksCube[6];

        rubiksCube[5][6] = tmp4[8];
        rubiksCube[5][7] = tmp4[5];
        rubiksCube[5][8] = tmp4[2];

        rubiksCube[2][0] = tmp5[6];
        rubiksCube[2][3] = tmp5[7];
        rubiksCube[2][6] = tmp5[8];

        rubiksCube[6][2] = tmp2[0];
        rubiksCube[6][1] = tmp2[3];
        rubiksCube[6][0] = tmp2[6];

        rubiksCube[4][8] = tmp6[2];
        rubiksCube[4][5] = tmp6[1];
        rubiksCube[4][2] = tmp6[0];
    }

    public void setFinished() {
        this.rubiksCube[1][1] = 11;
        this.rubiksCube[1][2] = 12;
        this.rubiksCube[1][3] = 13;
        this.rubiksCube[1][4] = 14;
        this.rubiksCube[1][5] = 15;
        this.rubiksCube[1][6] = 16;
        this.rubiksCube[1][7] = 17;
        this.rubiksCube[1][8] = 18;
        this.rubiksCube[1][9] = 19;
        this.rubiksCube[2][1] = 21;
        this.rubiksCube[2][2] = 22;
        this.rubiksCube[2][3] = 23;
        this.rubiksCube[2][4] = 24;
        this.rubiksCube[2][5] = 25;
        this.rubiksCube[2][6] = 26;
        this.rubiksCube[2][7] = 27;
        this.rubiksCube[2][8] = 28;
        this.rubiksCube[2][9] = 29;
        this.rubiksCube[3][1] = 31;
        this.rubiksCube[3][2] = 32;
        this.rubiksCube[3][3] = 33;
        this.rubiksCube[3][4] = 34;
        this.rubiksCube[3][5] = 35;
        this.rubiksCube[3][6] = 36;
        this.rubiksCube[3][7] = 37;
        this.rubiksCube[3][8] = 38;
        this.rubiksCube[3][9] = 39;
        this.rubiksCube[4][1] = 41;
        this.rubiksCube[4][2] = 42;
        this.rubiksCube[4][3] = 43;
        this.rubiksCube[4][4] = 44;
        this.rubiksCube[4][5] = 45;
        this.rubiksCube[4][6] = 46;
        this.rubiksCube[4][7] = 47;
        this.rubiksCube[4][8] = 48;
        this.rubiksCube[4][9] = 49;
        this.rubiksCube[5][1] = 51;
        this.rubiksCube[5][2] = 52;
        this.rubiksCube[5][3] = 53;
        this.rubiksCube[5][4] = 54;
        this.rubiksCube[5][5] = 55;
        this.rubiksCube[5][6] = 56;
        this.rubiksCube[5][7] = 57;
        this.rubiksCube[5][8] = 58;
        this.rubiksCube[5][9] = 59;
        this.rubiksCube[6][1] = 61;
        this.rubiksCube[6][2] = 62;
        this.rubiksCube[6][3] = 63;
        this.rubiksCube[6][4] = 64;
        this.rubiksCube[6][5] = 65;
        this.rubiksCube[6][6] = 66;
        this.rubiksCube[6][7] = 67;
        this.rubiksCube[6][8] = 68;
        this.rubiksCube[6][9] = 69;
    }
}