package thegui;

import java.io.IOException;


/**
 *
 * @author Aki Stankoski and Dennis Huynh
 */
public class Run{
    public static void main(String[] args) throws IOException {
	TheGUI a = new TheGUI();
	a.setUpHomeScreen();//creates a new GUI named a and sets up the home screen that contains the buttons of all the locations with available directions
    }
}
