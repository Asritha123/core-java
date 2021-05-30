package com.vm.training.java.strings;

public class IndexMethod {
	

	    /* Checks if a string is empty ("") or null. */
	    public static boolean isEmpty(String s) {
	        return s == null || s.length() == 0;
	    }
	 
	    /* Counts how many times the substring appears in the larger string. */
	    public static int countMatches(String text, String str)
	    {
	        if (isEmpty(text) || isEmpty(str)) {
	            return 0;
	        }
	 
	        int index = 0, count = 0;
	        while (true)
	        {
	            index = text.indexOf(str, index);
	            if (index != -1)
	            {
	                count ++;
	                index += str.length();
	            }
	            else {
	                break;
	            }
	        }
	 
	        return count;
	    }
	 
	    public static void main(String[] args)
	    {
	        String text = ("When we take the time to examine the beauty of the world around us, we are able to see parallels within our own lives. One who in tune with nature is in tune with the practice of living. Nature moves in a spiral as do our personal lives");
	        		
	        String str = "when";
	 
	        int count = countMatches(text, str);
	        System.out.println(count);
	    }
	}


