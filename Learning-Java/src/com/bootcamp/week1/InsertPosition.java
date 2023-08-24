package com.bootcamp.week1;

import java.util.Arrays;

class InsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int position = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                position = i;
                break;
            } else
                position = -1;
        }

        if (position == -1) {
            int[] arr2 = new int[nums.length + 1];
            System.arraycopy(nums, 0, arr2, 0, nums.length);
            arr2[nums.length] = target;

            Arrays.sort(arr2);
            position = searchInsert(nums, target);//-1;
        }
        return position;

    }

    // Do not modify the code below
    public static void main(String args[]) {
        int nums[] = {1, 3, 5, 7, 9}, target = 9;
        int nums1[] = {1, 3, 5, 6}, target1 = 3;
        int nums2[] = {1, 3, 5, 6, 7}, target2 = 7;

        System.out.println(searchInsert(nums, target));
        System.out.println(searchInsert(nums1, target1));
        System.out.println(searchInsert(nums2, target2));

    }
}