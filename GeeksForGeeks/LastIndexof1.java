/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int testcases = sc.nextInt();
		String str= sc.nextLine();
		while(testcases-->0){
		    str = sc.nextLine();
		    System.out.println(GetLastIndex(str));
		}
	}
	public static int GetLastIndex(String str){
	    return GetLastIndex_Approach2(str);
	}
// 	Left to Right
	public static int GetLastIndex_Approach1(String str){
	    int index=-1;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='1'){
	            index=i;
	        }
	    }
	    return index;
	}
// 	Right to Left
	public static int GetLastIndex_Approach2(String str){
	    int index=-1;
	    for(int i=str.length()-1;i>=0;i--){
	        if(str.charAt(i)=='1'){
	            return i;
	        }
	    }
	    return index;
	}
}