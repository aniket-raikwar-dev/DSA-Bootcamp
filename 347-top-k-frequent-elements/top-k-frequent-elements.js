/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    const map = new Map();
    const freqList = [];
    for(let i=0; i<nums.length; i++) {
        freqList.push([]);
       if(!map.has(nums[i])) map.set(nums[i], 1);
       else {
         map.set(nums[i], map.get(nums[i]) + 1);
        }
    }
   map.forEach((value, key) => {
     if(!freqList[value]) {
      freqList[value] = [];
     }
     freqList[value].push(key);
    });

    const ans = [];
    for(let i=freqList.length - 1; i >=0; i--) {
    const subArray = freqList[i];
    if(subArray.length !== 0) {
        for(let j = 0; j<subArray.length; j++) {
            ans.push(subArray[j]);
            if(ans.length === k) return ans;
        }
    }
}


};