// Задача 1

package java_projects;

public class program {
    String word1 = "dfhgghh";
    String word2 = "dgfgg";
    int a = word1.length();
    int b = word2.length();
    int i = 0;
    String merged = "";
    while (a>0 && b>0);
        {
        merged = merged + word1.charAt(i);
        merged = merged + word2.charAt(i);
        a = a-1;
        b = b-1;
        i = i + 1;
        }
    if (a>0) merged = merged + word1.substring(i);
    if (b>0) merged = merged + word2.substring(i);
    System.out.println ( merged );
    }
}
// Задача 2

class Solution {
    public int removeElement(int[] nums, int val) {
        int copiInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[copiInd] = nums[i];
                copiInd += 1;
            }
        }
        int k = copiInd;
        while (copiInd < nums.length) {
            nums[copiInd] = '_';
            copiInd += 1;
        }
    return k;
    }
}


// Задача 3

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int copiInd = m + n - 1;
        if (m == 0){
            for (int i = 0; i < nums1.length; i++){
                nums1[i] = nums2[i];
            }
            n = 0;
        }
        for (int i = m; i > 0; i--){
            for (int j = n; j > 0; j--){
                if (nums2[n-1] > nums1[m-1]){
                nums1[copiInd] = nums2[n-1];
                n -= 1;
                copiInd -= 1;
                }
            
                else{
                    nums1[copiInd] = nums1[m-1];
                    nums1[m-1] = nums2[n-1]; 
                    copiInd -= 1;
                    m -= 1;
                    n -= 1;
                }
            }
        }
        
        
    }
}