package logicPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
* This the Main Class to handle all the project.
* 
* @author Felix Rafael Moreno Tabares
* @version V1.0.0
* Git - https://github.com/FelixMorenoT
* 
*/

public class UploadPoemProperties {
	public FileReader fileReader ;
	public BufferedReader bufferedReader;
	public StringBuilder contentBuilder = new StringBuilder();
	public List<String> contentBuilderList;
	
	/**
	* This method is responsible for get the initial data.
	* @param1 Route of the file that we want to upload into the system.
	* @return Data that is inside of the configuration file.
	* @exception This method thorw an exception when the route doesn't exist.
	*/
	@SuppressWarnings("null")
	public List<String> ReadProperties (String route) {
		contentBuilder.setLength(0);
		contentBuilderList = new ArrayList<String>();
		
		String propiertyText = "";
		String [] arrayAux;
		try {
			fileReader = new FileReader(route);
			bufferedReader = new BufferedReader(fileReader);
			
            while((propiertyText = bufferedReader.readLine()) != null) {
            	contentBuilder.append(propiertyText);
            }  
            bufferedReader.close();
            
            propiertyText = contentBuilder.toString();
            
            if  (propiertyText.contains("|") == true) {
            	propiertyText = propiertyText.replace("|", ",");
            }
            
            
            arrayAux = propiertyText.split(",");
            
            for (String string : arrayAux) {
            	contentBuilderList.add(string);
			}
            
            return contentBuilderList;
		} catch (Exception e) {
			contentBuilderList.add(e.toString());
			return contentBuilderList;
		}
	}
}
