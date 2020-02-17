public class license{
	// This class assumes letters and digits cannot be replaced on a given
	//license plate. 

	//The following code emulates factorials which can be used to calculate the total amount of license plate combinations
	int total_possibilities1 = 1;
	int total_possibilities2 = 1;

	public int plategen(int places){

		int lcombinations = lettercombo(places/2);
		int ncombinations = numcombo(places/2);
		int totalplates = ncombinations*lcombinations;
		
		return totalplates;
	}

	public int lettercombo(int numletters){
		
		for(int i=26; i>26-numletters;i--){
			total_possibilities1 = total_possibilities1*i;

		}

		return total_possibilities1;
	}

	public int numcombo(int numdigits){
		
		for(int i=10; i>10-numdigits;i--){
			total_possibilities2 = total_possibilities2*i;

		}

		return total_possibilities2;

	}
}