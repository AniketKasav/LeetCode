class Solution {
    public boolean isValidSudoku(char[][] board) {
    //   (row / 3) * 3 + (col / 3) use this formula to calculate the box number 

        ArrayList<HashSet<Character>> row=new ArrayList<>();
        ArrayList<HashSet<Character>> col=new ArrayList<>();
        ArrayList<HashSet<Character>> box=new ArrayList<>();
        for(int i=0;i<9;i++){
            row.add(new HashSet<Character>());
            col.add(new HashSet<Character>());
            box.add(new HashSet<Character>());
        }
        int rows=board.length;
        int cols=board[0].length;

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                char ele=board[r][c];
                if(ele=='.')continue;
                int b=(r/3)*3+(c/3);
                if(row.get(r).contains(ele) || col.get(c).contains(ele) || box.get(b).contains(ele))return false;
                row.get(r).add(ele);
                col.get(c).add(ele);
                box.get(b).add(ele);
            }
        }
        return true;

    }
}