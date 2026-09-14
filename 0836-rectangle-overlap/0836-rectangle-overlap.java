class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // rec1{x1,y1,x2,y2}   rec2{x3,y3,x4,y4}
        int x1=rec1[0];
        int x2=rec1[2];
        int x3=rec2[0];
        int x4=rec2[2];
        int y1=rec1[1];
        int y2=rec1[3];
        int y3=rec2[1];
        int y4=rec2[3];
        int commonWidth=Math.min(x2,x4)-Math.max(x1,x3);
        int commonHeight=Math.min(y2,y4)-Math.max(y1,y3);

        return (commonWidth>0 && commonHeight>0)?true:false;
    }
}