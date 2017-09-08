package Intuit1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurencesOfWord {

	public static void main(String[] args) throws FileNotFoundException {
		
		String filename = args[0];
		Scanner input = new Scanner(new File(filename));
		String find ="intuit";
		Map<String,Integer> map = new HashMap<>();
		while(input.hasNext()){
			String s = input.next().toLowerCase();
			if(map.containsKey(s)){
				int n = map.get(s);
				map.put(s,n+1);
			}else{
				map.put(s, 1);
			}
		}
		System.out.println(map.get(find));
		input.close();
	}
}
