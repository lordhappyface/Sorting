# Sorting

## Helper Methods

First, you need to implement the code in the `SortProfiler` class to reverse an `int[]` in-place.
The method stub is provided, and it is called `reverse`.

You should add a few tests in the `runTests` method to make sure your reversing method works
correctly.

## Selection Sort

You should implement a selection sort in the method `selectionSort` in the `SortProfiler` class.
It should sort the provided array in-place (meaning that the array passed in as a parameter 
becomes sorted; a new array is not created).

You should add a few tests in the `runTests` method to make sure your selection sort method
works correctly.

You should uncomment the Selection Sort portion of the `main` method. You should also
run the `main` method a few times and record the results in a google document/spreadsheet.

## Insertion Sort

You should implement an insertion sort in the method `insertionSort` in the `SortProfiler` class.
It should sort the provided array in-place (meaning that the array passed in as a parameter 
becomes sorted; a new array is not created).

You should add a few tests in the `runTests` method to make sure your insertion sort method
works correctly.

You should uncomment the Insertion Sort portion of the `main` method. You should also
run the `main` method a few times and record the results in a google document/spreadsheet.

## Merge Sort

You should implement a merge sort in the method `mergeSort` in the `SortProfiler` class.
It should sort the provided array in-place (meaning that the array passed in as a parameter 
becomes sorted). You will need to create new arrays as part of the splitting action, but the
final results should be in the array passed as a parameter.

You will also need to implement the `merge` method as part of the merge sort.

You should add a few tests in the `runTests` method to make sure your merge sort method
works correctly.

You should uncomment the Merge Sort portion of the `main` method. You should also
run the `main` method a few times and record the results in a google document/spreadsheet.

## Comparative Profiling

Test several different datasets (available in the datasets/ directory). This can be done by 
passing an argument to the `main` method when you run it. Where there are `{ }` in the 
dialog after running the `main` method, you can type "datasetN.data", where "N" is any 
number 1-6. The larger the number, the larger the data set.

For each data file, record the data printed. As you get up in dataset size, you might want to
comment out one or more sorting methods due to them taking too long.
