# Poem-Generator
>Random Poem-Generator based on grammatical rules.

## Usage

The Program after the execution generate a random poem based on the Grammatical Rules. See Rules Here:
```Adjective:black|white|dark|light|bright|murky|muddy|clear
Noun:heart|sun|moon|thunder|fire|time|wind|sea|river|flavor|wave|willow|rain|tree|flower|field|meadow|pasture|harvest|water|father|mother|brother|sister
Preposition:above|across|against|along|among|around|before|behind|beneath|beside|between|beyond|during|inside|onto|outside|under|underneath|upon|with|without|through
Pronoun:my|your|his|her
Verb:runs|walks|stands|climbs|crawls|flows|flies|transcends|ascends|descends|sinks
CLine:<NOUN>|<PREPOSITION>|<PRONOUN>
CNoun:<VERB>|<PREPOSITION>|$END
CPronoun:<NOUN>|<ADJECTIVE>
CVerb:<PREPOSITION>|<PRONOUN>|$END
CPreposition:<NOUN>|<PRONOUN>|<ADJECTIVE>
CAdjective:<NOUN>|<ADJECTIVE>|$END


after that you will receive a poem generated by those rules

```Line 1 -> wave 
Line 2 -> heart through time across dark 
Line 3 -> before his river across your father descends 
Line 4 -> my light dark sea 
Line 5 -> his willow outside black 
