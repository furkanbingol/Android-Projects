package com.furkanbingol.java101;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SomeDataStructures {
    public static void main(String[] args) {
        //ARRAYS
        String[] strArr = new String[3];

        strArr[0] = "London";
        strArr[1] = "Miami";
        strArr[2] = "Amsterdam";
        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }

        int[] intArr = new int[3];
        intArr[0] = strArr[0].length();
        intArr[1] = strArr[1].length();
        intArr[2] = strArr[2].length();
        for (int i : intArr) {      //foreach
            System.out.println(i);
        }
        System.out.print("--------------------------------------\n");

        //LISTS
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        System.out.println(list.get(1));

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Furkan");
        System.out.println(strList.get(0));
        strList.add(0, "Istanbul");   //strList --> Istanbul Furkan
        System.out.println(strList.size());
        System.out.print("--------------------------------------\n");

        //Set (bir eleman, bir sette sadece bir kez yer alır-küme mantığı-)
        HashSet<String> set = new HashSet<>();
        set.add("Furkan");
        set.add("Furkan");
        System.out.println("set.size(): " + set.size());   //1
        System.out.print("--------------------------------------\n");

        //HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("Istanbul", "34");  //key,value
        System.out.println(map.get("Istanbul"));

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Furkan", 22);
        map2.put("Gigi", 21);
        System.out.println(map2.get("Furkan") + "," + map2.get("Gigi"));
        System.out.println(map2.get("a"));   //null

    }
}
