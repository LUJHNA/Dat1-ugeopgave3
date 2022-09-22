import java.util.Random;

public class MathWork {


public static void main(String[] args) {
		divisible(7);
		recursionTest(10);
	}

int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10};
public int getRandom() {
Random r = new Random();
int g = r.nextInt(arr.length);
return arr[g]; //im missing something, can't get it to work :(

}




static void divisible(int table){
	for(int i = 0; i <= 100; i++){
		if(i % table == 0) {
			System.out.println(i);
		}
	}
}	



static void recursionTest(int recur) {
System.out.println(recur);
recur = recur -1;
if(recur >= 0) {
recursionTest(recur);
}
}
}
