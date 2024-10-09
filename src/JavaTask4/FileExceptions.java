package JavaTask4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExceptions {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String[] args) {

        try (Scanner sc = new Scanner(new File("D:\\EclipseWorkspaces\\SelfPractice\\JAT_GuviTask_Java\\nonexistent2.txt"))) 
        {
            String readContent = sc.useDelimiter("\\Z").next();
            System.out.println(readContent);
        } 
        catch (FileNotFoundException e) 
        {
        	// actual exception
        			e.printStackTrace();
        	// customize exception message
        			System.out.println("The file is not found");
        }
	}
}