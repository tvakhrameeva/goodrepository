import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Created by user on 5/12/17.
 */
public class testListDemo {
    @Test
    public void testFindCountOfSimbolInStringList()  {
        ArrayList<String>  str= new ArrayList<String>(4);
        str.add(0,"ytdry");
        str.add(1,"pgtfr");
        str.add(2,"y");
        str.add(3,"i");

        char sym ='y' ;
       // ListDemo ex1 = new ListDemo(str,sym);
        assertTrue(ListDemo.findCountOfSimbolInStringList(str,sym)==2);

    }
    @Test
    public void testFindEqualSurname()  {
        ArrayList<Human>  str= new ArrayList<Human>(4);
        Human human0 = new Human("ivanov","ivan","ivanovich",47);
        Human human1 = new Human("ivanov","dmitrii","ivanovich",30);
        Human human2 = new Human("petrov","oleg","ivanovich",19);
        Human human3 = new Human("ivashcin","igor","ivanovich",20);
        str.add(0,human0);
        str.add(1,human1);
        str.add(2,human2);
        str.add(3,human3);

        Human human = new Human("ivanov","ivan","ivanovich",20);
        ArrayList<Human> ans= new ArrayList<Human>(2);
        ans.add(0,human0);
        ans.add(1,human1);

        assertTrue(ListDemo.findEqualSurname(str,human).equals(ans));

    }

    @Test
    public void testDeleteEqualSurname()  {
        ArrayList<Human>  str= new ArrayList<Human>(4);
        Human human0 = new Human("ivanov","ivan","ivanovich",47);
        Human human1 = new Human("ivanov","ivan","ivanovich",20);
        Human human2 = new Human("petrov","oleg","ivanovich",19);
        Human human3 = new Human("ivashcin","igor","ivanovich",20);
        str.add(0,human0);
        str.add(1,human1);
        str.add(2,human2);
        str.add(3,human3);

        Human human = new Human("ivanov","ivan","ivanovich",20);
        ArrayList<Human> ans= new ArrayList<Human>(3);
        ans.add(0,human0);
        ans.add(1,human2);
        ans.add(2,human3);

        assertTrue(ListDemo.deleteEqualSurname(str,human).equals(ans));

    }
    @Test
    public void testfindDisjointSets()  {
        ArrayList<int[]>  str= new ArrayList<int[]>(4);
        int[] set0 = new int[]{1,2,3,4};
        int[] set1 = new int[]{-1,0,7,4};
        int[] set2 = new int[]{4,9,12,-8};
        int[] set3 = new int[]{345,2333,333,14};

        str.add(0,set0);
        str.add(1,set1);
        str.add(2,set2);
        str.add(3,set3);

        int[] set = new int[]{2,-8,333,12};
        ArrayList<int[]> ans= new ArrayList<int[]>(1);
        ans.add(0,set1);


        assertTrue(ListDemo.findDisjointSets(str,set).equals(ans));

    }

    @Test
    public void testfindHumanById()  {
        ArrayList<Human>  str= new ArrayList<Human>(4);
        Human human0 = new Human("ivanov","ivan","ivanovich",47);
        Human human1 = new Human("ivanov","ivan","ivanovich",20);
        Human human2 = new Human("petrov","oleg","ivanovich",19);
        Human human3 = new Human("ivashcin","igor","ivanovich",20);
        str.add(0,human0);
        str.add(1,human1);
        str.add(2,human2);
        str.add(3,human3);

        int[] ids = new int[]{0,1,2,3};
        int[] set = new int[]{2,3,7,12};
        Map<Integer,Human> map = new HashMap<Integer, Human>();
        for(int j=0;j<str.size();j++) {
            map.put(ids[j], str.get(j));
        }

        ArrayList<Human> ans= new ArrayList<Human>(2);
        ans.add(0,human2);
        ans.add(1,human3);


        assertTrue(ListDemo.findHumanById(map,set).equals(ans));

    }
    @Test
    public void testfindIdsHumansOlder18(){
        ArrayList<Human>  str= new ArrayList<Human>(4);
        Human human0 = new Human("ivanov","ivan","ivanovich",47);
        Human human1 = new Human("ivanov","ivan","ivanovich",17);
        Human human2 = new Human("petrov","oleg","ivanovich",19);
        Human human3 = new Human("ivashcin","igor","ivanovich",18);
        str.add(0,human0);
        str.add(1,human1);
        str.add(2,human2);
        str.add(3,human3);

        int[] ids = new int[]{0,1,2,3};
        Map<Integer,Human> map = new HashMap<Integer, Human>();
        for(int j=0;j<str.size();j++) {
            map.put(ids[j], str.get(j));
        }
        ArrayList<Integer> ans= new ArrayList<Integer>(2);
        ans.add(0,0);
        ans.add(1,2);

        assertTrue(ListDemo.findIdsHumansOlder18(map).equals(ans));
    }
    @Test
    public void testGetTheOldestOnes(){
        ArrayList<Human> list = new ArrayList();
        Student valera = new Student("ivanov","valera","viktorovich",20,"omgu");
        Student oleg = new Student("petrov","oleg","leonidovich",25,"omgu");
        Human innokentii = new Human("vasiliev","innokentii","urievich",25);
        Human akakii = new Human("ponchikov","akakii","akakievich",17);
        list.add(valera);
        list.add(oleg);
        list.add(innokentii);
        list.add(akakii);

        ArrayList<Human> res = new ArrayList();
        res.add(oleg);
        res.add(innokentii);
        assertTrue(ListDemo.getTheOldestOnes(list).equals(res));



    }
}
