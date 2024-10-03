import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for( String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String SortedString = new String(c);
            if(!map.containsKey(SortedString)){
                List<String> list= new ArrayList<String>();
                    // list.add(str);
                map.put(SortedString, list);
            }
            map.get(SortedString).add(str);

            // map.put(SortedString, )
        }
        return new ArrayList<>(map.values());
    }
}
