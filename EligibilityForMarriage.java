
public class EligibilityForMarriage {

	public static void main(String[] args) {
		char gender='F';
		int age=19;
		if((gender=='F')&&(age>=18)||(gender=='M')&&(age>=21))
		{
			System.out.println("Eligible for Marriage");
		}
		else
		{
			System.out.println("Not eligible for Marrige");
		}

	}

}
