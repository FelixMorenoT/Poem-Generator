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
	public List<String> ReadProperties(String route, String rowName, int sizeRow) {
		contentBuilder.setLength(0);
		contentBuilderList = new ArrayList<String>();
		
		String propiertyText = "";
		String [] arrayAux;
		try {
			fileReader = new FileReader(route);
			bufferedReader = new BufferedReader(fileReader);
			
            while((propiertyText = ( bufferedReader).readLine()) != null) {
            	  if  (propiertyText.startsWith(rowName) == true) {
            		  contentBuilder.append(propiertyText);
            	  }
            }  
            bufferedReader.close();
            
            propiertyText = contentBuilder.toString();
            arrayAux = propiertyText.split(":");
            
            switch(rowName) {
            case "POEM":
            	if  (arrayAux[sizeRow].contains(" ") == true) arrayAux[sizeRow] = arrayAux[sizeRow].replace(" ", ",");
            	arrayAux = arrayAux[sizeRow].toString().split(",");
            	break;
            case "LINE":
            	if  (arrayAux[sizeRow].contains(" ") == true) arrayAux[sizeRow] = arrayAux[sizeRow].replace(" ", "%");
            	if  (arrayAux[sizeRow].contains("|") == true) arrayAux[sizeRow] = arrayAux[sizeRow].replace("|", ",");
            	arrayAux = arrayAux[sizeRow].toString().split("%");
            	arrayAux = arrayAux[sizeRow].toString().split(",");
            	break;
            default:
            	if  (arrayAux[1].contains(" ") == true) arrayAux[1] = arrayAux[1].replace(" ", "%");
            	arrayAux = arrayAux[1].toString().split("%");
            	
            	if (sizeRow==0) {
            		if  (arrayAux[sizeRow+1].contains("|") == true) arrayAux[sizeRow+1] = arrayAux[sizeRow+1].replace("|", ",");
            		arrayAux = arrayAux[sizeRow+1].toString().split(",");
            		break;
            	}else {
            		if  (arrayAux[sizeRow+1].contains("|") == true) arrayAux[sizeRow+1] = arrayAux[sizeRow+1].replace("|", ",");
            		arrayAux = arrayAux[sizeRow+1].toString().split(",");
            		break;
            	}
            }

            for (String string : arrayAux) {
            	if (!string.equals(""))contentBuilderList.add(string.trim());
			}

            return contentBuilderList;
		} catch (Exception e) {
			contentBuilderList.add(e.toString());
			return contentBuilderList;
		}
	}
}
