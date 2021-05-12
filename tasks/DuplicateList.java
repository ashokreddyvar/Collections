package tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateList {

	public static void main(String[] args) {
		    List<Integer> dupList=new ArrayList<>();
		    dupList.add(33);
		    dupList.add(45);
		    dupList.add(45);
		    dupList.add(89);
		    dupList.add(33);
		    dupList.add(47);
		    dupList.add(21);
		    dupList.add(45);
		   
		   
		    Set<Integer> sourcelist=new HashSet<Integer>();
		    Set<Integer> targetlist=new HashSet<Integer>();
		   
		    for(Integer x: dupList) {
		        if(sourcelist.add(x)) {
		           
		        }
		        else {
		            targetlist.add(x);
		            }
		    }
		    System.out.println("the duplicate values in list :="+targetlist);
		}

	}


