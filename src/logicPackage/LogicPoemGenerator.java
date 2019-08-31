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
	* @param2 The list with all rules related with the grammatical rule in @Param1.
	* @return The next rule based on @Param1.
	*/
	public static String GetPoemRule(String rulePoem, List<String> listConfigRule) {
		String rule ="";
		
			switch(rulePoem) {
				case "<NOUN>":
					rule = listConfigRule.get(LogicPoemGenerator.GetRandomNumber(0, listConfigRule.size()-1));
					break;
				case "<PREPOSITION>":
					rule = listConfigRule.get(LogicPoemGenerator.GetRandomNumber(0, listConfigRule.size()-1));
					break;
				case "<PRONOUN>":
					rule = listConfigRule.get(LogicPoemGenerator.GetRandomNumber(0, listConfigRule.size()-1));
					break;
				case "<VERB>":
					rule = listConfigRule.get(LogicPoemGenerator.GetRandomNumber(0, listConfigRule.size()-1));
					break;
				case "<ADJECTIVE>":
					rule = listConfigRule.get(LogicPoemGenerator.GetRandomNumber(0, listConfigRule.size()-1));
					break;
		}
		return rule;
	}
}
