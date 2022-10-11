package leetCode.rectangleOverlap;

public class RectangleOverlap {

    /*836. Rectangle Overlap*/


    /*   rec1 = [0,0,2,2]      rec2 = [1,1,3,3]*/

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec1[2] > rec2[0] && rec1[3] > rec2[1];
    }
}
