package com.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Keypad {
	
	private static Map<Integer, String> map = new HashMap<>();
	    
    public static void possibleWords(int arr[], int ind, int n, List<String> list, List<String> ans) {

    	if(ind==n) {
    		
    		if(list.size()>0) {
    			StringBuffer sb = new StringBuffer();
    			for(String s:list)
    				sb.append(s);
    			
    			ans.add(sb.toString());
    		}
    		
    		return;
    	}
    	
    	int key = arr[ind];
    	String val = map.get(key);
    	
    	for(int i=0;i<val.length();i++) {
    		
    		list.add(val.charAt(i)+"");
    		possibleWords(arr, ind+1, n, list, ans);
    		list.remove(list.size()-1);
    		
    	}
    
    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map.put(1, "");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		map.put(0, "");
		
		int arr[] = {2, 3, 4};
		int n = 3;
		
		List<String> list = new ArrayList<>();
		List<String> ans = new ArrayList<>();
		possibleWords(arr, 0, n, list, ans);
		
		System.out.println(ans);
		
	}

}
