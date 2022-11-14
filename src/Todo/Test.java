package Todo;

import java.util.*;

/* TODO Design a data structure that supports the following operations in O (1) time.
1. void insert(Object x): Inserts an item x to the data structure if not already present A, B, C, D
2. void remove(Object x): Removes an item x from the data structure if present
3. boolean search(Object x): Searches an item x in the data structure
4. Object getRandom(): Returns a random element from current set of elements
* */
public class Test {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.size();
//        Random r = new Random(1, map.size());

        // key 1, A
        insertElement();
        removeElement();
        searchElement();
        getRandomElement();

        //Employee name, id, 1, 100
        List<String> list = new ArrayList<>();
//        {enmployeename, employee address}


//        dhruv1019
//        dhruv1020hsy1
//        employee20

//        20

//        5

//        "dhruv1020hsy"+5

        //MaxNumberAsID  = 1020-900
        //Main map
        //Counter map

//        remove will be having remove plus shuffeling
//        null
//                Set <Keys>

//                        or

//        1 => dhruv1020hsy, 2, 3, 4= jjj, 5=>jjj





        Map hmap = new HashMap<Integer, Employee>();
        hmap.put(1, new Employee1("e1", "e2","e3","e4"));
//        map.size();
        hmap.put(hmap.size()+1, new Employee1("e1", "e2","e3","e4"));




//        id, {employeeName, address, location}
    }

    private static void getRandomElement() {
        //
    }

    private static void searchElement() {

    }

    private static void removeElement() {

    }

    private static void insertElement() {
    }
}

class Employee1{
    String employeeName1;
    String employeeName2;
    String employeeName3;
    String employeeName4;

    Employee1(String e1, String e2,String e3,String e4){
        this.employeeName1= e1;
        this.employeeName2= e2;
        this.employeeName3= e3;
        this.employeeName4= e4;

    }
    Employee1(){

    }

}
