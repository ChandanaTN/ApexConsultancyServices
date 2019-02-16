package com.apex.assignment1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class ACount {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Home\\Desktop\\chandana_temp.txt");
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(file));
			int count=0;
			String line=null;
			while((line=br.readLine())!=null)
			{
				Pattern p=Pattern.compile("[aA]");
				Matcher m= p.matcher(line.trim());
				while(m.find())
					{
						count++;
					}
			}
			br.close();
			System.out.println("The number of a's in the input file is: "+count);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		}

	}
