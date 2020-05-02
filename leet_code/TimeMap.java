package leet_code;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {

/*
["TimeMap","set","get","get","set","get","get"],
inputs = [[],["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]
 */
    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        System.out.println(timeMap.get("foo",1));
        System.out.println(timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4);
        System.out.println(timeMap.get("foo",4));
        System.out.println(timeMap.get("foo",5));
        System.out.println(timeMap.get("foo",1));
    }

    Map<String,TreeMap<Integer,String>> map;

    public TimeMap() {
        map =  new HashMap();
    }

    public void set(String key, String value, int timestamp) {
        if(map.get(key)==null){
            TreeMap treeMap = new TreeMap<>();
            treeMap.put(timestamp,value);
            map.put(key,treeMap);
        }
    }

    public String get(String key, int timestamp) {

        return "";
    }


}
