public class Simple{
public static void main(String args[]){
String name = "krishna";
//Immutable string
name.concat("moorthy");
System.out.println("Immutable string=>"+name);
//Here change is affect
name = name.concat("moorthy");
System.out.println("Immutable string=>"+name);
}}
