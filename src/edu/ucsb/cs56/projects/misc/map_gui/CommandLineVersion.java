package edu.ucsb.cs56.projects.misc.map_gui;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Dimension;
import java.util.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.HashMap;


/**
 *
 * @author Jinfa Zhu and Shouzhi Wan
 */

//Command line version of map gui

public class CommandLineVersion{
	public static void main(String[] args) throws IOException {	
		boolean yes=true;

		String b="Biological Sciences";
		String e="Engineering";
		String h="Human and Social Sciences";
		String l="Library";
		String m="Music";
		String p="Physics";
		String t="Trailer";
		Scanner reader;
		String i = "";
		String s = "";
		while(yes){
		    reader=new Scanner(System.in);
		    System.out.println("enter 1 for department and 2 for specific building");
		    i=reader.nextLine();

		    if(!(i.equals("1") || i.equals("2"))){
		    	System.out.println("not a valid input, please enter 1 or 2");
		    	continue;
		    }


		    TheGUI gui = new TheGUI();
		    if(i.equals("1")){
		       
				reader = new Scanner(System.in);
				System.out.println("Which department are you interested in?\n"
						   +b+'\n'+e+'\n'+h+'\n'+l+'\n'+m+'\n'+p+'\n'+t);
				s = reader.nextLine();
				if(s.equals(b)){
			    gui.BSIF();
				}
				else if(s.equals(e)){
			    	System.out.println("Which one? enter 1 or 2\n 1. Engineering Science\n 2. Engineering 2 ");
					i = reader.nextLine();
					if(!(i.equals("1") || i.equals("2"))){
		    			System.out.println("not a valid input, please enter 1 or 2");
		    			continue;
		    		}
			    	if(i.equals("1"))
						gui.ENGRSCI();
			    	else 
						gui.ENGR2();
				}
				else if(s.equals(h)){
			    	gui.HSSB();
				}
				else if(s.equals(l)){
			   		gui.LIBRARY();
				}
				else if(s.equals(m)){
			    	gui.LLCH();
				}
				else if(s.equals(p)){
			    	gui.BRDA();
				}
				else if(s.equals(t)){
			    	System.out.println("Which one? enter 1 or 2\n 1. T387\n 2. T429");
					i =reader.nextLine();
					if(!(i.equals("1") || i.equals("2"))){
		    			System.out.println("not a valid input, please enter 1 or 2");
		    			continue;
		    		}
                	if(i.equals("1"))
						gui.T387();
                	else
						gui.T429();
				}
			
		    }
			else if(i.equals("2")){
			    reader = new Scanner(System.in);
			    System.out.println("Which building?");
			    System.out.println(MapStatics.bldgAbbrs);
			    s=reader.nextLine();	
			    //TheGUI gui=new TheGUI();
			    if(!(MapStatics.bldgAbbrs.contains(s))){
		    		System.out.println("not a valid input");
		    		continue;
		    	}
				
				if(MapStatics.bldgAbbrs.indexOf(s)==0){
				    gui.T387();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==1){
				    gui.T429();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==2){
				    gui.BRDA();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==3){
				    gui.BSIF();
					}
				else if(MapStatics.bldgAbbrs.indexOf(s)==4){
				    gui.LIBRARY();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==5){
				    gui.ENGRSCI();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==6){
				    gui.ENGR2();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==7){
				    gui.GIRV();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==8){
				    gui.HFH();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==9){
				    gui.HSSB();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==10){
				    gui.KERR();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==11){
				    gui.LLCH();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==12){
				    gui.NORTH();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==13){
				    gui.PHELP();
				}
				else if(MapStatics.bldgAbbrs.indexOf(s)==14){
				    gui.SOUTH();
				}
				
			}	
		    while(!(s.equals("yes")) && !(s.equals("no"))){
			reader = new Scanner(System.in);
			System.out.println("Continue? yes/no");
			s=reader.nextLine();
		    }
		    
		    if(s.equals("yes")){
			gui.frame.dispose();
			continue;
		    }
		    if(s.equals("no")){
			System.exit(0);
		    }
		    
		    
		}

		
	}
}
