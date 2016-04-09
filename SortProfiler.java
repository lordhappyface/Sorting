import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This driver loads a dataset from a file and sorts it in several ways
 * It also keeps track of how long each sort took
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortProfiler
{
    /** Loads a dataset file (dataset1.txt by default, or provide a filename as args[0])
     *  Then it sorts that dataset in several ways.
     */
    public static void main(String[] args)
    {
        List<String> dataset;
        if (args.length > 0)
            dataset = loadDataset(args[0]);
        else
            dataset = loadDataset("dataset1.txt");
            
        long start, stop;
        
        //Selection Sort
        //int[] datasetCopy1 = copyDataset(dataset);
        //start = System.nanoTime();
        //selectionSort(datasetCopy1);
        //stop = System.nanoTime();
        //System.out.println("Selection sort on " + datasetCopy1.length + " unsorted items took " + (stop-start) + "ns");
        
        //start = System.nanoTime();
        //selectionSort(datasetCopy1);
        //stop = System.nanoTime();
        //System.out.println("Selection sort on " + datasetCopy1.length + " sorted items took " + (stop-start) + "ns");
        
        //start = System.nanoTime();
        //selectionSort(reverse(datasetCopy1));
        //stop = System.nanoTime();
        //System.out.println("Selection sort on " + datasetCopy1.length + " reverse sorted items took " + (stop-start) + "ns");
        
        //Insertion Sort
        //int[] datasetCopy2 = copyDataset(dataset);
        //start = System.nanoTime();
        //insertionSort(datasetCopy2);
        //stop = System.nanoTime();
        //System.out.println("Insertion sort on " + datasetCopy2.length + " unsorted items took " + (stop-start) + "ns");
        
        //start = System.nanoTime();
        //insertionSort(datasetCopy2);
        //stop = System.nanoTime();
        //System.out.println("Insertion sort on " + datasetCopy2.length + " sorted items took " + (stop-start) + "ns");
        
        //start = System.nanoTime();
        //insertionSort(reverse(datasetCopy2));
        //stop = System.nanoTime();
        //System.out.println("Insertion sort on " + datasetCopy2.length + " reverse sorted items took " + (stop-start) + "ns");
        
        //Merge Sort
        //int[] datasetCopy3 = copyDataset(dataset);
        //start = System.nanoTime();
        //mergeSort(datasetCopy3);
        //stop = System.nanoTime();
        //System.out.println("Merge sort on " + datasetCopy3.length + " unsorted items took " + (stop-start) + "ns");
        
        //start = System.nanoTime();
        //mergeSort(datasetCopy3);
        //stop = System.nanoTime();
        //System.out.println("Merge sort on " + datasetCopy3.length + " sorted items took " + (stop-start) + "ns");
        
        //start = System.nanoTime();
        //insertionSort(reverse(datasetCopy3));
        //stop = System.nanoTime();
        //System.out.println("Merge sort on " + datasetCopy3.length + " reverse sorted items took " + (stop-start) + "ns");
        
        
    }
    
    /**
     *  Runs tests relating to the profiler.
     */
    public static void runTests()
    {
        
    }
    
    /** Reads the specified dataset file and returns a List whose
     *  entries are the values of the lines in the file.
     *  @param filename the name of the file in ./datasets/ to read
     *  @return the lines of the file (or null if the file was not found or could not be read)
     */
    private static List<Integer> loadDataset(String filename)
    {
        Path datasetFile = Paths.get("datasets", filename);
        List<Integer> datasetContent;
        try
        {
            datasetContent = Files.readAllLines(mazeFile, Charset.forName("UTF-8"))
                                  .stream()
                                  .map(e -> Integer.parseInt(e))
                                  .collect(Collectors.toList());
        }
        catch (java.io.IOException e)
        {
            datasetContent = null;
        }
        
        return datasetContent;
    }
    
    /**
     *  Creates a copy of a dataset as an int[]
     *  @param dataset the data set to copy
     *  @return the int[] copy of the dataset
     */
    private static int[] copyDataset(List<Integer> dataset)
    {
        int[] data = new int[dataset.size()];
        for(int i = 0; i < list.size(); i++) data[i] = dataset.get(i);
        return data;
    }
    
    /**
     *  Reverses an array of integers in-place.
     *  @param int[] arr the array of integers to reverse
     *  
     *  Postcondition: the array is in the reverse order
     */
    private static void reverse(int[] arr)
    {
        
    }   
    
    
    /**
     *  Sorts the provided array in-place using selection sort
     *  @param arr the array to sort
     */
    public static void selectionSort(int[] arr)
    {
        
    }
    
    /**
     *  Sorts the provided array in-place using insertion sort
     *  @param arr the array to sort
     */
    public static void insertionSort(int[] arr)
    {
        
    }
    
    /**
     *  Sorts the provided array in-place using merge sort
     *  @param arr the array to sort
     */
    public static void mergeSort(int[] arr)
    {
        
    }
    
    /**
     *  Merges two sorted arrays into one
     *  @param arr1 the first array to merge
     *  @param arr2 the second array to merge
     *  @param target the array to merge into
     *  
     *  Preconditions: arr1 and arr2 are sorted; target.length = arr1.length + arr2.length
     *  Postcondition: target holds the merged values from arr1 and arr2
     */
    private static void merge(int[] arr1, int[] arr2, int[] target)
    {
        
    }
}
