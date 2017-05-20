

import org.omg.Dynamic.Parameter;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * Created by user on 5/16/17.
 */
public class ReflectionDemo  {
    public static int findCountOfHumans(ArrayList<Object> objs){
        int result=0;

        for (int i=0;i < objs.size(); i++){
            if(objs.get(i) instanceof Human){
            result++;
            }
        }
        return result;
    }

    public static ArrayList<String> getListOfOpenedMethodsOfObject (Object obj){
        ArrayList<String> result= new ArrayList<String>();
        for (int i=0; i< obj.getClass().getMethods().length; i++){
            result.add(i, obj.getClass().getMethods()[i].getName());
        }

        return result;
    }
    public static ArrayList<String> getListOfOpenedSuperClassesOfObject (Object obj){
        ArrayList<String> result= new ArrayList<String>();
        Class cl = obj.getClass();
        result.add(cl.getName());
        while (cl != Object.class){
             cl =  cl.getClass().getSuperclass();
            result.add( cl.getName());
        }

        return result;
    }

    public static int findExecute(ArrayList<Object> list) {
        int count=0;
        for (Object obj: list){

            if (obj instanceof Executable){
             Executable  oj =(Executable)  obj;
                oj.execute();
                count++;
            }
        }
        return count;
    }

    public static ArrayList<String> findGettersAndSetters(Object obj){
        ArrayList<String> result = new ArrayList<String>();

        for (int i=0; i< obj.getClass().getMethods().length; i++){
            if (((obj.getClass().getMethods()[i].getName().startsWith("get"))  &&
            (!obj.getClass().getMethods()[i].getReturnType().equals(void.class)) &&
                    (!Modifier.isStatic(obj.getClass().getMethods()[i].getModifiers())) &&
                    (Modifier.isPublic(obj.getClass().getMethods()[i].getModifiers())) &&
                    (obj.getClass().getMethods()[i].getParameterTypes().length == 0)
                    )
            ||
                    ((obj.getClass().getMethods()[i].getName().startsWith("set"))  &&
                            (obj.getClass().getMethods()[i].getReturnType().equals(void.class)) &&
                            (!Modifier.isStatic(obj.getClass().getMethods()[i].getModifiers())) &&
                            (Modifier.isPublic(obj.getClass().getMethods()[i].getModifiers())) &&
                            (obj.getClass().getMethods()[i].getParameterTypes().length == 1))
                    )

            {

                result.add(obj.getClass().getMethods()[i].getName());
                }
            }



        return result;
    }
}
