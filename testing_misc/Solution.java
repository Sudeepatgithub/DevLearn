package testing_misc;

import java.io.*;
import java.util.*;


class Solution {
    public static void main(String[] args) {
        //System.out.println("Hello, World");
        String beginWord = "hit";
        String endWord = "cog";
        String words[]= {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(traverse(beginWord, endWord, words));
    }

    public static int traverse(String beginWord, String endWord, String[] words) {
        ArrayList<String> wordList = new ArrayList<>();
        for(String word: words){
            wordList.add(word);
        }
        if(!wordList.contains(endWord)){
            return -1;
        }
        Map<String, ArrayList<String>> neighbours = new HashMap<>();
        wordList.add(beginWord);
        for(String word: wordList){
            for(int j=0;j<word.length();j++){
                String pattern = word.substring(0,j) +"*"+word.substring(j+1);
                //neighbours.computeIfAbsent(pattern, x -> new ArrayList<>());
                ArrayList<String> nei = neighbours.getOrDefault(pattern, new ArrayList<>());
                nei.add(word);
            }
        }
        Queue<String> q = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        q.add(beginWord);
        int count = 1;
        while(!q.isEmpty()){
            for(int i=0; i<q.size();i++){
                String word = q.poll();
                if(word.equals(endWord)){
                    return count;
                }
                for(int j=0;j<word.length();j++) {
                    String pattern = word.substring(0, j) + "*" + word.substring(j + 1);
                    for (String neighbour : neighbours.getOrDefault(pattern, new ArrayList<>())) {
                        if (!visited.contains(neighbour)) {
                            q.add(neighbour);
                            visited.add(neighbour);
                        }
                    }
                }
                count++;
            }
        }
        return count;
    }
}

// boolean solution(int[] a, int[] b) {
//     List<Integer> ids = new ArrayList<>();
//     for (int i = 0; i < a.length; i++) {
//         if (a[i]!= b[i]) {
//         ids.add(i);
//         }
//     }
//     if (ids.size() == 0) {
//         return true;
//     }
//     if (ids.size() != 2) {
//         return false;
//     }
//     int id1 = ids.get(0);
//     int id2 = ids.get(1);
//     if (a[id1] == b[id2] && a[id2] == b[id1]) {
//         return true;
//     }
//     return false;
// }

// Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
// [a, b, c], [a, b, c]
// [a, b, c], [b, a, c]



//hit -> h*t *it hi*
//hot -> h*t *ot ho*

