import java.util.*;

public class HashMap<I extends Number, I1 extends Number> {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the String consists of integers separated by ';' : ");
            String str = scanner.next();
            System.out.print("HashMap is " + getOccurrencesHashMap(str));
        }

        public static HashMap<Integer,Integer> getOccurrencesHashMap(String S) {

            String[] str = S.split(";");
            List<Integer> integerList = new ArrayList<>();
            for(String s : str) integerList.add(Integer.parseInt(s));

            HashMap<Integer,Integer> hashMap = new HashMap<>();
            Set<Integer> integerSet = new HashSet<>(integerList);
            for (Integer i : integerSet) hashMap.put(i, Collections.frequency(integerList, i));


            return hashMap;
        }

    private void put(I1 i, I1 frequency) {

    }

}


