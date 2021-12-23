package differentDataType;

import java.util.ArrayList;
import java.util.List;

public class ArrayLearning {

	public static void main(String[] args) {

		String name = "anyName";
		
		String[] name2 = new String[2];
		String[] names = {"anyName", "noName"};
		
		
//		List <String> list1= new ArrayList();
//		
//		list1.re
		
		
		
		int[] a = { 10, 20, 54 };

		double[] b = {100.55, 1550.021};

		

		String[] name3 = new String[10];

		name2[0] = "sanaa";
		name2[1] = "Taher";
		name2[2] = "sanaa";
		name2[3] = "Taher";
		name2[4] = "sanaa";
		name2[5] = "Taher";
		name2[6] = "sanaa";
		name2[7] = "Taher";
		name2[8] = "Taher";
		name2[9] = "Taher";

//		System.out.println(name2[9]);
		String[] name4 = { "sanaa", "Taher", "yasmin", "Abdulla", "kamal", "Tilova" };
		boolean isName = true;
		
		for(int i = 0; i<=5; i++) {
			if(name4[i]=="Abdulla") {
				isName = true;
				break;
			}else
			isName = false;
		}
		
		if(isName == true) {
			System.out.println("Name is there");
		}else {
			System.out.println("Name is not there");
		}

	}

}
