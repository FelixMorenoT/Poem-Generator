package mainPackage;

import java.util.ArrayList;
import java.util.List;

import logicPackage.LogicPoemGenerator;
import logicPackage.UploadPoemProperties;
/**
* This the Main Class to handle all the project.
* 
* @author Felix Rafael Moreno Tabares
* @version V1.0.0
* Git - https://github.com/FelixMorenoT
* 
*/

public class MainPoemGenerator {
	/**
	 * Public Variable assign to Save all the Adjectives for the poem.
	 */
	public static List<String> listAdjective = new ArrayList<String>();
	
	/**
	 * Public Variable assign to Save all the Nouns for the poem.
	 */
	public static List<String> listNoun = new ArrayList<String>();
	
	/**
	 * Public Variable assign to Save all the Prepositions for the poem.
	 */
	public static List<String> listPreposition = new ArrayList<String>();
	
	/**
	 * Public Variable assign to Save all the Pronouns for the poem.
	 */
	public static List<String> listPronoun = new ArrayList<String>();
	
	/**
	 * Public Variable assign to Save all the Verbs for the poem.
	 */
	public static List<String> listVerb = new ArrayList<String>();
	
	/**
	 * Public Variable assign to Save all line configuration.
	 */
	public static List<String> listConfigLine = new ArrayList<String>();
	
	/**
	 * Public Variable assign to Save all adjectives configuration.
	 */
	public static List<String> listConfigAdjective = new ArrayList<String>();
	
	/**
	 * Public Variable assign to Save all nouns configuration.
	 */
	public static List<String> listConfigNoun = new ArrayList<String>();
	
	/**
	 * Public Variable assign to Save all prepositions configuration.
	 */
	public static List<String> listConfigPreposition = new ArrayList<String>();
	
	/**
	 * Public Variable assign to Save all pronouns configuration.
	 */
	public static List<String> listConfigPronoun = new ArrayList<String>();
	
	/**
	 * Public Variable assign to Save all verbs configuration.
	 */
	public static List<String> listConfigVerb = new ArrayList<String>();
	
	/**
	 *  Public Variable assign to contains all the method of the UploadPoemProperties class.
	 */
	public static UploadPoemProperties uploadPoemProperties = new UploadPoemProperties();
	
	/**
	 *  Public Variable assign to contains all the method of the LogicPoemGenerator class.
	 */
	public static LogicPoemGenerator logicPoemGenerator = new LogicPoemGenerator();
	
	/**
	 * Public Variable assign to contains the grammatical rule.
	 */
	public static String lineExit = "";
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		String stringLine = "";
		String lineIndicator = "";
		
			listAdjective = uploadPoemProperties.ReadProperties(("..\\Poem Generator\\Datos\\GrammaticalRules.txt"),"Adjective");
			listNoun = uploadPoemProperties.ReadProperties(("..\\Poem Generator\\Datos\\GrammaticalRules.txt"),"Noun");
			listPreposition = uploadPoemProperties.ReadProperties(("..\\Poem Generator\\Datos\\GrammaticalRules.txt"),"Preposition");
			listPronoun = uploadPoemProperties.ReadProperties(("..\\Poem Generator\\Datos\\GrammaticalRules.txt"),"Pronoun");
			listVerb = uploadPoemProperties.ReadProperties(("..\\Poem Generator\\Datos\\GrammaticalRules.txt"),"Verb");
			
			listConfigLine = uploadPoemProperties.ReadProperties("..\\\\Poem Generator\\\\Datos\\\\GrammaticalRules.txt","CLine");
			listConfigAdjective = uploadPoemProperties.ReadProperties("..\\\\Poem Generator\\\\Datos\\\\GrammaticalRules.txt","CAdjective");
			listConfigNoun = uploadPoemProperties.ReadProperties("..\\\\Poem Generator\\\\Datos\\\\GrammaticalRules.txt","CNoun");
			listConfigPreposition = uploadPoemProperties.ReadProperties("..\\\\Poem Generator\\\\Datos\\\\GrammaticalRules.txt","CPreposition");
			listConfigPronoun = uploadPoemProperties.ReadProperties("..\\\\Poem Generator\\\\Datos\\\\GrammaticalRules.txt","CPronoun");
			listConfigVerb = uploadPoemProperties.ReadProperties("..\\\\Poem Generator\\\\Datos\\\\GrammaticalRules.txt","CVerb");
		 				
		for (int i = 0; i <5; i++) {
			stringLine="";
			lineIndicator = listConfigLine.get(LogicPoemGenerator.GetRandomNumber(0, listConfigLine.size()-1));
			lineExit = lineIndicator;
			
			while(!lineExit.equals("$END")) {
				switch (lineExit) {
					case "<NOUN>":
						stringLine +=  listNoun.get(logicPoemGenerator.GetRandomNumber(0, listNoun.size()-1)) + " ";
						lineExit = LogicPoemGenerator.GetPoemRule(listConfigNoun);
						break;
						
					case "<PREPOSITION>":
						stringLine +=  listPreposition.get(logicPoemGenerator.GetRandomNumber(0, listPreposition.size()-1)) + " ";
						lineExit = LogicPoemGenerator.GetPoemRule(listConfigPreposition);
						break;
						
					case "<PRONOUN>":
						stringLine +=  listPronoun.get(logicPoemGenerator.GetRandomNumber(0, listPronoun.size()-1)) + " ";
						lineExit = LogicPoemGenerator.GetPoemRule(listConfigPronoun);
						break;
						
					case "<VERB>":
						stringLine +=  listVerb.get(logicPoemGenerator.GetRandomNumber(0, listVerb.size()-1)) + " ";
						lineExit = LogicPoemGenerator.GetPoemRule(listConfigVerb);
						break;
						
					case "<ADJECTIVE>":	
						stringLine +=  listAdjective.get(logicPoemGenerator.GetRandomNumber(0, listAdjective.size()-1)) + " ";
						lineExit = LogicPoemGenerator.GetPoemRule(listConfigAdjective);
						break;	
				}
				
			}
			System.out.println("Line " + (i+1) +" -> " + stringLine);
		}
	}
}
