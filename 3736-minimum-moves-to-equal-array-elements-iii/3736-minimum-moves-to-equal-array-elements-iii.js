/**
 * @param {number[]} nums
 * @return {number}
 */
var minMoves = function(nums) {
    let max=Number.MIN_SAFE_INTEGER;
    for(let num of nums){
        if(num>max){
            max=num;
        }
    }

    let ans=0;

    for(let num of nums){
        ans+=(max-num);
    }
    return ans;
};