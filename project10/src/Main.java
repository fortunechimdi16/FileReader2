import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{ //class header

    public static void main(String[]args) { //method header

        String fileName = "C:\\Users\\fortune\\IdeaProjects\\project10\\src\\TextFile"; //textfile link

        try { //try and catch statements

            checkFilePopulated(fileName);
            System.out.println("Successfully read."); //reads file successful
        } catch (FileNotFoundException e) {
            System.out.println("File not found:" + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println("Empty file exception: " + e.getMessage()); //reads file empty
        }
    }

    //throws in exception for empty file
                public static void checkFilePopulated(String fileName) throws FileNotFoundException,EmptyFileException {

                    File file = new File(fileName);
                    Scanner scanner = new Scanner(file); //instantiating the scanner class

                    if (!scanner.hasNextLine()){
                        

                        throw new EmptyFileException("File is empty.");
                    }

                    scanner.close(); //closes scanner class


                }

                static class EmptyFileException extends Exception{

        public EmptyFileException(String message){super(message);}
                }

        }









