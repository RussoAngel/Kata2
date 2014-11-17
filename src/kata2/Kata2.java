package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] vecNumbers = {2,2,11,4,2,6,11,2,3,5,11,5};
        HashMap<Integer,Integer> numbers;
        numbers = new HashMap<>();
        int aux;
        for(int i = 0;i < vecNumbers.length;i++){
           if(numbers.containsKey(vecNumbers[i])){
               aux = numbers.get(vecNumbers[i]) +1;
               numbers.put(vecNumbers[i], aux);
           }else{
               numbers.put(vecNumbers[i], 1);
           }
        }
        for (Integer frecuency : numbers.keySet()) {
            System.out.println(frecuency + "->" + numbers.get(frecuency));
        }
             
    }
}