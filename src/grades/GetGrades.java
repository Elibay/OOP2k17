package grades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GetGrades {
	private String[] fullNames = new String[500];
	private int[] grades = new int[500];
	private int sz = 0;
	private int maxGrade = 0, minGrade = Integer.MAX_VALUE, averageGrade = 0;
	
	void getMarks () throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/elibay/Desktop/scores.txt"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = "";
		    while (true) {
		        line = br.readLine();
		        if (line == null)
		        	break;
		        String[] res = line.split(" ");
		        fullNames[sz] = res[0] + " " + res[1];
		        grades[sz] = Integer.parseInt(res[2]);
		        maxGrade = Math.max(maxGrade, grades[sz]);
		        minGrade = Math.min(minGrade, grades[sz]);
		        averageGrade += grades[sz];
		        ++ sz;
		    }
		} finally {
		    br.close();
		}
	}
	String getMark (int x) {
		if (x >= maxGrade - 10)
			return "A";
		if (x >= maxGrade - 20)
			return "B";
		if (x >= maxGrade - 30)
			return "C";
		if (x >= maxGrade - 40)
			return "D";
		return "F";
	}
	void putMarks () throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/elibay/Desktop/grades.txt")));
		for (int i = 0; i < sz; ++ i) {
			out.println(fullNames[i] + " - " + "'" + getMark(grades[i]) + "'");	
		}
		out.println();
		out.println("Average " + averageGrade / sz);
		out.println("Max " + maxGrade);
		out.println("Min " + minGrade);
		out.close();
	}
}
