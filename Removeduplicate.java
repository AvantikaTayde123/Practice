import java.util.*;
public class Removeduplicate {
    public static void main(String[] args) {
        int arr[] ={1,2,3,2,4,1,5,6,5};
        Set<Integer> set = new HashSet<>();    
          
        for (int num : arr){
            set.add(num);
        }

        System.out.println(set);
    }
}

