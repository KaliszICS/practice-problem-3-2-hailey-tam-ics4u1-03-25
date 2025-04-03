public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int towerOfHanoi(int num){
	//base case
	if (num < 3){
		return -1;
	}

	if (num == 3){
		return 7;
	}

	//recursion case
	return 2*towerOfHanoi(num - 1) + 1;
	}	
}
