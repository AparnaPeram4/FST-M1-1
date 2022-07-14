package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		try {
			File file = new File("src/test/newfile.txt");
			boolean fStatus = file.createNewFile();
			if(fStatus) {
				System.out.println("File created successfully");
				}
			else {
				System.out.println("File already exist at this path");
			}
			//get the file object
			File fileUtil = FileUtils.getFile("src/test/newfile.txt");
			//Read File
			System.out.println("Data in File : "+FileUtils.readFileToString(fileUtil,"UTF8"));
			
			//Create Directory 
			File destDir = new File("resources");
			//Copy file to directory
			FileUtils.copyDirectory(file, destDir);
			
			//Get file
			File newFile = FileUtils.getFile(destDir,"newfile.txt");
			//Read From file
			String newFileData = FileUtils.readFileToString(newFile,"UTF8");
			
			//Print It
			System.out.println("Data in new file : "+newFileData);
			
		}catch(IOException errMessage) {
			System.out.println(errMessage);
		}
		
	}
}


