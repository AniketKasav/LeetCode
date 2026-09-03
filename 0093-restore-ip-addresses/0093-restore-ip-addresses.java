class Solution {
    public List<String> restoreIpAddresses(String s) {
        //base condition idx+choice==length
        // ans.add(curr[0]+"."+curr[1]+"."+curr[2]+"."+curr[3]+"."+curr[4]);
        //for (int choice = 3; choice >= 1; choice--) {
    // take substring
    // check valid
    // if valid -> recurse with idx + choice
    // after recursion -> remove from curr
    //}
        ArrayList<String> curr=new ArrayList<>();
        ArrayList<String> ans=new ArrayList<>();
        address(s,0,curr,ans);
        return ans;
    }

    public void address(String s,int idx,ArrayList<String> curr,ArrayList<String> ans){
        if(curr.size()==4 ){
            if(idx==s.length()){
                 ans.add(curr.get(0)+"."+curr.get(1)+"."+curr.get(2)+"."+curr.get(3));
            }
            return;
        }

        for(int choice=1;choice<=3;choice++){
            if(idx + choice > s.length()) {
                break;
            }
            String subpart=s.substring(idx,idx+choice);
            if(choice>1 && subpart.charAt(0)=='0'){
                continue;
            }
            if(Integer.parseInt(subpart)>255){
                continue;
            }
            curr.add(subpart);
            address(s,idx+choice,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}