package edu.ucsb.cs56.projects.misc.map_gui;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;
import java.util.HashMap;


public class MapStatics {

//building information

    static String T387Info = 
		"1 Start by making your way towards the University Center.\n"
        +"\n"        
        +"2 Once you get to the University Center make a left.\n"                           
        +"\n" 
        +"3 Coninue walking straight until you get to the bike path. "
        +"Cross the bike path and cross the parking lot.\n"
        +"\n" 
        +"4 Trailer 387 will be the building parallel to the parking"
        + "lot on the right side of the parking lot.";
		
        
	static String T429Info = 
        "1 Start by making your way towards the University Center.\n"
        +"\n"
        +"2 Once you get to the University Center make a left.\n"
        +"\n"   
        +"3 Coninue walking straight until you get to the bike path. "
        +"Cross the bike path and cross the parking lot.\n"
        +"\n"
        +"4 Trailer 429 will be the building in the middle of three "
        + "similar looking buildings. It is an older brown building.\n";
		

    static String BRDAInfo = 
		"1 Start out by walking away from the University Center towards "
        +"the Women's Center. Cross the bikepath and get on the sidewalk.\n"
		+"\n"
		+"2 When you get to the sidewalk, turn right and keep going until "
		+"you have the library in front of you and a red metal sculpture on your left.\n"
		+"\n"
		+"3 Keep going until you pass the Arbor and Woodstock's and then take "
		+"the slight right sidewalk. This will take you to a long lawn.\n"
		+"\n"
		+"4 Stay on the left side of the lawn and keep going until you pass a bike parking"
		+" lot and are facing a big square planter. Broida Hall will be on your right.";
		
        
	static String BSIFInfo =
		"1 Start out by walking towards the University Center. "
		+"When you get to the University Center, turn left.\n"
		+"\n"
		+"2 Keep going straight until you get to the parking lot and then turn left.\n"
		+"\n"
		+"3 Make your way onto the sidewalk next to UCEN Road.\n"
		+"\n"
		+"4 Continue on UCEN Road. Pass Santa Rosa Residence Hall on your right, the Psychology "
		+"Building on your left, Parking Lot 7 on your left, and the Life Sciences Building on left.\n"
		+"\n"
		+"5 Turn left after the blue and grey Life Sciences Building, and the Biological Sciences "
		+ "Instructional Facility will be on the left.";
		
        
	static String GIRVInfo =
		"1 Start out by walking away from the University Center towards the Women's Center. "
		+"Cross the bikepath and get on the sidewalk.\n"
		+"\n"
		+"2 When you get to the sidewalk, turn right and continue on the sidewalk until you see the building on your left. "
		+"You can also turn left at the red metal sculpture and there is another entrance on that side of the building.\n"; 
	
	
	static String HSSBInfo =  
		"1 Start out by walking away from the University Center towards the Women's Center. "
		+"Cross the bikepath and get on the sidewalk.\n"
		+"\n"
		+"2 When you get to the sidewalk, turn left and continue on the sidewalk for about 100 feet. It will be on your right.";
		
		
	static String HFHInfo =
		"1 Start out by walking away from the University Center and towards the Women's Center. Find the sidewalk and turn left.\n"
		+"\n"
		+"2 Continue until you get to the library and walk up the steps and through the walkway next to the library.\n"
		+"\n"
		+"3 When you leave this walkway keep going straight until you cross the bike path and find the parking lot.\n"
		+"\n"
		+"4 Now, turn left and follow the bikepath that will be on your left. When the bike path turns right, follow it. "
		+"Broida Hall will be on your left and Webb Hall will be on your right.\n"
		+"\n"
		+"5 Harold Frank Hall will be straight ahead. You will cross the bike path again and be right in front of it.";
   
   
	static String KERRInfo =
		"1 Start out by walking away from the University Center towards the Women's Center. "
		+"Cross the bikepath and get on the sidewalk.\n"
		+"\n"
		+"2 When you get to the sidewalk, turn right and continue on the sidewalk until you see the "
		+"library ahead of you and a red metal sculpture on your left.\n"
		+"\n"
		+"3 Turn left at the red metal sculpture. Continue past the tables and past the Arbor and Woodstocks,"
		+" which will be on your left.\n"
		+"\n"
		+"4 Kerr Hall will be on the left just past Woodstocks. It is a two-story, cement-colored building"
		+" with red accents. If you go too far, you will pass through an enclosed walkway - this is North Hall.";
	
	
	static String LLCHInfo =
		"1 Start by making your way towards the University Center.\n"
		+"\n"
		+"2 Once you get to the University Center make a left.\n"
		+"\n"
		+"3 Continue walking straight until you pass the ATM's on your right and "
		+"see a sidewalk leading to steps on your left.\n"
		+"\n"
		+"4 Take these steps. You will be in the music building. The concert hall is "
		+"through the glass double doors on your left.\n";
			
			
	static String PHELPInfo =
		"1 Start out by walking away from the University Center towards the Women's Center. "
		+"Cross the bikepath and get on the sidewalk.\n"
		+"\n"
		+"2 When you get to the sidewalk, turn right and continue on the sidewalk until "
		+"you are facing the library and have a red metal sculpture on your left.\n"
		+"\n"
		+"3 At the sculpture turn left. You should pass Girvetz Hall and the Arbor.\n"
		+"\n"
		+"4 As you pass the Arbor, you will want to take a sidewalk that turns slightly right. This sidewalk "
		+"should take you diagonally across the lawn, and you should end up with Buchanan Hall on your left.\n"
		+"\n"
		+"5 Phelps Hall is hidden behind Buchannan Hall. Walk just past Buchannan and turn left. "
		+"You will see a building labeled as Gevirtz Graduate School of Education. This building is actually Phelps Hall. "
		+"Walk through the walkway into the courtyard.";
			
			
    static String NORTHInfo = 
		"1 Start out by walking north towards South Hall. "
		+"Cross the bikepath at the bike loop and continue walking past South Hall.\n"
		+"\n"
		+"2 After you have passed South Hall, continue walking north beside the bike path.\n"
		+"\n"
		+"3 When you reach the bike lot near the bus loop, turn right. "
		+"The building across the small grass field is North Hall.\n";
    
	
    static String SOUTHInfo = 
		"1 Head east alongside the bike path until you reach the bike loop.\n"
		+"\n"
		+"2 Turn left and head north across the bike path. "
		+"The bike loop should be on your right.\n"
		+"\n"
		+"3 Continue walking alongside the bike path until it turns right.\n"
		+"\n"
		+"4 You will see a bike lot to your right. The building right next to this bike lot is South Hall.\n";
		
		
    static String ENGRSCIInfo =
		"1 Head east alongside the bike path until you reach the bike loop.\n"
		+"\n"
		+"2 Continue east across the bike path and follow the bike path until you reach another bike loop.\n"
		+"\n"
		+"3 Head north across the bike path. The bike loop should be on your right.\n"
		+"\n"
		+"4 Continue walking north into the open courtyard. "
		+"When you pass the Arbor, turn right and head east. The library should be on your right.\n"
		+"\n"
		+"5 Continue walking east and you will see a large rectangular field. "
		+"Walk to the end of the field until you see a bike path.\n"
		+"\n"
		+"6 Turn left and walk north alongside the bike path until you are in between two buildings. "
		+"The building on your left (west) is the Chemistry building. "
		+"The modern-looking building on your right (east) is the Engineering Science building.\n";
		
		
    static String ENGR2Info = 
		"1 Head east alongside the bike path until you reach the bike loop.\n"
		+"\n"
		+"2 Continue east across the bike path and follow the bike path until you reach another bike loop.\n"
		+"\n"
		+"3 Head north across the bike path. The bike loop should be on your right.\n"
		+"\n"
		+"4 Continue walking north into the open courtyard. "
		+"When you pass the Arbor, turn right and head east. The library should be on your right.\n"
		+"\n"
		+"5 Continue walking east and you will see a large rectangular field. "
		+"Walk to the end of the field until you see a bike path.\n"
		+"\n"
		+"6 The building on the other side of the bike path adjacent to the field is the Engineering II building.\n";
		
		
    static String LIBRARYInfo =
		"1 Head east alongside the bike path until you reach the bike loop.\n"
		+"\n"
		+"2 Continue east across the bike path and follow the bike path until you reach another bike loop.\n"
		+"\n"
		+"3 Head north across the bike path. The bike loop should be on your right.\n"
		+"\n"
		+"4 Continue walking north into the open courtyard. The building to your right is Davidson Library. "
		+"The main entrance is near the center of the side facing you.\n";
	
	
	//Arrays of building names and abbreviations and buttons
	static ArrayList<String> bldgNames = new ArrayList<String>();
	static ArrayList<String> bldgAbbrs = new ArrayList<String>();
	static ArrayList<JButton> buttonList = new ArrayList<JButton>();
	static HashMap buttonMap = new HashMap();
  
	//Important: The relative order of the name, abbr and button ArrayLists must be the same
	//All new entries should call the .add() method in the same order for each ArrayList
	static {
		bldgNames.add("Trailer 387");
		bldgAbbrs.add("387");
		bldgNames.add("Trailer 429");
		bldgAbbrs.add("429");
		bldgNames.add("Broida Hall");
		bldgAbbrs.add("BRDA");
		bldgNames.add("Biological Sciences Instruction Facility");
		bldgAbbrs.add("BSIF");
		bldgNames.add("Davidson Library");
		bldgAbbrs.add("LIBRARY");
		bldgNames.add("Engineering Science Building");
		bldgAbbrs.add("ENGRSCI");
		bldgNames.add("Engineering II Building");
		bldgAbbrs.add("ENGR2");
		bldgNames.add("Girvetz Hall");
		bldgAbbrs.add("GIRV");
		bldgNames.add("Harold Frank Hall");
		bldgAbbrs.add("HFH");
		bldgNames.add("Humanities and Social Sciences Building");
		bldgAbbrs.add("HSSB");
		bldgNames.add("Kerr Hall");
		bldgAbbrs.add("KERR");
		bldgNames.add("Lotte-Lehmann Concert Hall");
		bldgAbbrs.add("LLCH");
		bldgNames.add("North Hall");
		bldgAbbrs.add("NORTH");
		bldgNames.add("Phelps Hall");
		bldgAbbrs.add("PHELP");
		bldgNames.add("South Hall");
		bldgAbbrs.add("SOUTH");


		buttonList.add(TheGUI.T387);
		buttonList.add(TheGUI.T429);
		buttonList.add(TheGUI.BRDA);
		buttonList.add(TheGUI.BSIF);
		buttonList.add(TheGUI.LIBRARY);
		buttonList.add(TheGUI.ENGRSCI);
		buttonList.add(TheGUI.ENGR2);
		buttonList.add(TheGUI.GIRV);
		buttonList.add(TheGUI.HFH);
		buttonList.add(TheGUI.HSSB);
		buttonList.add(TheGUI.KERR);
		buttonList.add(TheGUI.LLCH);
		buttonList.add(TheGUI.NORTH);
		buttonList.add(TheGUI.PHELP);
		buttonList.add(TheGUI.SOUTH);

		for(int m = 0; m < buttonList.size(); m++) {
            buttonMap.put(bldgNames.get(m), buttonList.get(m));
            buttonMap.put(bldgAbbrs.get(m), buttonList.get(m));
        }

	}
}