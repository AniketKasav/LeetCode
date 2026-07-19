class Solution {
    public int maximalSquare(char[][] m) {
        int row=m.length;
        int col=m[0].length;
        int largest=0;
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if (i == row - 1 || j == col - 1) {
                    if (m[i][j] == '1') {
                    largest = Math.max(largest, 1);
                    }
                     continue;
                }
                if (m[i][j] == '0') {
                    continue;
                }
                int right=(m[i+1][j]-'0');
                int down=(m[i][j+1]-'0');
                int corner=(m[i+1][j+1]-'0');
                int minval=Math.min(right,Math.min(down,corner));
                minval+=1;
                largest=(largest<minval)?minval:largest;
                m[i][j]=(char)(minval+'0');
            }
        }
        //largest+=1;
        return largest*largest;
    }
}