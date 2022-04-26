import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> colorCol = new ArrayList<String>();
		ArrayList<String> colorCopy = new ArrayList<String>();
		colorCol.add("Blue");
		colorCol.add("Red");
		colorCol.add("Yellow");
		colorCol.add("Opal");
		colorCol.add("Green");
		colorCol.add("Violet");
		colorCol.add("Pink");
		for(int i = 0; i < colorCol.size(); i++) {
			System.out.println(colorCol.get(i));
		}
	}
}
