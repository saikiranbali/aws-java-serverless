package helloworld;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DataTypes {
    public int getNumber(float number)
    {
        return (int) number;
    }
    public List<Integer> getScores(List<String> names){
       HashMap<String,Integer> studentScores = new HashMap<String,Integer>();
       studentScores.put("Kiran",20);
        studentScores.put("Ashok",80);
        studentScores.put("Hemanth",66);

        List<Integer> matchingScores = new LinkedList<>();
        names.forEach(name -> {
            matchingScores.add(studentScores.get((name)));
        });

       return matchingScores;

    }
}
