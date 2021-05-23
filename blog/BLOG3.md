# Quick Sort

## problem domain:
- write a function for quick sort, which takes in an unsorted array and returns the array sorted using a quick sort algorithm.
- QuickSort is a Divide and Conquer  algorithm. It picks an element as pivot and partitions the given array around the picked pivot.

## Algorithm:
- dividing the array by choosing element in the subarray(pivot) .
- arranging the array , left side is smaller and right side is greater than the pivot.
- conquers by recursively sorting the sub arrays.

## Pseudocode:
![](https://github.com/AyaaBe95/data-structures-and-algorithms401/blob/main/assests/quicksortcode.PNG)


## Trace:
![](https://github.com/AyaaBe95/data-structures-and-algorithms401/blob/main/assests/quick.jpeg)


## Big-O:
### Time:
1. Worst case is O(n^2) : It occurs when the partition process always picks greatest or smallest element as pivot. ( T(n) = T(0) + T(n-1) + \theta(n) )
2. Expected is O(n log n): It occurs when the partition process always picks the middle element as pivot. ( T(n) = 2T(n/2) + \theta(n) )

### Space:
- O(1):it does not need adding any new storage.
