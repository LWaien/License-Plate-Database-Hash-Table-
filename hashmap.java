import java.util.Arrays;
import java.util.Scanner; 


class Hashmap{
	String[] _Array;
	int ArraySize;
	String plate;


	public static void main(String[] args){
		Hashmap h = new Hashmap();

		Scanner usr_choice = new Scanner(System.in);
		System.out.println("Are you making a data entry? [y/n] type 'q' to quit: ");
		String choice = usr_choice.nextLine();


		while(!choice.equals("q")){

			if(choice.equals("y")){
				Scanner entry_plate = new Scanner(System.in);
				System.out.println("Enter license plate (lowercase letters and no spaces):  ");
				String data_plate = entry_plate.nextLine();

				Scanner entry_name = new Scanner(System.in);
				System.out.println("Enter full name: ");
				String data_name = entry_name.nextLine();

				h.entry(data_name,data_plate);

				

				usr_choice = new Scanner(System.in);
				System.out.println("Are you making a data entry? [y/n] type 'q' to quit: ");
				choice = usr_choice.nextLine();

			}	
			if(choice.equals("n")){
				Scanner user_plate = new Scanner(System.in);
				System.out.println("Enter your license plate: ");
				String plate = user_plate.nextLine();
				h.hash(plate);

				usr_choice = new Scanner(System.in);
				System.out.println("Are you making a data entry? [y/n] type 'q' to quit: ");
				choice = usr_choice.nextLine();

			}
		}

	}

	public void entry(String name, String data_plate){
		int len = data_plate.length();
		ArraySize = new license().plategen(len);
		_Array = new String[ArraySize];
		int key = index(data_plate);
		_Array[key] = name;
		System.out.println(key);
	}


	public void hash(String plate){
		int len = plate.length();
		ArraySize = new license().plategen(len);
		_Array = new String[ArraySize];
		//hypothetical plate = "abc123" corresponds to index of each letter and digit in the array  ie. ("a"+"b"+"c") + (1+2+3) = Index --> (0+1+2) + (1+2+3) = 9
		//hypothetical plate corresponds to following fake vehicle owners.
		_Array[9] = "Logan Dawson";
		_Array[54] = "Jackie Wilson";  

		int array_key = platereader(plate);
		System.out.println(array_key);
		System.out.println(_Array[array_key]);
	}

	
	public int platereader(String plate){
		
		String user_input = plate;
		int key = index(user_input);

		return key;

	}

	public int index(String usr_input){

		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] nums = {"0","1","2","3","4","5","6","7","8","9"};

		int alph_index = 0;
		int nums_index = 0;
		for(char k: usr_input.toCharArray()){
			String character = String.valueOf(k);
			for(int j=0; j<26; j++){
				if(character.equals(alphabet[j])){
					alph_index = alph_index+j;
				}
			}
		}

		for(char c: usr_input.toCharArray()){
			for(int t=0; t<10; t++){
				String character = String.valueOf(c);
				if(character.equals(nums[t])){
					nums_index = nums_index+t;
				}
			}
		}

		int index = alph_index + nums_index;
		//System.out.println(alph_index);
		//System.out.println(nums_index);

		return index;

	}

}