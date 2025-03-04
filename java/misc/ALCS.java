package misc;

import java.util.ArrayList;
import java.util.List;

public class ALCS {


     
	public static String findLCS(String s1, String s2) {
		
		int[][] letters = new int[s1.length()][s2.length()];
		
		int x = 0, y = 0, max = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++)
			{
				letters[i][j] += (s1.charAt(i)==s2.charAt(j)) ? 1 : 0;
				
//				if (i-1 >= 0) {
//					if (j-1 >= 0) {
//						if (letters[i-1][j-1] > 0)
//							letters[i][j] += letters[i-1][j-1];
//					}
//					else if (letters[i-1][j] > 0)
//						letters[i][j] = letters[i-1][j];
//				}
//				else if (j-1 >= 0)
//					if (letters[i][j-1] > 0)
//						letters[i][j] = letters[i][j-1];
//				
				if (i < s1.length()-1)
				{
					if (j <s2.length()-1)
						letters[i+1][j+1]=letters[i][j];
					letters[i+1][j]=letters[i][j];
				}
				if (j < s2.length()-1)
					letters[i][j+1]=letters[i][j];
				
				if (letters[i][j] > max)
				{
					x = i;
					y = j;
					max++;
				}
				//System.out.print(letters[i][j]+",");
			}
			//System.out.println();
		}
		StringBuilder sb = new StringBuilder();
		while (max > 0 && x > 0 && y > 0)
		{
			if (letters[x-1][y-1] == max-1)
			{
						max--;
						sb.append(s1.charAt(x));
						x--;
						y--;
			}
				
				else if (letters[x-1][y] == max)
					x--;
				else
					y--;
		}
		sb.reverse();
		return sb.toString();
	}
	
	public static List<String> findACLS(String s1, String s2){
		List<String> substrings = new ArrayList<String>();
		for (int i = 0; i < s2.length(); i++) {
			for (int j  = i; j < s2.length(); j++) {
				substrings.add(s2.substring(i, j+1));
			}
		}
		List<String> ALCS = new ArrayList<String>();
		for (String i : substrings)
			ALCS.add(findLCS(s1,i));
		return ALCS;
	}
	
	public static void main(String[] args) {
		String s1 = "whoelrlold";
		String s2 = "hello";
		System.out.println("longest substring: ");
		System.out.println(findLCS(s1,s2));
		System.out.println("longest substrings: ");
		System.out.println(findACLS(s1,s2).toString());
	}
}
