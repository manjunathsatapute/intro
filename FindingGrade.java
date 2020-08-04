
public class FindingGrade {

	public static void main(String[] args) {

		char grade = 'A';
		String result = null;

		System.out.println("The input grade is : " + grade);

		switch (grade) {

		case 'A':
			result = " between 85 to 100";
			break;
		case 'B':
			result = "between 60 to 84";
			break;
		case 'C':
			result = "between 35 to 59";
			break;
		default:
			result = "You failed";
			break;
		}
		System.out.println("Your marks is " + result);

	}

}
