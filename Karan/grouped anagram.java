import java.util.*;
class Main{
public List groupedAnagram(String[] arr)
{
    Map<String, List<String>> groupedAnagram=new HashMap<>();
    for(String str:arr)
    {
        char[] chararr=str.toCharArray();
        Arrays.sort(chararr);
        String sortedstr=String.valueOf(chararr);
        if(!groupedAnagram.containsKey(sortedstr)){
            groupedAnagram.put(sortedstr,new ArrayList<>());
        }
        groupedAnagram.get(sortedstr).add(str);
    }
    return new ArrayList<>(groupedAnagram.values());
}
    public static void main(String args[])
    {
        Main o=new Main();
        String[] arr={"eat","tea","tan","ate","nat","bat"};
        System.out.print(o.groupedAnagram(arr));
        
    }
}
