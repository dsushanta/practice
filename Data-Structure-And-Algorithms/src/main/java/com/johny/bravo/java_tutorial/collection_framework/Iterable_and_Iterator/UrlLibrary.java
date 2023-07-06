package com.johny.bravo.java_tutorial.collection_framework.Iterable_and_Iterator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UrlLibrary implements Iterable<String>{
	// To use the for-each loop in the objects of this class, this class must implement Iterable interface
	// and implement one un-implemented method called 'iterator()'
	private List<String> urls = new LinkedList<String>();
	
	private class UrlIterator implements Iterator<String> {
		private int index =0;
		
		@Override
		public boolean hasNext() {
			return (index < urls.size());
		}
		
		// A bit complex but similar implementation
		@Override
		public String next() {
			StringBuilder sb = new StringBuilder();
			try {
				URL url = new URL(urls.get(index));
				
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				String line = null;
				
				while((line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n"); 
				}
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			index++;
			return sb.toString();
		}

		/*@Override
		public String next() {
			//index++;
			return urls.get(index++);
		}*/
		
	}
	
	public UrlLibrary() {
		urls.add("http://www.google.co.in");
		urls.add("https://www.facebook.com");
		urls.add("https://www.twitter.com");
	}

	
	// this uses my own iterator 
	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}

	
	// this simply uses the iterator method of LinkedList class
	/*@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}*/
}
