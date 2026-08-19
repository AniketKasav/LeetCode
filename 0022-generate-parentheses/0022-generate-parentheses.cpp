class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string>v;
        dfs(0,0,"",n,v);
        return v;
        
    }
    void dfs(int open,int close,string s,int n,vector<string>&v){
        if(open==close && open+close==n*2){
            v.push_back(s);
            return;
        }
        if(open<n){
           dfs(open+1,close,s+"(",n,v);

        }
        if(close<open){
            dfs(open,close+1,s+")",n,v);
        }
    }

};