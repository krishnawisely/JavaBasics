import java.util.*;  
public class Simple{  
public static void main(String args[]){
HashMap<Integer, String> map = new HashMap<Integer, String>();
map.put(1,"krishna");
map.put(2,"raj");
map.put(3,"ram");
for(Map.Entry data : map.entrySet())
{
System.out.println("Key=>"+data.getKey()+"Value=>"+data.getValue());
}
}
}
