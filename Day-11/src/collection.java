import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collection {

    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();

        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1,2,3,3));
        for (Integer item : listInteger) {
            System.out.println("This is item fo list Integer : " + item);
        }

        List<String> name = Arrays.asList("Hello", "Toch ratana");
        System.out.println(name);

        System.out.println(listInteger);
        listString.add("A1");
        listString.add("S2");



        for ( int i = 0 ; i < listString.size() ; i++ ){
            System.out.println("This is item of array : " + listString.get(i));
        }


        System.out.println(listString);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(122);
        intList.add(344);


        intList.removeFirst();
        intList.removeLast();
        intList.add(444);
        for(Integer item : intList){
            System.out.println("This is a item in intList : " + item);
        }
        System.out.println(intList);
        // use for check an item of list it in or not
        System.out.println(intList.contains(122));

        System.out.println(intList.containsAll(listString));


        List<Integer> number = new ArrayList<>();
        number.add(20);
        number.add(2021);
        number.add(2022);
        number.add(2023);

        // use add two values add item to list specific index
        number.add(0,2019);
        // use set to update
        number.set(1,2020);
        System.out.println(number); // 2019 2020 2021 2022 2023
    }
}
