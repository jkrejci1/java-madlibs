/* 
Jack Krejci 
Madlibs Program
*/ 

import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.util.ArrayList;

public class KrejciMadlibs {


    //Functions


    /** This function prints the user menu
     * 
     */
    public static void PrintUserMenu() {
        System.out.println("\nThis program generates random stories using wordlists you supply. It starts from a base story that contains place-holders, which appear in <angle brackets>. The allowed placeholders are singnoun, plunoun, singverb, pluverb, pastverb, adj, and adv. The base stories come from files named story#.txt, where # would be replaced by 1, 2, etc. Substituting for the placeholders would be words that come from wordlists. The wordlists must be named noun.txt (for singular nouns), nouns.txt (for plural nouns), verb.txt (for singular verbs), verbs.txt (for plural verbs), verbed.txt (for past-tense verbs), adj.txt (for adjectives) and adv.txt (for adverbs). All these files - the story files and the word lists, must be located in the same folder. You will begin by selecting a story number, and then I'll take it from there, generating a random story for you to enjoy.");

    } 

    /** This function takes the user's choice and returns what is needed
     * 
     * userChoice: The choice the user made when given the information
     * @return 
     */
    public static String GetStory(String choice) {

        //Declare the string for the filename
        String fname;

        //Return the file name to get the story for the user if it exists
        //If the user types in 1 return story 1
        if (choice.equalsIgnoreCase("1")) {
            fname = "C:\\Users\\Jack\\OneDrive\\Documents\\ObjectProgramming\\Homework 3 Madlibs\\story1.txt";
            return fname;
        }

        //If the user types in 2 return story 2
        if (choice.equalsIgnoreCase("2")) {
            fname = "C:\\Users\\Jack\\OneDrive\\Documents\\ObjectProgramming\\Homework 3 Madlibs\\story2.txt";
            return fname;
        }

        //If the user types in q have the program quit
        if (choice.equalsIgnoreCase("q")) {
            return "q";
        }

        //Return choice if none of these are selected which could trigure reprinting instructions or an error
        return choice;
    }

    /** 
     * Function to bring the adjectives into adjective list
     * @param adjList: Adjective List
     */
    public static void GetAdj(ArrayList<String> adjList) {
        //Initialize variables for the line and the path to get to adjectives
        String line;
        String adjFile = "C:\\Users\\Jack\\OneDrive\\Documents\\ObjectProgramming\\Homework 3 Madlibs\\adj.txt";

        try {
            Scanner fsc = new Scanner(new File(adjFile));
            while (fsc.hasNextLine()) {
                line = fsc.nextLine();
                adjList.add(line);
            }
            fsc.close();
        } catch(Exception ex) {
            System.out.println("Error occured.");
        }

    }

        /**
         * Function to bring the adverbs into abverb list
         * @param advList Adverb List
         */
        public static void GetAdv(ArrayList<String> advList) {
            //Initialize variables for the line and the path to get to adjectives
            String line;
            String advFile = "C:\\Users\\Jack\\OneDrive\\Documents\\ObjectProgramming\\Homework 3 Madlibs\\adv.txt";
    
            try {
                Scanner fsc = new Scanner(new File(advFile));
                while (fsc.hasNextLine()) {
                    line = fsc.nextLine();
                    advList.add(line);
                }
                fsc.close();
            } catch(Exception ex) {
                System.out.println("Error occured.");
            }
    
        }

        /** 
         * Function to bring the singular noun words into singular noun list
         * @param nounList: Singular Noun List
         */
        public static void GetNoun(ArrayList<String> nounList) {
            //Initialize variables for the line and the path to get to adjectives
            String line;
            String nounFile = "C:\\Users\\Jack\\OneDrive\\Documents\\ObjectProgramming\\Homework 3 Madlibs\\noun.txt";
    
            try {
                Scanner fsc = new Scanner(new File(nounFile));
                while (fsc.hasNextLine()) {
                    line = fsc.nextLine();
                    nounList.add(line);
                }
                fsc.close();
            } catch(Exception ex) {
                System.out.println("Error occured.");
            }
    
        }

        /**
         * Function to bring the plural noun words into plural noun list
         * @param pluralNounsList: Plural Noun List
         */
        public static void GetPluralNoun(ArrayList<String> pluralNounsList) {
            //Initialize variables for the line and the path to get to adjectives
            String line;
            String pluralNounsFile = "C:\\Users\\Jack\\OneDrive\\Documents\\ObjectProgramming\\Homework 3 Madlibs\\nouns.txt";
    
            try {
                Scanner fsc = new Scanner(new File(pluralNounsFile));
                while (fsc.hasNextLine()) {
                    line = fsc.nextLine();
                    pluralNounsList.add(line);
                }
                fsc.close();
            } catch(Exception ex) {
                System.out.println("Error occured.");
            }
    
        }

        /**
         * Function to bring the singular verb words into singular verb list
         * @param verbList: Verb List
         */
        public static void GetVerb(ArrayList<String> verbList) {
            //Initialize variables for the line and the path to get to adjectives
            String line;
            String verbFile = "C:\\Users\\Jack\\OneDrive\\Documents\\ObjectProgramming\\Homework 3 Madlibs\\verb.txt";
    
            try {
                Scanner fsc = new Scanner(new File(verbFile));
                while (fsc.hasNextLine()) {
                    line = fsc.nextLine();
                    verbList.add(line);
                }
                fsc.close();
            } catch(Exception ex) {
                System.out.println("Error occured.");
            }
    
        }
      
        /**
         * Function to bring the past tense verb words into past tense verb list
         * @param PTverbList: Past Tense Verb List
         */
        public static void GetPTVerb(ArrayList<String> PTverbList) {
            //Initialize variables for the line and the path to get to adjectives
            String line;
            String PTverbFile = "C:\\Users\\Jack\\OneDrive\\Documents\\ObjectProgramming\\Homework 3 Madlibs\\verbed.txt";
    
            try {
                Scanner fsc = new Scanner(new File(PTverbFile));
                while (fsc.hasNextLine()) {
                    line = fsc.nextLine();
                    PTverbList.add(line);
                }
                fsc.close();
            } catch(Exception ex) {
                System.out.println("Error occured.");
            }
    
        }
      
        /**
         * Function to bring the plural verbs into plural verbs list
         * @param pluralVerbsList: Plural verbs list
         */
        public static void GetPluralVerb(ArrayList<String> pluralVerbsList) {
            //Initialize variables for the line and the path to get to adjectives
            String line;
            String pluralVerbFile = "C:\\Users\\Jack\\OneDrive\\Documents\\ObjectProgramming\\Homework 3 Madlibs\\verbs.txt";
    
            try {
                Scanner fsc = new Scanner(new File(pluralVerbFile));
                while (fsc.hasNextLine()) {
                    line = fsc.nextLine();
                    pluralVerbsList.add(line);
                }
                fsc.close();
            } catch(Exception ex) {
                System.out.println("Error occured.");
            }
    
        }
      
        /**
         * Function to take every word read by program to the user switching placeholders with corresponding 
         * type if needed
         * @param words
         * @param randyEl
         * @param adjList
         * @param advList
         * @param nounList
         * @param pluralNounsList
         * @param verbList
         * @param PTverbList
         * @param pluralVerbsList
         */
    public static void ChangeTheWords(String[] words, Random randyEl, ArrayList<String> adjList, ArrayList<String> advList, ArrayList<String> nounList, ArrayList<String> pluralNounsList, ArrayList<String> verbList, ArrayList<String> PTverbList, ArrayList<String> pluralVerbsList) {
        for (String word : words) {
            //Get random number from adjective size to get random word repeat for each different type!
            int randAdj = randyEl.nextInt((adjList).size());
            //Replace <adj> with adjective words
            if (word.equalsIgnoreCase("<adj>" + (","))) {
                String newAdj = adjList.get(randAdj);
                word = newAdj + ",";	
            } else if (word.equalsIgnoreCase("<adj>" + ("."))) {
                String newAdj = adjList.get(randAdj);
                word = newAdj + ".";
            } else if (word.equalsIgnoreCase("<adj>")) {
                String newAdj = adjList.get(randAdj);
                word = newAdj;
            }
            //Replace <adv> with adverb words
            int randAdv = randyEl.nextInt((advList).size());

            if (word.equalsIgnoreCase("<adv>" + ",")) {
                String newAdv = advList.get(randAdv);
                word = newAdv + ",";
            } else if (word.equalsIgnoreCase("<adv>" + ".")) {
                String newAdv = advList.get(randAdv);
                word = newAdv + ".";
            } else if (word.equalsIgnoreCase("<adv>")) {
                String newAdv = advList.get(randAdv);
                word = newAdv;
            }
            //Replace <singnoun> singular with noun singular words
            int rNoun = randyEl.nextInt((nounList).size());

            if (word.equalsIgnoreCase("<singnoun>" + ",")) {
                String newNoun = nounList.get(rNoun);
                word = newNoun + ",";
            } else if (word.equalsIgnoreCase("<singnoun>" + ".")) {
                String newNoun = nounList.get(rNoun);
                word = newNoun + ".";
            } else if (word.equalsIgnoreCase("<singnoun>")) {
                String newNoun = nounList.get(rNoun);
                word = newNoun;
            }
            //Replace <plunoun> with plural noun words
            int randPN = randyEl.nextInt((pluralNounsList).size());
            if (word.equalsIgnoreCase("<plunoun>,")) {
                String newPluNoun = pluralNounsList.get(randPN);
                word = newPluNoun + ",";
            } else if (word.equalsIgnoreCase("<plunoun>" + ".")) {
                String newPluNoun = pluralNounsList.get(randPN);
                word = newPluNoun + ".";
            } else if (word.equalsIgnoreCase("<plunoun>")) {
                String newPluNoun = pluralNounsList.get(randPN);
                word = newPluNoun;
            }
            //Replace <singverb> with singular verb words
            int rV = randyEl.nextInt((verbList).size());

            if (word.equalsIgnoreCase("<singverb>" + ",")) {
                String newVerb = verbList.get(rV);
                word = newVerb + ",";
            } else if (word.equalsIgnoreCase("<singverb>" + ".")) {
                String newVerb = verbList.get(rV);
                word = newVerb + ".";
            } else if (word.equalsIgnoreCase("<singverb>")) {
                String newVerb = verbList.get(rV);
                word = newVerb;
            }
            //Replace <pastverb> with past verb words
            int rPV = randyEl.nextInt((PTverbList).size());

            if (word.equalsIgnoreCase("<pastverb>" + ",")) {
                String newPastVerb = PTverbList.get(rPV);
                word = newPastVerb + ",";
            } else if (word.equalsIgnoreCase("<pastverb>" + ".")) {
                String newPastVerb = PTverbList.get(rPV);
                word = newPastVerb + ".";
            } else if (word.equalsIgnoreCase("<pastverb>")) {
                String newPastVerb = PTverbList.get(rPV);
                word = newPastVerb;
            }

            //Replace <pluverb> with plural verb words
            int rPLV = randyEl.nextInt((pluralNounsList).size());

            if (word.equalsIgnoreCase("<pluverb>" + ",")) {
                String newPluVerb = pluralVerbsList.get(rPLV);
                word = newPluVerb + ",";
            } else if (word.equalsIgnoreCase("<pluverb>" + ".")) {
                String newPluVerb = pluralVerbsList.get(rPLV);
                word = newPluVerb + ".";
            } else if (word.equalsIgnoreCase("<pluverb>")) {
                String newPluVerb = pluralVerbsList.get(rPLV);
                word = newPluVerb;
            }

            System.out.print(word);
            System.out.print(" ");
        }
    }


    //Main Code
    public static void main(String[] args) {
        //Initialize Variables and Input 
		Scanner sc = new Scanner(System.in);
        Random randyEl = new Random();
		String fname, choice;
        String line;

        //Welcome the user
        System.out.println("***************************************************************");
        System.out.println("*                 Welcome to Madlibs V1.0 vv                  *");
        System.out.println("***************************************************************");

        //Show the menu to user for first time
        PrintUserMenu();

        //Load the adjectives list
        ArrayList<String> adjList = new ArrayList<String>();
        GetAdj(adjList);

        //Load the adverbs list
        ArrayList<String> advList = new ArrayList<String>();
        GetAdv(advList);

        //Load the singular noun list
        ArrayList<String> nounList = new ArrayList<String>();
        GetNoun(nounList);

        //Load the plural nouns list
        ArrayList<String> pluralNounsList = new ArrayList<String>();
        GetPluralNoun(pluralNounsList);

        //Load the singular verbs list
        ArrayList<String> verbList = new ArrayList<String>();
        GetVerb(verbList);

        //Load the past tense verbs list
        ArrayList<String> PTverbList = new ArrayList<String>();
        GetPTVerb(PTverbList);

        //Load the plural tense verbs list
        ArrayList<String> pluralVerbsList = new ArrayList<String>();
        GetPluralVerb(pluralVerbsList);

        //Get the story from the user they want to use
         do {
                //Get the story the user wants and repeat for next madlib and correct them if they're wrong
                System.out.print("\nEnter a story number, i to see instructions, or q to quit: ");
                choice = sc.nextLine();
                fname = GetStory(choice);

                //Account for if the user wants to read the directions again any time they want
            while (choice.equalsIgnoreCase("i")) {
                System.out.println("\nHere are the instructions again.");
                PrintUserMenu();
                choice = "";
                System.out.print("\nEnter a story number, i to see instructions, or q to quit: ");
                choice = sc.nextLine();
                fname = GetStory(choice);
                }

            //Attempt to get file and read it in or quit or repeat instructions
            while (!(choice.equalsIgnoreCase("q"))) {
                try {
                    Scanner fsc = new Scanner(new File(fname));
                    System.out.println("\nHere is your Madlib!\n");
                    while (fsc.hasNextLine()) {
                        line = fsc.nextLine();
                       // System.out.println(line);
                        //Split the words
                        String[] words = line.split(" ");
                        ChangeTheWords(words, randyEl, adjList, advList, nounList, pluralNounsList, verbList, PTverbList, pluralVerbsList);
         
                    }
                    //Close the file when done reading it and end the loop
                    fsc.close();
                    break;
                } catch(Exception ex) {
                    System.out.println("\nThat story does not exist. Choose again.");
                    break;
                }
            } System.out.print("\n"); //Format the Output nicely after a madlib is created


         } while (!(choice.equalsIgnoreCase("q")));

        //Say your goodbyes when user quits
         System.out.println("\nThank you for using this program.");
    }
}

