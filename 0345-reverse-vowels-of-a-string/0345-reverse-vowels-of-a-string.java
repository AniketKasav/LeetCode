class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        HashSet<Character> set=new HashSet(Arrays.asList('a','i','o','u','e','A','I','O','U','E'));
        while(l<r){
            while(l<r && !set.contains(sb.charAt(l))){
                l++;
            }
            while(l<r && !set.contains(sb.charAt(r))){
                r--;
            }
            char temp=sb.charAt(l);
            sb.setCharAt(l,sb.charAt(r));
            sb.setCharAt(r,temp);
            l++;
            r--;
        }
        return sb.toString();
    }
}