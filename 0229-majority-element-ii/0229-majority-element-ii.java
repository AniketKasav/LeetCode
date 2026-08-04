class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // here we use the Boyer-Moore Voting Algorithm
        int n=nums.length;
        if(n==1)return List.of(nums[0]); //immutable list
        int cand1=0;
        int cand2=1;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(num==cand1){
                count1++;
            }else if(num==cand2){
                count2++;
            }else if(count1==0){  // && num!=cand2
                cand1=num;
                count1=1;
            }else if(count2==0){  // && num!=cand1
                cand2=num;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        int newcount1=0;
        int newcount2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==cand1)newcount1++;
            if(nums[i]==cand2)newcount2++;
        }
        ArrayList<Integer>ls=new ArrayList<>();
        if(newcount1>n/3)ls.add(cand1);
        if(newcount2>n/3 && cand1!=cand2)ls.add(cand2);
        return ls;
    }
}