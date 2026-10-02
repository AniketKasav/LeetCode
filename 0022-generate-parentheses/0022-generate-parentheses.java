class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        generator(result,n,0,0,sb);
        return result;
    }

    void generator(List<String> result,int n,int o,int c,StringBuilder sb){
        if(o+c==2*n){
            result.add(sb.toString());
            return;
        }
        if(o<n){
            sb.append('(');
            generator(result,n,o+1,c,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(c<o){
            sb.append(')');
            generator(result,n,o,c+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}