import java.util.Arrays;
import java.util.ArrayList;
/**
 * Write a description of class ArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListDriver
{

 public static void LIST1(ArrayList<Integer> list)
 {
 System.out.println("LIST1");
 System.out.println(list);
 for (int index = 0; index < list.size(); index++)
 {
 int elementValue = list.remove(index);
 if (elementValue % 2 == 0) 
 {
 list.add(index);
 }
 System.out.println(list);
 }
 }

public static void LIST2(ArrayList<Integer> list) {
 System.out.println("LIST2");
 System.out.println(list);
 for (int i = 0; i < list.size(); i++) {
 int n = list.get(i);
 if (n % 10 == 0) {
 list.remove(i);
 list.add(n);
 }
 }
 System.out.println(list);
 }

 public static void LIST3(ArrayList<Integer> list) {
 System.out.println("LIST3");
 System.out.println(list);
 for (int i = 1; i < list.size(); i += 2) {
 if (list.get(i - 1) >= list.get(i)) {
 list.remove(i);
 list.add(0, 0);
 }
 }
 System.out.println(list);
 }
public static void LIST4(ArrayList<Integer> list) {
 System.out.println("LIST4");
 System.out.println(list);
 for (int i = 0; i < list.size(); i++) {
 int element = list.get(i);
 list.remove(i);
 list.add(0, element + 1);
 }
 System.out.println(list);
 }
public static void LIST5(ArrayList<Integer> list) {
 System.out.println("LIST5");
 System.out.println(list);
 for (int i = list.size() - 2; i > 0; i--) {
 int a = list.get(i);
 int b = list.get(i + 1);
 list.set(i, a + b);
 }
 System.out.println(list);
 }

 public static void main(String[] args) {
 System.out.println();
 ArrayList<Integer> list1a=new ArrayList<Integer>(Arrays.asList(5,2,5,2));
 ArrayList<Integer> list1b=new ArrayList<Integer>(Arrays.asList(3, 5, 8, 9, 2));
 ArrayList<Integer> list1c=new ArrayList<Integer>(Arrays.asList(0, 1, 4, 3, 1, 3));
 LIST1(list1a);
 LIST1(list1b);
 LIST1(list1c);
 System.out.println();
 ArrayList<Integer> list2a=new ArrayList<Integer>(Arrays.asList(1, 20, 3, 40));
 ArrayList<Integer> list2b=new ArrayList<Integer>(Arrays.asList(3, 5, 8, 9, 2));
 ArrayList<Integer> list2c=new ArrayList<Integer>(Arrays.asList(40, 20, 60, 1, 80, 30));
 LIST2(list2a);
 LIST2(list2b);
 LIST2(list2c);
System.out.println();
 ArrayList<Integer> list3a=new ArrayList<Integer>(Arrays.asList(10, 20, 10, 5));
 ArrayList<Integer> list3b=new ArrayList<Integer>(Arrays.asList(8, 2, 9, 7, -1, 55));
 ArrayList<Integer> list3c=new ArrayList<Integer>(Arrays.asList(0, 16, 9, 1, 64, 25, 25, 14, 0));
LIST3(list3a);
 LIST3(list3b);
 LIST3(list3c);

 System.out.println();
 ArrayList<Integer> list4a=new ArrayList<Integer>(Arrays.asList(10, 20, 30));
 ArrayList<Integer> list4b=new ArrayList<Integer>(Arrays.asList(8, 2, 9, 7, 4));
 ArrayList<Integer> list4c=new ArrayList<Integer>(Arrays.asList(-1, 3, 28, 17, 9, 33));
 LIST4(list4a);
 LIST4(list4b);
 LIST4(list4c);

 System.out.println();
 ArrayList<Integer> list5a=new ArrayList<Integer>(Arrays.asList(72, 20));
 ArrayList<Integer> list5b=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
 ArrayList<Integer> list5c=new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
 LIST5(list5a);
 LIST5(list5b);
 LIST5(list5c);
 }
}
 