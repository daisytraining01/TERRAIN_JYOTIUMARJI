package com.indivisual.activity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

//Write a program to remove duplicate values from the 
//has set that has the key value pair as below

//comment program statment is not clear
public class CollectionProg2 {

	public static void main(String[] args) {

       HashMap<String, String>map=new HashMap<String, String>();
       map.put("key1", "testval1");
       map.put("key2", "testval2");
       map.put("key3", "testval1");
       map.put("key4", "testval1");
       map.put("key5", "testval2");
       map.put("key5", "testval2");
       map.put("key5", "testval3");
       HashSet <String> set=new HashSet<String>();
   for (Entry<String,String> s:map.entrySet()) {
	set.add(s.getValue());
}
      
      Iterator<String> itr = set.iterator(); 
      while(itr.hasNext()){
    	  System.out.println(itr.next());
    	}
	}

}
