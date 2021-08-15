package pkg1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

public class GoogleSearchApp {

	public static void main(String[] args) throws IOException {

		// get the keyword
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the keyword in console");
		//String keyword = scan.nextLine();
		System.out.println("Intializer GoogleSearchApp");
		String keyword = "Angular";

		// Search over your preferred search engine
		String url = "https://www.google.com/search" + "?q=" + keyword;

		Document doc = Jsoup.connect(url).get();

		String html = doc.html();

		Files.write(Paths.get("C:\\Users\\ADITYA GUPTA\\Desktop\\file.html"), html.getBytes());

		Elements links = doc.select("cite");

		// System.out.println("links" + links);
		
		//Using HashSet For Unique Links 
		HashSet<String> hs = new HashSet<String>();
		for (Element link : links) {

			String text = link.text();
			if (text.contains("›")) {
				text = text.replaceAll(" › ", "/");
			}
			//System.out.println(text);
			hs.add(text);
			
		}
		
		//Iterating over HashSet for Unique Links
		System.out.println("------------Unique Links-------------");
		for(String tempLink : hs)
			System.out.println(tempLink);

		//Opening unique links in new tabs
		for(String tempLink : hs)
		{
			LoadWebBrowserInstance r1 = new LoadWebBrowserInstance(tempLink);
			Thread t1 = new Thread(r1);
			t1.start();
		}
		
		scan.close();

	}

}
