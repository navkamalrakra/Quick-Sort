import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile{

	protected int[] array;
	List<Integer> rawIntegers = null;

	public void getFile() throws NumberFormatException, IOException{
		String line;
		this.rawIntegers = new ArrayList<Integer>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\navkamal\\Desktop\\QuickSort.txt"));
			while ((line = in.readLine()) != null) {
				this.rawIntegers.add(Integer.parseInt(line));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void setUnsortedArray() {
		this.array = new int[this.rawIntegers.size()];
		int i=0;
		for(Integer x:this.rawIntegers){
			array[i++] = x;
		}
	}	
}
