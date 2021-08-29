package day5;

/*
 * Topic: To demonstrate Two dimensional Array creation and printing the values
 * 
 * day:5
 * 
 * @author mani
 */
public class TwoDimArrayDemo {
	/**
	* Main method create the two dimensional array and use two for loop for
	* printing the values
	*
	* @param args
	*/
public static void main (String[] args) {
		String[][] empList = new String[3][];
		empList[0] = new String[] { "Azar", "Akbar", "Alias" };
		empList[1] = new String[] { "Babu", "Baskar", "Berlin" };
		empList[2] = new String[] { "Caterine", "Clark", "Cammy" };

		 System.out.println(empList[0][2]); // Axar

		 System.out.println(empList[2][1]); // Cindrella

		 for (int row = 0; row < empList.length; row++) {
		for (int col = 0; col < empList[row].length; col++) {
		System.out.print(empList[row][col] + " ");
		}
		System.out.println();
		}
		}

	}

