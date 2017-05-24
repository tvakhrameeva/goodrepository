

import java.io.Serializable;
import java.util.*;


/**
 * Created by user on 5/11/17.
 */
public class ListDemo implements Serializable{


    public static int findCountOfSimbolInStringList(ArrayList<String> arrStr, char sym){
        int count = 0;
        for (int i = 0; i < arrStr.size(); i++) {
            if (arrStr.get(i).charAt(0) == sym) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Human> findEqualSurname(ArrayList<Human> arrOfHuman, Human human){
        ArrayList<Human> result= new ArrayList<Human>();
        for(int i=0;i<arrOfHuman.size();i++){
           if( arrOfHuman.get(i).getSurname().equals(human.getSurname()) ){
               result.add(arrOfHuman.get(i));
           }
        }
        return result;
    }
    public static ArrayList<Human> deleteEqualSurname(ArrayList<Human> arrOfHuman, Human human) throws CloneNotSupportedException {
       // ArrayList<Human> arrOfHuman1 = (ArrayList<Human>) arrOfHuman.clone();

        ArrayList<Human> arrOfHuman1= org.apache.commons.lang3.SerializationUtils.clone(arrOfHuman);
        ArrayList<Human> result= new ArrayList<Human>();
      //  int i=0;
        //for (Human anArrOfHuman1 : arrOfHuman1) {
          //  anArrOfHuman1 = (Human) arrOfHuman.get(i).clone();

        //}


        for (Human anArrOfHuman1 : arrOfHuman1) {
            if (!anArrOfHuman1.equals(human)) {
                result.add(anArrOfHuman1);
            }
        }
        return result;
    }
    public static List<Set<Integer>> findDisjointSets(List<Set<Integer>> arrOfInts, Set<Integer> set){
        List<Set<Integer>> result= new ArrayList<Set<Integer>>();

        boolean fl=true;
        for(int i=0;i<arrOfInts.size();i++){
                for(int numOfArrOfInts : arrOfInts.get(i)) {
                    for(int numOfSet : set) {
                        if (numOfArrOfInts == (numOfSet)) {
                            fl = false;
                            break;
                        }
                    }
                }

            if (fl){
                result.add(arrOfInts.get(i));
            }
            fl=true;
        }
        return result;
    }

    public static  Set<Human> findHumanById(Map<Integer,Human> mapOfHuman, Set<Integer> set){
        Set<Human> result= new HashSet<Human>();
        for(int num :set){
            if( mapOfHuman.containsKey(num)){
                result.add(mapOfHuman.get(num));
            }
        }
        return result;
    }
    public static List<Integer> findIdsHumansOlder18(Map<Integer,Human> mapOfHuman){
        ArrayList<Integer> result = new ArrayList<Integer>();
        Set<Integer> keys = mapOfHuman.keySet();
        for (Object key: keys) {
            if(mapOfHuman.get(key).getAge()>= 18){
                result.add((Integer) key);
            }
        }
        return result;
    }

    public static List<Human> getTheOldestOnes(List<Human> human){
        ArrayList<Human> result = new ArrayList<Human>();
        int maxAge = human.get(0).getAge();
        for(int i=1; i< human.size(); i++ ){
            if (human.get(i).getAge()> maxAge){
                maxAge=human.get(i).getAge();
            }
        }
        for(int j=0; j< human.size(); j++ ){
            if (human.get(j).getAge() == maxAge){
                result.add(human.get(j));
            }
        }

        return  result;
    }

}
