package gate.objective;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Data {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("data.csv");
			BufferedReader buff = new BufferedReader(file);
			String text;
			ArrayList<String[]> tempList = new ArrayList<String[]>();
			while((text = buff.readLine()) != null) {
				String data[] = text.split(",");
				tempList.add(data);
			}
			file.close();
			TemperatureComparator tc = new TemperatureComparator();
			Collections.sort(tempList, tc);
			for (String data[] : tempList) {
				System.out.println(data[1]+","+data[2]+","+data[3]+","+data[0]);
			}
		} catch (FileNotFoundException fnoe) {
			fnoe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
