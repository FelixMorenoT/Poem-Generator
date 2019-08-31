package logicPackage;

import java.util.List;

public class LogicPoemGenerator {
	
	public static int GetRandomNumber(int indexMin, int indexMax) {
		return (int) ((Math.random() * ((indexMax- indexMin) + 1)) + indexMin);
	}
	
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
