### Displaying a Square of Any Character

Modify the method created in Exercise 6.18 to receive a second parameter of type **char** called **fillCharacter**. 
Form the square using the **char** provided as an argument. Thus, if **side** is **5** and **fillCharacter** is #, the method should display

    #####
    #####
    #####
    #####
    #####

Use the following statement (in which **input** is a **Scanner** object) to read a character from the user
at the keyboard:

**_// next() returns a String and charAt(0) gets the String's first character\
char fill = input.next().charAt(0);_**