class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>mp=new HashMap<>();
        String[] strs=s.split("\\s+");
        if(strs.length!=pattern.length())return false;
        int i=0;
        for(i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(mp.containsKey(ch)){
                if(!mp.get(ch).equals(strs[i])){
                    return false;
                }
            }else{
                if(mp.containsValue(strs[i])){
                    return false;
                }
            }
            mp.put(ch,strs[i]);
        }
        return true;
    }
}