package lesson11;


import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        testArrayList();
//        testSet();
        testMap();
    }


    private static void testArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add(0, "X");
        arrayList.add(2, "Y");

//        arrayList.remove("D");
//        arrayList.remove(2);

//        можно перебирать через таким образом, но не самый хороший вариант в коллекциях
        /*for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));*/

        /*for (String s : arrayList) {
            System.out.print("-> " + s);*/
  /*      Iterator<?>iterator=arrayList.iterator();
        while (iterator.hasNext()){
           String s=(String) iterator.next();
           System.out.print("-> " +s);
        }*/
        /* arrayList.clear();*/

      /*      arrayList.forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.print("-> " +s);
                }
            });
        }
    }*/
//        System.out.println(arrayList);
        Object[] objects = arrayList.toArray();
        String[] string = arrayList.toArray(new String[0]);

        Collections.addAll(arrayList, new String[]{"A", "Ddd", "Xxx", "Bbb"});
        Collections.shuffle(arrayList);
        Collections.sort(arrayList, (s1, s2) -> s1.length() - s2.length());
        Collections.sort(arrayList, Comparator.comparingInt(String::length));

//        Collections.reverse(arrayList);
//        Collections.rotate(arrayList, -2);
//        System.out.println(Collections.binarySearch(arrayList,"D"));
//        System.out.println(Collections.replaceAll(arrayList,"D","!!!"));

//        StrimAPI
        List<Integer> integerArrayList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(integerArrayList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
        System.out.println(integerArrayList.stream().filter(e -> e % 2 == 0).count());

        System.out.println(arrayList);

    }
    private static void testSet() {
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, 7, 2, 4, 9, 1, 0, 8, 4, 5, 8, 2, 1, 0, 8, 4, 5, 1, 3, 9, 0, 6, 4, 8, 0);
        System.out.println(set);
    }

    private static void testMap() {
        Map<String,String>map=new HashMap<>();
        map.put("Russia","Moscow");
        map.put("France","Paris");
        map.put("Germany","Berlin");
        map.put("Norway","Oslo");

  /*      for (String key : map.keySet()) { //через Iter

            System.out.printf("Key:%s\t\t value:%s%n",key, map.get(key));
        }*/

//        System.out.println(map);
 /*       for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("Key:%s\t\t value:%s%n",entry.getKey(), entry.getValue());
        }*/
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.printf("Key:%s\t\t value:%s%n",key, value);
            }
        });

    }
}






