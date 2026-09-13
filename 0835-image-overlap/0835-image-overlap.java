class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        // Create two lists to store positions of 1s from both images.
        // Traverse both matrices and add [row, col] whenever you find 1.
        // Create Map<String, Integer> for movement frequency.
        // For every position in img1, compare with every position in img2.
        // Calculate movement:
        // rowDiff = r2 - r1, colDiff = c2 - c1
        // Create a movement key like "rowDiff,colDiff".
        // Increase its count in the map.
        // Find the maximum count in the map.
        // That maximum count is the maximum overlap.
        List<int[]> img1Ones = new ArrayList<>();
        List<int[]> img2Ones = new ArrayList<>();
        int n=img1.length;

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(img1[r][c]==1){
                    img1Ones.add(new int[]{r,c});
                }
                if(img2[r][c]==1){
                    img2Ones.add(new int[]{r,c});
                }
            }
        }

        Map<String,Integer>mp=new HashMap<>();

        for(int[] pos1:img1Ones){
            int r=pos1[0];
            int c=pos1[1];
            for(int[] pos2:img2Ones){
                int r1=pos2[0];
                int c1=pos2[1];
                String movement=(r-r1)+","+(c-c1);
                mp.put(movement,mp.getOrDefault(movement,0)+1);
            }
        }
        int ans=0;
        for(int val:mp.values()){
            if(val>ans)ans=val;
        }
        return ans;
    }
}