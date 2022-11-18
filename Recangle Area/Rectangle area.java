class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        if(ax2 < bx1 || bx2 < ax1)
            return (bx2 - bx1) * (by2 - by1) + (ax2 - ax1) * (ay2 - ay1);
 
        if(ay2 < by1 || by2 < ay1)
            return (bx2 - bx1) * (by2 - by1) + (ax2 - ax1) * (ay2 - ay1);
 
        int right = Math.min(ax2, bx2);
        int left = Math.max(ax1, bx1);
        int top = Math.min(by2, ay2);
        int bottom = Math.max(by1, ay1);
 
        return (bx2 - bx1) * (by2 - by1) + (ax2 - ax1) * (ay2 - ay1) - (right-left)*(top-bottom);
    }
}
