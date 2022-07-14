package activities;



public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array initialization 
		int[] numbers = {10,77,10,54,-11,10}  ; 
		int notoSearch =10;
		int sum = 30;
		//result
		System.out.println("Result:"+Sumoftens(numbers,notoSearch,sum));
		
		
		

}



public static boolean Sumoftens(int[] numArr,int notoSearch,int sum) {
	int temp2 = 0;//to hold sum temporarily 
	
	for (int i:numArr) {
		if (i==notoSearch) {
			temp2 += notoSearch;
		}
		if (temp2 > sum)
		{
			break;
		}
		
	}
	return temp2 == sum;
}
}


