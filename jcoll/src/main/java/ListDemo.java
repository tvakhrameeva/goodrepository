import java.util.ArrayList;

/**
 * Created by user on 5/11/17.
 */
public class ListDemo {
    private ArrayList<String> arrStr;
    private char sym;

    public ListDemo(ArrayList<String> arrStr,char sym){
        this.arrStr =  arrStr;
        this.sym = sym;
    }

    public int findCountOfSimbolInStringList(ArrayList<String> strList,char symbol){
        int count=0;
        for(int i =0; i < strList.size();i++){
        if (strList.get(i).toString().charAt(0)==symbol){count++;}
        }
     return count;
    }
}
