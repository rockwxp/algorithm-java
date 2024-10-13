package main.java.sort;

import java.util.*;

/**
 * @author rock
 * @date 2024/10/6 13:32
 */
public class Sort {
    public static void main(String[] args) {
        int[] nums = generateRandomArray(30);
        printNums(nums);
         mergeSort(nums, 0, nums.length - 1);
        //executeSort(nums, Sort::bucketSort);
        printNums(nums);

    }

    interface SortStrategy {
        void sort(int[] nums);
    }

    public static void executeSort(int[] nums, SortStrategy sortStrategy) {
        sortStrategy.sort(nums);
    }

    public static void printNums(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }

    public static int[] generateRandomArray(int length) {
        // 创建一个指定长度的数组
        int[] array = new int[length];

        // 创建随机数生成器对象
        Random random = new Random();

        // 遍历数组，填充随机数
        for (int i = 0; i < length; i++) {
            // 生成随机整数并赋值给数组
            array[i] = random.nextInt(1000); // 生成0到99之间的随机整数
        }

        return array;
    }

    // 1. selection sort
    public static void selectionSort(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int min = i;
            boolean isExchange = false;
            for (int j = i + 1; j < len; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                    isExchange = true;
                }
            }
            if (isExchange) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }

    // 2. insertion sort
    public static void insertionSort(int[] nums) {
        int len = nums.length;

        for (int i = 1; i < len; i++) {
            int min = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > min) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = min;
        }
    }

    // 3. bubble sort
    public static void bubbleSort(int[] nums) {
        int len = nums.length;
        boolean swapped = false;
        for (int i = len; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    // 4. shell sort
    public static void shellSort(int[] nums) {
        int len = nums.length;

        for (int gap = len / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < len; i++) {
                int min = nums[i];
                int j = i;

                while (j >= gap && min < nums[j - gap]) {
                    nums[j] = nums[j - gap];
                    j -= gap;
                }
                nums[j] = min;
            }
        }
    }

    // 5. counting sort
    public static void countingSort(int[] nums) {
        // get mix and max numbers among nums
        int min = Integer.MAX_VALUE; // it is also as offset for countArr
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }

            if (max < nums[i]) {
                max = nums[i];
            }
        }
        // create a new array
        int len = max - min + 1;
        int[] countArr = new int[len];

        // add count value to countArr
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i] - min;
            countArr[index] += 1;
        }
        int i = 0;
        int j = 0;

        while (j < len) {

            if (countArr[j] > 0) {
                nums[i] = j + min;
                i++;
                countArr[j] -= 1;
            }
            if (countArr[j] == 0) {
                j++;
            }
        }
    }

    // 6. quick sort
    public static void quickSort(int[] nums, int start, int end) {

        if (start >= end) {
            return;
        }

        int p = partition(nums, start, end);

        quickSort(nums, start, p - 1);
        quickSort(nums, p + 1, end);

    }

    public static int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int index = start;
        int temp;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] <= pivot) {
                index++;
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;

            }
        }
        nums[start] = nums[index];
        nums[index] = pivot;

        return index;
    }

    // 8. bucket sort
    public static void bucketSort(int[] nums) {

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int len = nums.length;
        int bucketNums = len / 5;
        ArrayList<List<Integer>> bucketList = new ArrayList<>(bucketNums);
        for (int i = 0; i < bucketNums; i++) {
            bucketList.add(new ArrayList<Integer>());
        }

        for (int num : nums) {
            int bucketIndex = (num - min) * (bucketNums - 1) / (max - min); // find which bucket
            bucketList.get(bucketIndex).add(num);
        }

        for (int i = 0, numsIndex = 0; i < bucketList.size(); i++) {
            List<Integer> bucket = bucketList.get(i);
            Collections.sort(bucket);
            for (int num : bucket) {
                nums[numsIndex++] = num;
            }
        }

    }

    // 9. merge sort
    public static void mergeSort(int[] nums, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid + 1, end);
    }

    private static void merge(int[] nums, int start, int start2, int end) {
        int len = start2 - start;
        int[] tmpArr = new int[len];

        System.arraycopy(nums, start, tmpArr, 0, len);

        int p1 = 0;
        int p2 = start2;

        for (int i = start; i <= end; i++) {

            if (tmpArr[p1] <= nums[p2]) {
                nums[i] = tmpArr[p1];
                p1++;
                if (p1 == len) {
                    break;
                }
            } else {
                nums[i] = nums[p2];
                p2++;
                if (p2 > end) {
                    while (p1 < len) {
                        i++;
                        nums[i] = tmpArr[p1++];
                    }
                }
            }

        }

    }

}
