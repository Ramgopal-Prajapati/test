//  largest / smallest multiple number in array 
// i can find k number of smalest / larges element in array 
// a={9,5,2,3,7,6,8,1}
// k=2
// output: [1,2] or [8,9]
// a={56,45,89,67,54,23,87,55}
// k=3
// output :[23,45] , [89,87]

// import java.util.*;
// class main {
//     public static int[] kthelement(int[] a, int k) {
//         int n = a.length;
//         Arrays.sort(a);
//         int[] result = new int[k];
//         for (int i = 0; i < k; i++) {
//             result[i] = a[n - 1 - i];
//         }
//         return result;
//     }

//     public static void main(String args[]) {
//         int[] a = {4, 6, 8, 2, 9, 5, 1, 3};
//         int k = 2;
//         System.out.println(Arrays.toString(kthelement(a, k)));
//     }
// }


// import java.util.*;

// class Main {
//     public static int[] kthelement(int[] a, int k) {
//         // Step 1: Remove duplicates by using a TreeSet (which keeps elements sorted)
//         Set<Integer> uniqueElements = new TreeSet<>(Collections.reverseOrder());
//         for (int num : a) {
//             uniqueElements.add(num);
//         }

//         // Step 2: Convert the set to a list and get the top k elements
//         List<Integer> uniqueList = new ArrayList<>(uniqueElements);
//         int[] result = new int[k];
//         int [] result = new int[Math.min(k, uniqueList.size())];
//         for (int i = 0; i < result.length; i++) {
//             result[i] = uniqueList.get(i);
//         }
//         return result;
//     }

//     public static void main(String args[]) {
//         int[] a = {4, 6, 8, 2, 9, 5, 1, 3, 6, 8, 2, 9,9,9};
//         int k = 3;
//         System.out.println(Arrays.toString(kthelement(a, k)));
//     }
// }


// Sorting an array requires 𝑂(𝑛log⁡𝑛)O(nlogn) time for comparison-based sorts (like quicksort or mergesort used by Arrays.sort for primitive types).Extracting 𝑘 k elements in 𝑂(𝑘)O(k) is much less significant when 𝑛n grows large, as 𝑂(𝑛log⁡𝑛)O(nlogn) grows faster than 𝑂(𝑘)O(k). Thus, 𝑂(𝑛log⁡𝑛)O(nlogn) is the upper bound of the program's time complexity.

//===============================================================================================

// check array are equal or not




// import java.util.Arrays;

// class Main {
//     public static boolean areArraysEqual(int[] arr1, int[] arr2) {
//         // Use Arrays.equals() to check if arrays are equal
//            Arrays.sort(arr1);
//            Arrays.sort(arr2);
//         return Arrays.equals(arr1, arr2);
//     }

//     public static void main(String[] args) {
//         int[] array1 = {1, 2, 3, 4, 5};
//         int[] array2 = {1, 2, 3, 4, 5};
//         int[] array3 = {1, 2, 3, 5, 4};

//         System.out.println("array1 and array2 are equal: " + areArraysEqual(array1, array2)); // true
//         System.out.println("array1 and array3 are equal: " + areArraysEqual(array1, array3)); // false
//     }
// }



// import java.util.Arrays;
// class main{
//     public static boolean checkarrayequalornot(int a1 [],int a2[]){
//         Arrays.sort(a1);
//         Arrays.sort(a2);
//         for(int i=0; i<a1.length;i++){
//             if(a1[i]!=a2[i]){
//                 return false;
//             }
//         }
//         return true;

//     }
//     public static void main(String args []){
//         int []a1 ={3,5,2,7,9,8};
//         int [] a2 ={5,2,8,3,7,7,9};
//         int []a3={1,4,3,7,8};
//         System.out.println(checkarrayequalornot(a1,a2)); // true
//         System.out.println(checkarrayequalornot(a1,a3)); // false

//     }
// }

//===============================================================================================


// missing number in array , single or multiple

// class Main {
//     public static int findMissingNumber(int[] a) {
//         int n = a.length + 1; // Total numbers should be n if one is missing

//         // Find the minimum and maximum values in the array
//         int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//         int actualSum = 0;
        
//         for (int num : a) {
//             min = Math.min(min, num);
//             max = Math.max(max, num);
//             actualSum += num;
//         }

//         // Calculate the expected sum from min to max
//         int expectedSum = (max * (max + 1) / 2) - ((min - 1) * min / 2);

//         // The difference is the missing number
//         return expectedSum - actualSum;
//     }

//     public static void main(String[] args) {
//         int[] a = {5, 6, 3, 2, 1};
//         System.out.println("Missing number: " + findMissingNumber(a)); // Output should be 4
//     }
// }



// import java.util.*;

// class Main {
//     public static List<Integer> findMissingNumbers(int[] a, int min, int max) {
//         Set<Integer> numbersSet = new HashSet<>();
//         for (int num : a) {
//             numbersSet.add(num);
//         }

//         List<Integer> missingNumbers = new ArrayList<>();
//         for (int i = min; i <= max; i++) {
//             if (!numbersSet.contains(i)) {
//                 missingNumbers.add(i);
//             }
//         }
//         return missingNumbers;
//     }

//     public static void main(String[] args) {
//         int[] a = {5, 6, 2, 1}; // Let's say numbers are in the range from 1 to 7
//         int min = 1;
//         int max = 7;
//         System.out.println("Missing numbers: " + findMissingNumbers(a, min, max)); // Output should be [4, 7]
//     }
// }


// import java.util.*;

// class main{
//     public static int [] kelementlargestsmallest(int a[], int k){
//         Arrays.sort(a);
//         int result []= new int[k];
//         int n= a.length;
//         for(int i=0; i<k; i++){
//             result[i]=a[n-1-i];
//         }
//          return result;
//     }
//     public static void main(String args[]){
//     //     int a[];
//     //     int n=a.length;
//     //    System.out.println("Enter Array element value");

//     //     for(int i=0; i<n; i++){
//     //         a[i]=sa.nextInt();
//     //     }
//     int a[]={2,5,4,3,8,9,6,7};
//        Scanner sa=new Scanner(System.in);
//        System.out.println("Enter k element value");
//        int k=sa.nextInt();
//        System.out.println(Arrays.toString(kelementlargestsmallest(a,k)));


//     }
// }


//===============================================================================================
 /// merge two sorted or unsorted Arrays


// import java.util.*;
// class text1{

// public static int [] mergetwoarray(int []a1 , int a2 []){
//     int n1=a1.length, n2=a2.length;
//     int i=0,j=0,k=0;
//     int merged[]=new int[n1+n2];
//     while(i<n1 && j<n2){
//         if (a1[i]<=a2[j]){
//             merged[k++]=a1[i++];
//         }
//         else{
//             merged[k++]=a2[j++];
//         }
//     }
//     while(i<n1){
//         merged[k++]=a1[i++];
//     }
//     while(j<n2){
//         merged[k++]=a2[j++];
//     }
    
//     return merged;
// }
// public static void main(String args[]){
//     int a1[]={5,6,1,2,4,5};
//     int a2[]={3,6,7,8,1,3};
//     Arrays.sort(a1);
//     Arrays.sort(a2);
//     System.out.println(Arrays.toString(mergetwoarray(a1,a2)));
// }
// }





// same 

// import java.util.Arrays;

// public class MergeSortedArrays {
//     public static int[] merge(int[] arr1, int[] arr2) {
//         int n1 = arr1.length, n2 = arr2.length;
//         int[] merged = new int[n1 + n2];
//         int i = 0, j = 0, k = 0;

//         // Merge the arrays until one of them is exhausted
//         while (i < n1 && j < n2) {
//             if (arr1[i] <= arr2[j]) {
//                 merged[k++] = arr1[i++];
//             } else {
//                 merged[k++] = arr2[j++];
//             }
//         }

//         // Copy any remaining elements from arr1
//         while (i < n1) {
//             merged[k++] = arr1[i++];
//         }

//         // Copy any remaining elements from arr2
//         while (j < n2) {
//             merged[k++] = arr2[j++];
//         }

//         return merged;
//     }

//     public static void main(String[] args) {
//         int[] arr1 = {1, 3, 5, 7};
//         int[] arr2 = {2, 4, 6, 8};

//         int[] mergedArray = merge(arr1, arr2);
//         System.out.println("Merged array: " + Arrays.toString(mergedArray));
//     }
// }


//==============================================================================================

// Linear search in Array
// import java.util.*;
// class text1{
//     public static int func(int arr[] , int k){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==k){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[]={3,6,8,4,5,2,1};
// Scanner sa= new Scanner(System.in);
// System.out.println("Enter element You want to search in Array :");
// int k=sa.nextInt();
// int result=func(arr,k);
// if(result==-1){
//     System.out.println("Element not  Present in Array ");

// }
// else{
//     System.out.println("Element  "+arr[result]+" is Found at index :"+result);
//     System.out.println("Remember Indexing start with 0");
// }
//     }
// } 



//=============================================================================================
// Binary Search in Array

// import java.util.*;
// class text1{
//     public static int func(int arr[], int ele,int low,int high){
       
//         while(low<=high){
//             int mid=low+(high-low)/2;
//             if(arr[mid]==ele){
//                 return mid;
//             }
//             else if(arr[mid]<ele){
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[]={2,3,4,5,6,8,9};
//         int low=0;
//         int high=arr.length;
//         Scanner sa=new Scanner(System.in);
//         System.out.println("Enter number you want to search");
//         int n=sa.nextInt();
//         int result=func(arr,n,low,high);
//         if(result==-1){
//             System.out.println("Element"+n+" is not present in Array");
//         }
//         else{
//             System.out.println("Element  "+n+" is found at Index :"+result);
//         }
//     }
// }


// ==============================================================================================
// Search in Roted shorted Array
// import java.util.*;

// class text2 {
//     public static int func(int[] a, int low, int high, int k) {
//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             // Check if the mid element is the target
//             if (a[mid] == k) {
//                 return mid;
//             }

//             // If the left half is sorted
//             if (a[low] <= a[mid]) {
//                 // Check if the target is in the left half
//                 if (k >= a[low] && k < a[mid]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             }
//             // Otherwise, the right half must be sorted
//             else {
//                 // Check if the target is in the right half
//                 if (k > a[mid] && k <= a[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }
//         }
//         return -1; // Target not found
//     }

//     public static void main(String[] args) {
//         int[] a = {5, 6, 7, 8, 1, 2, 3, 4};
//         int low = 0; // Start index
//         int high = a.length - 1; // End index

//         System.out.println("Enter Element you want to search:");
//         Scanner sa = new Scanner(System.in);
//         int n = sa.nextInt();
//         int result = func(a, low, high, n);
//         sa.close(); // Close the Scanner

//         if (result == -1) {
//             System.out.println("Element "+n+" not found in Array");
//         } else {
//             System.out.println("Element " + n + " is found at Index: " + result);
//         }
//     }
// }

//==============================================================================================
// Search in Roted sorted dublicates element content Arrays

import java.util.*;

class text2 {
    public static int func(int[] a, int low, int high, int k) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the mid element is the target
            if (a[mid] == k) {
                return mid;
            }

            // If duplicates are found at low, mid, and high, shrink the range
            if (a[low] == a[mid] && a[mid] == a[high]) {
                low++;
                high--;
            }
            // If the left half is sorted
            else if (a[low] <= a[mid]) {
                // Check if the target is in the left half
                if (k >= a[low] && k < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Otherwise, the right half must be sorted
            else {
                // Check if the target is in the right half
                if (k > a[mid] && k <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 6, 7, 8, 1, 2, 2, 3,4};
        int low = 0; // Start index
        int high = a.length - 1; // End index

        System.out.println("Enter Element you want to search:");
        Scanner sa = new Scanner(System.in);
        int n = sa.nextInt();
        int result = func(a, low, high, n);
        sa.close(); // Close the Scanner

        if (result == -1) {
            System.out.println("Element "+n+" not found in Array");
        } else {
            System.out.println("Element " + n + " is found at Index: " + result);
        }
    }
}
