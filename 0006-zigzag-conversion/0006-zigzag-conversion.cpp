// class Solution {
// public:
//     string convert(string s, int numRows) {
//         vector<vector<char>>rows(numRows);
//         int ind=0;
//         int dir=1;
//         if(numRows==1 || numRows>=s.length()){
//             return s;
//         }
        
//         // for(int i=0;i<s.length();i++){
//         //     rows[ind].push_back(s[i]);
//         for(char c:s){
//             rows[ind].push_back(c);
//             if(ind==0){
//                 dir=1;
//             }
//             if(ind==numRows-1){
//                 dir=-1;
//         }
//         ind+=dir;
//         }
//         string str;
//         for(const auto&row:rows){
//             for(auto c:row){
//                 str=str+c;
//             }
//         }
//         return str;
        
//     }
// };
class Solution {
public:
    string convert(string s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int idx = 0, d = 1;
        vector<vector<char>> rows(numRows);

        for (char c : s) {
            rows[idx].push_back(c);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }

        string result;
        for (const auto& row : rows) {
            for (char c : row) {
                result += c;
            }
        }

        return result;        
    }
};