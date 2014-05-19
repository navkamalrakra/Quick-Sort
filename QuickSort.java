import java.io.IOException;

public class QuickSort extends ReadFile {

	private int length;

	//private int array[]={13,1,12,29,18,7,6,5,9};
	//private int array[]={3,9,8,4,6,10,2,5,7,1};
	//private int array[]={9,8,7,6,5,4,3,2,1,0};
	//private int array[]={1,2,3,4,5,6,7,8,9};
	//private int array[]={9,8,7,6,1,2,3,4,5};
	//private int array[]={9,8,7,6,1,2,0,3,94,4,7,0};

	private void initiateProcess(){
		this.length = array.length;
		quickSort(0,this.length-1);		
	}

	private void quickSort(int lowerindex, int higherindex) {
		if(lowerindex<higherindex){

			int pivotIndex = lowerindex;
			int i=pivotIndex+1;
			int j=i;

			while(j<=higherindex){
				if(array[j]<array[pivotIndex]){
					swapNumbers(i, j);
					i++;
					j++;
				}
				else {
					j++;
				}
			}
			swapNumbers(pivotIndex, i-1);
			quickSort(pivotIndex, i-1);
			quickSort(i, higherindex);
		}
	}
	private void swapNumbers(int i,int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		QuickSort obj = new QuickSort();
		obj.getFile();
		obj.setUnsortedArray();
		obj.initiateProcess();
		for(int x:obj.array){
			System.out.print(x+" ");
		}
	}
}
