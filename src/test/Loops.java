package test;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//--------------- While Loop ------------------
		
	int index = 5;
	
	while(index>0) {
		
		if(index!=3) {
		System.out.println(index);
		}
		index = index-1;
	}
	
	int index1 = 5;
	
	while(index1>0) {
		
		System.out.println(index1);
		if(index1==3) {
			break;
		}
		index1--;
	}
		
		//------------------- Do While Loop ---------------------
		int index2 = 1;
		
		do {
			System.out.println(index2);
			index2++;
			
		}while(index2<11);
		
		//------------------ For Loop -----------------
		
		for(int i = 1; i<11; i++) {
			
			System.out.println(i);
		}
		
		for(int i = 11; i>0; i--) {
			
			System.out.println(i);
		}
		
		// -----------------Print Array value --------------
		
		int myarray[] = {1,2,3,4,5,6,7,8,9,0};
		
		for(int i=0; i<myarray.length; i++)
		{
			System.out.println(myarray[i]);
		}
		
		
		
	}

}
