class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int i = 0, j = 0, k = 0;
        int[] num3 = new int[totalLength];
        outerloop:
        while(i <nums1.length || j < nums2.length){

            if(i==nums1.length){
                for(int lj = j;lj<nums2.length;lj++)
                {num3[k] = nums2[lj];
                    k++;}
                break outerloop;

            }else if(j == nums2.length){
                for(int li = i;li<nums1.length;li++)
                {num3[k] = nums1[li];
                    k++;}
                break outerloop;
            }
            if(nums1[i] > nums2[j]){
                num3[k] = nums2[j];
                j++;
            } else if(nums1[i] <= nums2[j]){
                num3[k] = nums1[i];
                i++;
            }
            k++;
        }

        if(totalLength%2==0){
            return (double)(num3[totalLength/2] + num3[totalLength/2 -1])/2;
        }
        else
            return num3[totalLength/2];
    }
}
