class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //sort each string and store the sorted string as key and then add the each strign as value 
        HashMap<String,ArrayList<String>>mp=new HashMap<>();
        for(String s:strs){
            char[] chrs=s.toCharArray();
            Arrays.sort(chrs);
            String key=new String(chrs);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(s);
        }

        List<List<String>>ans=new ArrayList<>(mp.values());
        return ans;
        
    }
}