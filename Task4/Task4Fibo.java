public class Task4Fibo {
	public static void main(String[] args) {
		fibonacci(1,1);
	}

static void fibonacci(int z, int x){
System.out.print( z +"\t");
int y = x + z;
x = z;
z = y;
if (y <= 1000) {
fibonacci(z, x);
 		}
	}
}
