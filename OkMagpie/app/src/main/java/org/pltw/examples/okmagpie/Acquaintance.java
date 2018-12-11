package org.pltw.examples.okmagpie;

public class Acquaintance {
    private String name;
    private String relation;
    private String description;
    private int age;

    private String curHandling = "";

    public void Aquaintance(String name) {
        /** Constructor
         * @arg String name : The name of the acquaintance
         */
        this.name = name;
        this.relation = "";
        this.description = "";
        this.age = 0;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getRelation() {
        return this.relation;
    }

    public String getDescription() {
        return this.description;
    }


    /**
     * Decides what to respond if this acquaintance was mentioned
     * @arg String statement: the statement the user entered
     */
    public String handleMentioned(String statement) {

        //Handles what to do if the person was mentioned
        String result = "";
        statement = statement.trim();
        statement = statement.toLowerCase();

        if (!curHandling.equals("")) {
            //Executes if curHandling isn't empty
            if (curHandling.equals("relation")) {
                if(statement.equals("no")) {
                    //If what we thought was wrong
                    result = "who is " + this.name + " then?";
                }
            }

            else if(curHandling.equals("age")) {

            }

            else if(curHandling.equals("description")) {

            }
        }
        else {
            //Splits the statement into a list of words
            String[] words = statement.split(" ");
            if (this.relation.equals("")) { //If relation is undefined
                if (statement.contains("is my")) {
                    for (int i = 0; i < words.length; i++) {
                        String s = words[i];
                        if (s.equals("is") && words[i + 1].equals("my")) {
                            //Set the relation to the word after "is my"
                            this.relation = words[i + 2];
                            result = this.name + " is your " + this.relation + "?";
                            break;
                        }
                    }
                }
                else {
                    //Ask about relationship if it wasn't mentioned
                    result = "What's your relationship with " + this.name + "?";
                }
                this.curHandling = "relation";
            }

             else if(this.age == 0) { //If age is undefined
                if(statement.contains(this.name) && statement.contains("old")) {
                    //Presumably the user said "x is y years or months or whatever old"
                    for (int i=0; i < words.length; i++) {
                        String s = words[i];
                        if(s.equals(this.name) && words[i + 1].equals("is")
                                && (words[i + 3].equals("old") || words[i + 3].equals("years"))) {
                            //If the statement reads "x is y old" or "x is y years"

                            try {
                                this.age = Integer.parseInt(words[i + 2]);
                                result = this.name + " is " + this.age + " years old?";
                                break;
                            }
                            catch (Exception e) {
                                result = "I don't understand, please tell me how old " + this.name + " is.";
                                break;
                            }
                        }
                    }
                }
                else {
                    //Ask about age if it wasn't mentioned
                    result = "How old is " + this.name + "?";
                }
                this.curHandling = "age";
            }

            else if(this.description.equals("")) { //If description is undefined
                //This will be entirely handled after the question is asked
                result = "What does " + this.name + " look like?";
                this.curHandling = "description";
            }
        }
        return result;
    }
}