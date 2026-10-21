class Solution {
    public int minOperations(String s) {
       char[] str=s.toCharArray();
       char[] sorted=s.toCharArray();
       Arrays.sort(sorted);
       if(Arrays.equals(str,sorted)){ 
        return 0;
       }else if(str.length==2){
        return -1;
       } 

        char mn=str[0];
        char mx=str[0];
        for(char ch:str){
            if(ch<mn) mn=ch;
            if(ch>mx) mx=ch;
        }
        //System.out.println("Min "+mn+" max "+mx);
        if(mn==str[0] || mx==str[str.length-1]) return 1;
        boolean flag1=false;
        boolean flag2=false;
        for(int i=0;i<str.length-1;i++){
            if(str[i]==mn) {
                flag1=true;
                break;
            }
        }
        for(int i=1;i<str.length;i++){
            if(str[i]==mx) {
                flag2=true;
                break;
            }
        }

        if(flag1 || flag2){
            return 2;
        }

       return 3;
    }
}