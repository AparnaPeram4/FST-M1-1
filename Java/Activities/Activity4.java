package activities;
import java.util.Arrays;

public class Activity4 {

	static void sortAsc(int arrSort[])
{
	int size = arrSort.length,i;
	for (i=1;i<size;i++)
	{
		int key = arrSort[i]; // key = 1
		int j = i-1 ; //j = 0
		
		while (j>=0 && key < arrSort[j]) //arrSort[j] = 5
		{
			arrSort[j+1] = arrSort[j];
			--j;
					
			                       
		}
		arrSort[j+1]= key ;
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] sortArr = {5,1,8,0,2};
	sortAsc(sortArr);
	
	System.out.println ("Sorted Array in ascensing order :");
	System.out.println(Arrays.toString(sortArr));

}
}
