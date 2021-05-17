# Merge sort
 
## problem domain:
- create method that accept an array of unsorted integers and sort them by divide the array into two halves.
## How it works?:
- Merge Sort is a Divide and Conquer an algorithm. It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.
## Algorithm:
- mergeSort method take an array
- declare n=arr.length
- if n>1 divide the array 
- declare left = arr[0...mid]
- declare right = arr[mid...n]
- keep divide them by calling mergeSort method for left and right.
- merge them.
- merge method take arr,left,right
- i,j,k=0
- while loop
- if left[i] less or equal right[j]
- replace arr[k] by left value and increase i 
- else arr[k] = right[j] and increase j
- k++

## Pseudocode:
ALGORITHM Mergesort(arr)
DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
DECLARE i <-- 0
DECLARE j <-- 0
DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left



## Diagram:
![](https://github.com/AyaaBe95/data-structures-and-algorithms401/blob/main/assests/merge-sort.png)


## Big-O:
- Time: O(n log n)
- Space : O(n)




