import java.util.*;
public class Simple{
public static void main(String args[]){

List<String> list = new Vector<String>();
list.add("krishna");
list.add("ragu");
list.add("krishna");
Iterator<String> itr = list.iterator();
while(itr.hasNext())
{
System.out.println(System.currentTimeMillis());
System.out.println(itr.next());
System.out.println(System.currentTimeMillis());
}
}}
