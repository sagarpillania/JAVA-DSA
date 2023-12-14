import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
// import java.util.List;
import java.util.Vector;

public class Coll_Framework {
    public static void main(String[] args) 
    {
//--------------------------------------------LIST-------------------------------------------------------------------------
        // List<Integer> list=new ArrayList<>(); we can make it like this also but it's not good coding
// in above wemade interface object by calling the constructor of class i.e ArrayList.
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(10); // we can't add list.add("sagar"); because we specified the generics
        System.out.println("List is : "+list); //output=[10,30,10]
        list.add(1,20); //it add the value at index 1
        System.out.println("updated List is : "+list);//output=[10,20,30,10]
//----------LINKED LIST----------------------------------
        LinkedList<Integer> llist=new LinkedList<Integer>();
        llist.add(10);
        llist.add(20);
        llist.add(10);
        System.out.println("Linked list is : "+llist); //=[10,20,10]
        // llist.removeLast();
        // System.out.println(llist); //=[10,20] removed last
        // llist.remove(0);
        // System.out.println(llist);//=[20] removed element at index 0
//-----------------VECTOR-----------------------------------
        Vector<String> vec=new Vector<>();
        vec.add("s");
        vec.add("sagar");
        vec.add("s");
        System.out.println("Vector is : "+vec); // =[s,sagar,s]
//Vector is synchronised(slow then arraylist) because it don't do multithreading. it do one work ata a time. whereas arraylist is unsynchronised and fast and do multithreading. Thus we use vector in stack to maintain order and do one wor at a time either push,pop,peek... to perfom one operation at a time.
//------------------------STACK-----------------------------
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("stack : "+stack);
        stack.pop(); //remove the last item added thus follow LIFO. 
        System.out.println("updated stack: "+stack);
        System.out.println(stack.peek()); //=20 to see top most element
//---------------------------------------SET------------------------------------------------------------------------- set is an unordered collection,with no duplicacy allowed like opposite to list.
//------------HASHSET--------------------------------
        Set<Integer> hset= new HashSet<>();
        hset.add(10);
        hset.add(20);
        hset.add(30);
        hset.add(10);
        System.out.println("Hashset: "+hset); //=[20,10,30] not in ordered as we added and only show 10 one time.
//-------LINKEDHASHSET----------------------------------
        LinkedHashSet<Integer> lhset=new LinkedHashSet<>();
        lhset.add(10);
        lhset.add(20);
        lhset.add(30);
        lhset.add(10);
        System.out.println("linkedHashSet: "+lhset); //[10,20,30] it is linked so followed the list orderd property but unique value only i.e set property.
//-------------------TREESET--------------------------------
        TreeSet<Integer> tset=new TreeSet<>();
        tset.add(10);
        tset.add(5);
        tset.add(12);
        tset.add(2);
        tset.add(2);
        System.out.println("TreeSet: "+tset); //[2,5,10,12] ordered because it implement binary search tree.
//----------------------------QUEUE---------------------------------------------------------------------------------
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.offer(20); //offer=same as add
        queue.offer(40);
        queue.add(30);
        System.out.println("queue: "+queue); //[10,20,40,30]
        System.out.println(queue.remove()); // when the it remove it return the value too. i.e 10
        System.out.println(queue.poll()); //poll=same as remove 20
        System.out.println("queue: "+queue); //[40,30]
// it's best to use offer and poll as add & remove throw exception
//-------------Deque-----------------------
        Deque<Integer> adq=new ArrayDeque<>();
        adq.offer(10);
        adq.offer(20);
        adq.offerLast(30);
        adq.offerFirst(40); // it means this value goes to top of at first
        System.out.println("ArrayDeque: "+adq); //[40,10,20,30]
        adq.pollLast();// remove the 30
        adq.pollFirst();// remove 40
        System.out.println(adq); //[10,20]
//--------PriorityQueue--------------------
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(12);
        pq.offer(3);
        pq.offer(4);
        pq.offer(15);
        pq.offer(10);
        System.out.println("PriorityQueue: "+pq); // it'll show the top most value minimum and rest order doesn't matter.[3,10,4,15,12]
        pq.poll(); // remove 3 
        System.out.println(pq);//[4,10,12,15] //it'll show minimum first
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder()); // for maximum nbr to display 1st
        pq1.offer(12);
        pq1.offer(3);
        pq1.offer(4);
        pq1.offer(15);
        pq1.offer(10);
        System.out.println("max heap priority queue: "+pq1);
//--------------------------MAP------------------------------------------------------------------------------------
        HashMap<String , Integer> map= new HashMap<>();
        map.put("Second",20);
        map.put("First",10);
        System.out.println("hashmap value: "+map); // {Second=20, First=10}
//------------TreeMap--------------------------------------
        TreeMap<String , Integer> tmap= new TreeMap<>();
        tmap.put("Second",20);
        tmap.put("First",10);
        System.out.println("Treemap value: "+tmap); // {First=10, Second=20}     


    }
}
