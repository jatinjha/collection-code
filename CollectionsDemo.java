import java.io.*;
import java.util.*;
//<=============ArrayExample =================>>>>>>>>>>>>>>>>>>>>
/*
class ArrayExample {
	public static void main (String[] args) {
		
		int[] a = new int[20];
		a[1] = 1;
		a[2] = 2;
		
		for(int x : a){
		    System.out.println(x);
		}
		
	}
}
*/

//<=============ArrayListExample =================>>>>>>>>>>>>>>>>>>>>
/*class ArrayListExample {
	public static void main (String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add("jatin");
		al.add(12.23);
		al.remove(12.23);
		int size_list  = al.size();
		System.out.println("size of arraylist := "+size_list);
		System.out.println(al);
		
	}
}
*/

//<<<<<<<<<<<<<<<<<<<=================== LinkedList Example =================>>>>>>>>>>>>>>>>>>>>
/*
class LinkedListExample{
    public static void main(String[] args){
        
        LinkedList ll = new LinkedList();
        ll.addFirst("jj");
        ll.addFirst(12);
        ll.addLast(233.33);
        int ele = (int)ll.get(0);
        System.out.println(ele);
        System.out.println(ll);
        
        
    }
}
*/


//<<<<<<<<<<<<<<<<<<<=================== Cursor in java =================>>>>>>>>>>>>>>>>>>>>
/*
class IteratorDemo{
    public static void main(String[] args){
        
        ArrayList al = new ArrayList();
        for(int i=0 ; i<10 ; i++){
            al.add(i*10);
        }
        
        Iterator it = al.iterator();
        while(it.hasNext()){
            
            int a = (int)it.next();
            System.out.println(a);
        }
    }
}
*/

//<<<<<<<<<<<<<<<<<<<=================== Hash Set =================>>>>>>>>>>>>>>>>>>>>
/*
class HashSetDemo{
    public static void main(String[] args){
        
        HashSet hs = new HashSet();
        hs.add(123);
        hs.add(123);
        
        hs.add("jatin");
        hs.add('s');
        
        System.out.println(hs);
        
    }
}
*/
//<<<<<<<<<<<<<<<<<<<=================== Tree Set =================>>>>>>>>>>>>>>>>>>>>
/*
class DemoComparator implements Comparator{
    
    
    public int compare(Object ob1 , Object ob2){
        
        Integer i = (int)ob1;
        Integer j = (int)ob2;
        
        if(i<j){
            return 1;
        }
        if(i>j){
            return -1;
        }
        else{
            return 0;
        }
        
    }
}

class TreeSetDemo{
    public static void main(String[] args){
        
        TreeSet ts = new TreeSet(new DemoComparator());
        ts.add(12);
        ts.add(-12);
        ts.add(2);
        ts.add(122);
        ts.add(0);
        ts.add(11);
        System.out.println(ts);
    }
}
*/
//<<<<<<<<<<<<<<<<<<<=================== HashMap =================>>>>>>>>>>>>>>>>>>>>
/*
class HashMapDemo{
    public static void main(String[] args){
        
        HashMap hm = new HashMap();
        hm.put("jj",12);
        hm.put("jja",12);
        hm.put("jjs",212);
        System.out.println(hm);
        
        Set se = hm.entrySet();
        Iterator it = se.iterator();
        
        while(it.hasNext()){
            
            Map.Entry m = (Map.Entry)it.next();
            
            System.out.println(m.getKey()+" , "+m.getValue());
            
            
        }
        
        
    }
}
*/

///<<<<<<<<<<<=========================== TreeMapDemo================================>>>>>>>>>>>>>>>>>>>>>>>>
/*
class MyDemoCampare implements Comparator{
    
    public int compare(Object obj1 , Object obj2){
        
        String s1 = (String)obj1;
        String s2 = (String)obj2;
        
        return s1.compareTo(s2);
    }
    
}

class TreeMapDemo 
{
     public static void main(String[] args){
     
            TreeMap tm = new TreeMap(new MyDemoCampare());
            tm.put("abc",123);
            tm.put("zbc",123);
            tm.put("axc",123);
            tm.put("abz",123);
            tm.put("aaq",123);
        
            System.out.println(tm);
            
     }
     
}
*/


