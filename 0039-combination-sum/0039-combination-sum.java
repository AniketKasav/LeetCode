class Solution {
        // use hashset for the unique elements
    HashSet<List<Integer>> set=new HashSet<>();
    public void getAllCombo(int[] candidates, int target,List<List<Integer>> ans,List<Integer> combo,int idx){
        
        if(candidates.length==0) return;

        if(idx==candidates.length || target<0){
            return;
        }

        if(target==0){
            if(!set.contains(combo)){
                ans.add(new ArrayList<Integer>(combo));
                set.add(new ArrayList<Integer>(combo));
            }
            return;
        }
        combo.add(candidates[idx]);
        
        getAllCombo(candidates,target-candidates[idx],ans,combo,idx);
        getAllCombo(candidates,target-candidates[idx],ans,combo,idx+1);
       
        combo.remove(Integer.valueOf(candidates[idx]));

        getAllCombo(candidates,target,ans,combo,idx+1);

    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> combo = new ArrayList<>();

        getAllCombo(candidates,target,ans,combo,0);

        return ans;
    }
}