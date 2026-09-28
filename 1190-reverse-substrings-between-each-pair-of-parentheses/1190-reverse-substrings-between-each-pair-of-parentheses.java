    class Solution {
        public String reverseParentheses(String s) {
            StringBuilder stack1=new StringBuilder();
            StringBuilder stack2=new StringBuilder();
            int n=s.length();
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch==')'){
                    while(stack1.length()>0 && stack1.charAt(stack1.length()-1)!='('){
                        stack2.append(stack1.charAt(stack1.length()-1));
                        stack1.deleteCharAt(stack1.length() - 1);
                    }
                    stack1.deleteCharAt(stack1.length() - 1);
                    stack1.append(stack2);
                    stack2.setLength(0);
                }else{
                    stack1.append(ch);
                }
            }
            return stack1.toString();

        }
    }