public class Calculate{
	public static void main (String[] arg){
			System.out.println("Calculate...");
			double first = Double.valueOf(arg[0]);
			double second = Double.valueOf(arg[1]);
			double summ = first + second;

			double pow = Math.pow(first, second);
			double minus = second - first;

			System.out.println("Summa " + summ);

			System.out.println("Stepen' " + pow);

			System.out.println("Vichitanie " + minus);
	}
}