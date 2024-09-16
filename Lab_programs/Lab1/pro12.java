//Write a Java program that uses a simple function to s
//search the word “Web” in the string “Programming the World Wide Web”
public class pro12 {
    public static void main(String[] args) {
        String text = "Programming the World Wide Web";
        String word = "Web";
        boolean found = text.contains(word);
        if (found) {
            System.out.println("The word \"" + word + "\" was found in the text.");
        } else {
            System.out.println("The word \"" + word + "\" was not found in the text.");
        }
    }
}

