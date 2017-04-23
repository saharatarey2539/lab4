package saharat.lab4;
public class ArrayListEXt extends ArrayList{
		
	public static void main(String[] args){
			ArrayListEXt count = new ArrayListEXt();
			int sum = count.countItem(6);
			System.out.println(sum);
		}
			
		public int countItem(Object e) {
			int count = 0;
			for (int i = 0; i < size; i++) {
				if (elementData[i].equals(e)) {
					count++;
				}
			}
			return count;
		}
		

	}

