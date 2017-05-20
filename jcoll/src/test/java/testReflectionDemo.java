import org.junit.Test;


import java.util.ArrayList;
import java.util.Enumeration;

import static org.junit.Assert.assertTrue;

/**
 * Created by user on 5/16/17.
 */
public class testReflectionDemo {
    @Test
    public void testfindCountOfHumans()  {
        ArrayList<Object> str= new ArrayList<Object>();
        int[] set0 = new int[]{1,2,3,4};
        String set1 = new String("gg");
        Human set2 = new Human("vasilii","petrovich","juk",56);
        Human set3 = new Human("anna","petrovna","juk",4);

        str.add(0,set0);
        str.add(1,set1);
        str.add(2,set2);
        str.add(3,set3);

        int ans=2;

        assertTrue(ReflectionDemo.findCountOfHumans(str) ==ans);

    }
    @Test
    public void testgetListOfOpenedMethodsOfObject(){
        Human set3 = new Human("anna","petrovna","juk",4);
        ArrayList<String> str = new ArrayList<String>();

        str.add("getSecondName");
        str.add("getSurname");
        str.add("setSurname");
        str.add("getAge");
        str.add("setSecondName");
        str.add("setAge");
        str.add("equals");
        str.add("hashCode");
        str.add("getName");
        str.add("setName");
        str.add("wait");
        str.add("wait");
        str.add("wait");
        str.add("toString");
        str.add("getClass");
        str.add("notify");
        str.add("notifyAll");
        assertTrue(ReflectionDemo.getListOfOpenedMethodsOfObject(set3).equals(str));
    }

    @Test
    public void testgetListOfOpenedSuperClassesOfObject(){
        Human set3 = new Human("anna","petrovna","juk",4);
        ArrayList<String> ans = new ArrayList<String>();
        ans.add(0,"Human");
        ans.add(1,"java.lang.Object");
        assertTrue(ReflectionDemo.getListOfOpenedSuperClassesOfObject(set3).equals(ans));
    }

    @Test
    public void testfindExecute(){
        class Class0 implements Executable, Enumeration {
            public void execute() {
            }

            public boolean hasMoreElements() {
                return false;
            }

            public Object nextElement() {
                return null;
            }
        }

        class Class1 {
        }

        class Class2 implements Executable{
            public void execute() {
            }
        }
        class Class3 {
        }

        ArrayList<Object> str= new ArrayList<Object>();
        Class0 set0 = new Class0();
        Class1 set1 = new Class1();
        Class2 set2 = new Class2();
        Class3 set3 = new Class3();

        str.add(set0);
        str.add(set1);
        str.add(set2);
        str.add(set3);

        assertTrue(ReflectionDemo.findExecute(str)==2);
    }

    @Test
    public void testFindGettersAndSetters(){
        ArrayList<String> res = new ArrayList<String>();
        Human human = new Human("anna","petrovna","juk",4);
        res.add("getSecondName");
        res.add("getSurname");
        res.add("setSurname");
        res.add("getAge");
        res.add("setSecondName");
        res.add("setAge");
        res.add("getName");
        res.add("setName");
        res.add("getClass");
        assertTrue(ReflectionDemo.findGettersAndSetters(human).equals(res));
    }

}
