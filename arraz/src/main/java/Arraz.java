import java.util.*;
import java.util.stream.Stream;

public class Arraz {


    public Integer sumValuesOfArray(Integer[] nums) {
        int sum = 0;
        for (Integer i : nums) {
            sum += i;
        }
        return sum;

    }

    public Double sumDoublesOfArray(Double[] nums) {
        double sum = 0;
        for (Double i : nums) {
            sum += i;
        }
        return sum;
    }


    public Integer averageOfArray(Integer[] nums) {
        Integer sum = 0;
        for (Integer i : nums) {
            sum += i;
        }
        return sum / nums.length;
    }

    public Double doubleAverageOfArray(Double[] nums) {
        Double sum = 0.00;
        for (Double i : nums) {
            sum += i;
        }
        return sum / nums.length;
    }

    public Boolean containsValue(Double[] nums, Double value) {
        for (Double i : nums)
            if (i.equals(value))
                return true;

        return false;
    }


    public Integer[] reverseArray(Integer[] nums) {

        Integer[] revArr = new Integer[nums.length];
        int n = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            revArr[n++] = nums[i];

        }

        return revArr;
    }


    public OddEven oddEven(int[] nums) {
        int odds = 0;
        int evens = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        OddEven oddEven = new OddEven(odds, evens);
        return oddEven;
    }


    public int findIndexOf(int[] nums, int val) {
        // int index = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == val)
                return i;

        return -1;
    }

    public Integer[] copyArrayByIterator(Integer[] nums) {
        List<Integer> numList = Arrays.asList(nums);
        List<Integer> copyList = new ArrayList<>();

        Iterator<Integer> iterator = numList.iterator();
        while (iterator.hasNext()){
            copyList.add(iterator.next());
        }

        return copyList.toArray(new Integer[0]);

    }


    public Integer[] copyArrayByLoop(Integer[] nums) {
        Integer[] coppyNums = new Integer[nums.length];
        int n = 0;

        for(Integer i : nums){
            coppyNums[n++] = i;
        }
        return coppyNums;
    }

    public Integer[] removeElementFromArray(Integer[] nums, Integer valToRemove) {

        Integer[] newArr = new Integer[nums.length-1];
        int n = 0;

        for(Integer i : nums)
            if(!i.equals(valToRemove))
                newArr[n++] = i;

        return newArr;
    }

    public Integer[] insertIntoArrayAt(Integer[] nums, Integer valToBeInserted, int indexToInsert) {
        nums[indexToInsert] = valToBeInserted;
        return nums;

    }

    public MaxMin findMaxMinOfArray(Integer[] nums) {
        int max = 0;
        int min = 0;

        Arrays.sort(nums);
        max = nums[nums.length-1];
        min = nums[0];

        return new MaxMin(max,min);


    }

    public Integer[] removeDupesFromArray(Integer[] nums) {

       return Arrays.stream(nums)
               .distinct()
               .toArray(Integer[]::new);
    }

    public double find2ndLargestValueFromArray(Double[] nums) {
        //Tree set removes duplicates and sorts the array from smallest to largest
        TreeSet<Double> set = new TreeSet<>(Arrays.asList(nums));
        //convert to arraylist
        ArrayList<Double> list = new ArrayList<>(set);
        //get the second largest.
        return list.get(list.size() -2);
    }

    public Integer[] makeMeAnArrayFromArrayList(ArrayList<Integer> nums) {
        return nums.toArray(new Integer[nums.size()]);


    }


    public boolean check2ArraysForEqual(int[] arr1, int[] arr2) {
//        if(arr1.length !=arr2.length) return false;
//
//       for(int i = 0; i <arr1.length; i++)
//           for(int j = 0; j < arr2.length; j++)
//               if(arr1[i] == arr2[j])
//                   return true;
//
//
//
//
//    return false;

        return Arrays.equals(arr1,arr2);
    }

    public int averageWithoutMaxMin(Integer[] numsArr) {
        Arrays.sort(numsArr);
        MaxMin maxMin = findMaxMinOfArray(numsArr);
        Integer[] newNumsArr = removeElementFromArray(numsArr,maxMin.getMax());
        newNumsArr = removeElementFromArray(newNumsArr,maxMin.getMin());

        return averageOfArray(newNumsArr);

    }


    public boolean arrayHas65and77(Integer[] numsArr, Integer val65, Integer val77) {

        boolean arrayHas65and77 = true;

        for(int i = 0; i <numsArr.length;i++)
            if(numsArr[i]==val65 && numsArr[i] == val77)
                return  arrayHas65and77;

            return false;
    }
}
