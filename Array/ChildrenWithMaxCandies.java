package Array;

import java.util.ArrayList;
import java.util.List;

public class ChildrenWithMaxCandies {
    public static List<Boolean> maxCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int max=0;
        for(int candy: candies){
            max=Math.max(candy,max);
        }
        for(int candy: candies){
            result.add(candy+extraCandies>=max);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {1,3,5,3,6,4,3};
        int extraCandies = 3;
        System.out.println(maxCandies(candies,extraCandies));

    }
}
