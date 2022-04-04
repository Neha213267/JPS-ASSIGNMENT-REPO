function SortedMerge(arr, arr1) {
    let sortedArr = [] 
    while (arr.length && arr1.length) {
      
      if (arr[0] < arr1[0]) {
        sortedArr.push(arr.shift())
      } else {
        sortedArr.push(arr1.shift())
      }
    }
    return [...sortedArr, ...arr, ...arr1]
  }
  console.log(SortedMerge([1,2,3], [5, 6, 7]))

  