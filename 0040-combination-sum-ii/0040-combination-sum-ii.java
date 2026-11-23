class Solution {
       
    public void getAllCombo(int[] arr, int target,List<List<Integer>> ans,List<Integer> combo,int idx){

        if(target==0){
            ArrayList<Integer> temp=new ArrayList<>(combo);
            ans.add(temp);
            return;
        }

        if(idx==arr.length || target<0){
            return;
        }

        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }

            if(arr[i]>target){  // taget become negative
                break;
            }

            combo.add(arr[i]);
            getAllCombo(arr,target-arr[i],ans,combo,i+1);
            combo.remove(combo.size()-1);
        }

    }


    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> combo = new ArrayList<>();
        Arrays.sort(arr);
        getAllCombo(arr,target,ans,combo,0);

        return ans;
    }
}