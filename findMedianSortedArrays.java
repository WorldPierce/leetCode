/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n))
*/

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> combined = new ArrayList<>();
        int index1 = 0, index2 = 0;
        while(combined.size() < nums1.length + nums2.length){
            if(index1 < nums1.length && index2 < nums2.length){
                if(nums1[index1] <= nums2[index2]){
                    combined.add(nums1[index1]);
                    index1++;
                }
                else {
                    combined.add(nums2[index2]);
                index2++;
                }
            }
            else {
                int val = index1 < nums1.length ? nums1[index1++] : nums2[index2++];
                combined.add(val);
            }
            
        }
        double median = 0.0;
        if(combined.size() % 2 != 0){
            median = combined.get(combined.size() / 2);
        }
        else {
            
            median = (double)(combined.get(combined.size() / 2) + combined.get(combined.size() / 2 - 1)) / 2.0;
        }
        return median;
    }
}