/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @param {number} d
 * @return {number}
 */
var findTheDistanceValue = function(arr1, arr2, d) {
    var ans=0;
    for(let a of arr1){
        let flag=true;
        for(let b of arr2){
            if(Math.abs(a-b)<=d){
                flag=false;
                break;
            }
            //console.log(flag)
        }
        //console.log(flag)
        console.log(ans)
        if(flag){
            ans++;
        }
    }
    return ans;


};