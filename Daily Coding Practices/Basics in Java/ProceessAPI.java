package com.fita;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProceessAPI {

	public static void main(String[] args) {
		
		ProcessHandle ph = ProcessHandle.current();
		
		ProcessHandle ph2 = ProcessHandle.current();
		
		ProcessHandle.Info pinfo = ph.info();
		
		Stream<ProcessHandle> ph1 = ProcessHandle.allProcesses();
		
		List<String> list = new ArrayList<String>(); 
        list.add("notepad.exe"); 
        list.add("xyz.txt"); 
		
		
		ProcessBuilder pb = new ProcessBuilder(list);
		
		System.out.println("Command: " + pb.command());
		
		System.out.println("RedirectError: " + pb.redirectErrorStream());
		
		System.out.println("Process ID: " +ph.pid());
		
		System.out.println("Children: " +ph.children());
		
		System.out.println("Descendants: " +ph.descendants());
		
		System.out.println("Info: " +ph.info());
		
		System.out.println("Equals: " +ph.equals(ph2));
		
		System.out.println("Equals: " +ph.equals(ph1));
		
		System.out.println("Hashcode: " +ph.hashCode());
		
		System.out.println("Parent: " +ph.parent());
		
		System.out.println("Count: " +ph1.count());
		
		System.out.println("ToString: " +ph1.toString());
		
		System.out.println("Alive: " +ph.isAlive());
		
		System.out.println("Compare: " +ph.compareTo(ph2));
		
		System.out.println("Start Time of Process: " +pinfo.startInstant().get());
		
		System.out.println("Total Duration of CPU: " +pinfo.totalCpuDuration().get());
		
		

	}

}
