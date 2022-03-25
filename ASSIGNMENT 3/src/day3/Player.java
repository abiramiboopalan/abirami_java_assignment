package day3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Player{

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		// byte
//		try {
//			FileInputStream fr = new 
//					 FileInputStream("/user/Desktop/varshni/images/new2018-11-03-07-24-31-579.pg");
//                   FileOutputStream fw = 
//					new FileOutputStream("/user/Desktop/varshni/images/new32018-11-03-07-24-31-579.pg"));

//			
////			BufferedInputStream fr = new 
////					BufferedInputStream(new FileInputStream("/user/Desktop/varshni/images/new 2018-11-03-07-24-31-579.pg"));

////			BufferedOutputStream fw = new BufferedOutputStream(
////					new FileOutputStream("/user/Desktop/varshni/images/new3 2018-11-03-07-24-31-579.pg"));

//			int i = 0;
//			while ((i = fr.read()) != -1) {
//				fw.write(i);
//			}
//			fw.close();
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		long end = System.currentTimeMillis();
//
//		System.out.println("time taken : " + (end - start) + " ms");
		
//		//char
		try {							
			FileReader fr=new FileReader("/Users/ELCOT/Desktop/Images/Krishna1.jfif");
			FileWriter fw=new FileWriter("/Users/ELCOT/Desktop/Images/Krishna2.jpg");
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
//		
		System.out.println("file is written");
	}
}