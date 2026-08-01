/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* prev=NULL;
    TreeNode* first=NULL;
    TreeNode* sec=NULL;

    void helpher(TreeNode* root){
        if(root==NULL){
            return;
        }

        helpher(root->left);

        if(prev!=NULL && prev->val > root->val){
            if(!first){
                first=prev;
            }
            sec=root;
        }
        prev=root;
        
        helpher(root->right);

    }

    void recoverTree(TreeNode* root) {
        helpher(root);
        // if(first && sec){
            swap(first->val,sec->val);
        

    }
};