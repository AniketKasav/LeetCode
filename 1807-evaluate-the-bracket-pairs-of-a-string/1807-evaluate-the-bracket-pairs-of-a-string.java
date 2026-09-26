class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> mp=new HashMap<>();
        for(List<String> ls:knowledge){
            mp.put(ls.get(0),ls.get(1));
        }
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                int j=i+1;
                while(s.charAt(i)!=')'){
                    i++;
                }
                String key=s.substring(j,i);
                if(mp.containsKey(key)){
                    sb.append(mp.get(key));
                }else{
                    sb.append('?');
                }
                
                
            }else{
                sb.append(s.charAt(i));
            }
        
        }
        return sb.toString();
    }
}