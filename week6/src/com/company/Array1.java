package com.company;

public class Array1 {

    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6|| nums[nums.length-1] == 6);
    }


    public boolean sameFirstLast(int[] nums) {
        return (nums.length > 0 && nums[0] == nums[nums.length-1]);
    }


    public int[] makePi() {
        int[] pi = new int[3];
        pi[0] = 3;
        pi[1] = 1;
        pi[2] = 4;

        return pi;
    }


    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
    }


    public int sum3(int[] nums) {
        int sum = 0;

        sum += nums[0];
        sum += nums[1];
        sum += nums[2];

        return sum;
    }


    public int[] rotateLeft3(int[] nums) {

        int holder = nums[0];

        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = holder;

        return nums;
    }


    public int[] reverse3(int[] nums) {

        int holder = nums[2];

        nums[2] = nums[0];
        nums[0] = holder;

        return nums;
    }


    public int[] maxEnd3(int[] nums) {

        if(nums[0] < nums[nums.length-1]){
            nums[0] = nums[nums.length-1];
            nums[1] = nums[nums.length-1];
        } else {
            nums[1] = nums[0];
            nums[2] = nums[0];
        }

        return nums;
    }

}
