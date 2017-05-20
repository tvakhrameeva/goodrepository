

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * Created by user on 5/11/17.
 */
public class ListDemo {
    //private ArrayList<String> arrStr;
    //private char sym;

//    public ListDemo(ArrayList<String> arrStr, char sym){
  //      this.arrStr =  arrStr;
    //    this.sym = sym;
    //}

    public static int findCountOfSimbolInStringList(ArrayList<String> arrStr, char sym){
        int count=0;
        for(int i =0; i < arrStr.size();i++){
        if (arrStr.get(i).toString().charAt(0)==sym)
        {count++;}
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
    public static ArrayList<Human> deleteEqualSurname(ArrayList<Human> arrOfHuman, Human human){
        ArrayList<Human> result= new ArrayList<Human>();
        for(int i=0;i<arrOfHuman.size();i++){
            if( !arrOfHuman.get(i).equals(human) ){
                result.add(arrOfHuman.get(i));
            }
        }
        return result;
    }
    public static ArrayList<int[]> findDisjointSets(ArrayList<int[]> arrOfInts, int[] set){
        ArrayList<int[]> result= new ArrayList<int[]>();
        boolean fl=true;
        for(int i=0;i<arrOfInts.size();i++){
            for (int j=0;j<arrOfInts.get(i).length;j++){
                for (int k=0;k<set.length;k++) {
                    if (arrOfInts.get(i)[j] == (set[k])) {
                         fl= false;
                        break;
                    }
                }
            }
            if (fl==true){
                result.add(arrOfInts.get(i));
            }
            fl=true;
        }
        return result;
    }

    public static  ArrayList<Human> findHumanById(Map<Integer,Human> mapOfHuman, int[] set){
        ArrayList<Human> result= new ArrayList<Human>();
        for(int i=0;i<mapOfHuman.size();i++){
            if( mapOfHuman.containsKey(set[i])){
                result.add(mapOfHuman.get(set[i]));
            }
        }
        return result;
    }
    public static ArrayList<Integer> findIdsHumansOlder18(Map<Integer,Human> mapOfHuman){
        ArrayList<Integer> result = new ArrayList<Integer>();
        Set keys = mapOfHuman.keySet();
        for (Object key: keys) {
            if(mapOfHuman.get(key).getAge()>= 18){
                result.add((Integer) key);
            }
        }
        return result;
    }

    public static ArrayList<Human> getTheOldestOnes(ArrayList<Human> human){
        ArrayList result = new ArrayList();
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
