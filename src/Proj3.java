import java.util.ArrayList;

public class Proj3 {
    // Method declarations
    public static void mergeSort(ArrayList<Object> a, int left, int right){
        // Finish Me
    }

    public static void merge(ArrayList<Object> a, int left, int right, int length){
        // Finish Me
    }

    public static void quickSort(ArrayList<Object> a, int left, int right){
        // Finish Me
    }

    public static int partition (ArrayList<Object> a, int left, int right){
        // Finish Me
    }

    public static void heapSort(ArrayList<Object> a, int left, int right){
        // Finish Me
    }

    public static int heapify (ArrayList<Object> a, int left, int right){
        // Finish Me
    }

    public static int bubbleSort(ArrayList<Object> a, int size){
        // Finish Me
    }

    public static int transpositionSort(ArrayList<Object> a, int size){
        // Finish Me
    }

    public static void main(String [] args){
        //...
        // Finish Me
        //...
        ArrayList<Object> origList=new ArrayList<Object>();   // original list
        ArrayList<Object> mergeList=new ArrayList<Object>();   // list to be sorted via merge sort
        ArrayList<Object> quickList=new ArrayList<Object>();   // list to be sorted via quick sort
        ArrayList<Object> heapList=new ArrayList<Object>();   // list to be sorted via heap sort
        ArrayList<Object> bubbleList=new ArrayList<Object>();   // list to be sorted via bubble sort
        ArrayList<Object> transpositionList=new ArrayList<Object>();   // list to be sorted via transposition sort
        // Fill list
        //...
        // Finish Me
        //...
        // Create a copy from list for quick sort
        for(int i=0;i<origList.size();i++)
            quickList.add(origList.get(i));

        // Make sorted list, shuffled list, and reversed list
        //...
        // Finish Me
        //...


        // sort list using quick sort
        quickSort(quickList, 0, quickList.size());

        // sort list using quick sort
        int bubbleSort(bubbleList, bubbleList.size());
        // sort list using bubble sort
        int transpositionSort(transpositionList, transpositionList.size());
    }
}
