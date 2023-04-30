package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {
    public static void main(String[] args) throws ParseException {

        // creating a custom date format 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // instantiating the class 'comment' and 'post' - hard code
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(
            sdf.parse("23/04/2023 20:56:17"), 
            "Travel to new zealand", 
            "I'm going to visit this wonderful country!", 
            12);

        // adding comments to the 'post'
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
    
}
