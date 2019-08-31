package logicPackage;

import java.util.List;

/**
* This the Main Class to handle all the project.
* 
* @author Felix Rafael Moreno Tabares
* @version V1.0.0
* Git - https://github.com/FelixMorenoT
* 
*/

public class LogicPoemGenerator {
	
	/**
	* This method is responsible to obtain a random number between Min Index and Max Index.
	* @param1 Min Index (Ex:0).
	* @param2 Max Index (Ex:3).
	* @return A number between the indicate range.
	*/
	public static int GetRandomNumber(int indexMin, int indexMax) {
		return (int) ((Math.random() * ((indexMax- indexMin) + 1)) + indexMin);
	}
	
	/**
	* This method is responsible to obtain the next rule to apply on the poem based on the grammatical rule.
	* @param1 Grammatical rule.
	* @return The next rule based on @Param1.
	*/
	public static String GetPoemRule(List<String> listConfigRule) {
		return listConfigRule.get(LogicPoemGenerator.GetRandomNumber(0, listConfigRule.size()-1));
	}
}
