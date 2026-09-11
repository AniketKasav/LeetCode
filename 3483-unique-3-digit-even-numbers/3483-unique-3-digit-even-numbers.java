class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq=new int[10];  // count the freq of each digit
        for(int num:digits){
            freq[num]++;
        }
        
        int ans=0;
        for(int digit1=1;digit1<10;digit1++){
            if(freq[digit1]==0)continue;
            freq[digit1]--;

            for(int digit2=0;digit2<10;digit2++){
                if(freq[digit2]==0)continue;
                freq[digit2]--;

                for(int digit3=0;digit3<=8;digit3+=2){
                    if(freq[digit3]==0)continue;
                    freq[digit3]--;
                    ans++;
                    freq[digit3]++;
                }
                freq[digit2]++;
            }
            freq[digit1]++;
        }
        
        return ans;

    }
}