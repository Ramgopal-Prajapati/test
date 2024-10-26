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






// import java.util.Arrays;

// class Main {
//     public static boolean areArraysEqual(int[] arr1, int[] arr2) {
//         // Use Arrays.equals() to check if arrays are equal
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



import java.util.*;

class Main {
    public static List<Integer> findMissingNumbers(int[] a, int min, int max) {
        Set<Integer> numbersSet = new HashSet<>();
        for (int num : a) {
            numbersSet.add(num);
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!numbersSet.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 2, 1}; // Let's say numbers are in the range from 1 to 7
        int min = 1;
        int max = 7;
        System.out.println("Missing numbers: " + findMissingNumbers(a, min, max)); // Output should be [4, 7]
    }
}
