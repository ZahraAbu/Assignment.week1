package assignment2.week1;

public class PrintDuplicates {	

		public static void main(String[] args) {
			int[] arr= {12,14,15,13,14,66,77,667,15,77,12};
			int length = arr.length;
			int count;
			for (int i=0;i<length-1;i++)
			{
				count=0;
				for (int j=i+1;j<length;j++)
				{
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				if (count>0) {
					System.out.println(arr[i]);
				}
			}
			}

		}