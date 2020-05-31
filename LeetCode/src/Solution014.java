import MyPractice.util.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution014 {
    public static void main(String[] args){

        String[] test = new String[]{
          "ABN","ANS","sss","ABN","ANS","ANS"
        };
        ArrayList<String> strings1 = new ArrayList<String>();
        strings1 = Solution014.topN(test,2);
        for (String temp : strings1){
            System.out.println(temp);
        }
    }
    public static ArrayList<String> topN(String[] strings, int N){
          ArrayList<String> list = new ArrayList<>();
          HashMap<String,Integer> map = new HashMap<String,Integer>();
          for (int i = 0; i < strings.length; i++){
              if(map.containsKey(strings[i])){
                  map.put(strings[i],map.get(strings[i])+1);
              }else {
                  map.put(strings[i],1);
              }
          }
        PriorityQueue<Element> pb = new PriorityQueue<Element>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            boolean add = pb.add(new Element(entry.getKey(), entry.getValue()) {
            });
        }
        for (int i = 0; i < N; i++){
            list.add(pb.poll().getNum());
        }
        return list;

    }

    private class Entry<T, T1> {
    }
}