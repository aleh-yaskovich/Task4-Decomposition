package by.htp.task4.main;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		task1();
		task2();
		task3();
		task4();
		task5();
		task6();
		task7();
		task8();
		task9();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
	}
	// 1. ����������� ����� ������������ ����� ������. �������� ����� ��� ���������� ��� �������
	public static void task1 () {
		double x1 = 3;
		double y1 = 5;
		double x2 = 5;
		double y2 = 7;
		double x3 = 7;
		double y3 = 1;
		double sideA = sideLength(x1, y1, x2, y2);
		double sideB = sideLength(x1, y1, x3, y3);
		double sideC = sideLength(x2, y2, x3, y3);
		double area = triangleArea (sideA, sideB, sideC);
		System.out.println("������ 1. ������� ������������ � ������������ ������ A("+x1+","+y1+"), B("+x2+","+y2
								+"), C("+x3+","+y3+") ����� "+ area);
	}
	public static double sideLength (double x1, double y1, double x2, double y2) {
		double sideLength = Math.sqrt( Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2) );
		return sideLength;
	}
	public static double triangleArea (double a, double b, double c) {
		double p = (a + b + c) / 2; // ������������
		double triangleArea = Math.sqrt( p * (p - a) * (p - b) * (p - c) );
		return triangleArea;
	}
	// 2. �������� �����(������) ��� ���������� ����������� ������ �������� � ����������� ������ �������� ���� ����������� �����
	public static void task2() {
		int num1 = 42;
		int num2 = 33;
		int nod = searchNod (num1, num2);
		int nok = num1*num2/nod; // ���������� ����� �������
		System.out.println("������ 2. ��� ������������ ����� "+num1+" � "+num2+" ���������� ����� ��������� �������� "+
		nod+", � ���������� ����� ������� �������� "+nok);
	}
	public static int searchNod (int a, int b) {
		int nod = 1;
		for (int i = 1; i < a*b; i++) {
			if ( a*b % i == 0 && i > nod ) {
				nod = i;
			}
		}
		return nod;
	}
	// 3. �������� �����(������) ��� ���������� ����������� ������ �������� ������� ����������� �����
	public static void task3() {
		int num1 = 12;
		int num2 = 7;
		int num3 = 21;
		int num4 = 42;
		int nod = searchNod (num1*num2, num3*num4); // ����� �� ������ 2 
		System.out.println("������ 3. ��� ������������ ����� "+num1+", "+num2+", "+num3+" � "+num4+" ���������� ����� ��������� �������� "+nod);
	}
	// 4. �������� �����(������) ��� ���������� ����������� ������ �������� ���� ����������� �����
	public static void task4() {
		int num1 = 13;
		int num2 = 3;
		int num3 = 16;
		int nok = searchNok(num1*num2, num3);
		System.out.println("������ 4. ��� ������������ ����� "+num1+", "+num2+" � "+num3+" ���������� ����� ������� �������� "+nok);
	}
	public static int searchNok(int a, int b) {
		int nod = searchNod (a, b); // ����� �� ������ 2 ;
		int nok = a*b/nod;
		return nok;
	}
	// 5. �������� �����(������) ��� ���������� ����� �������� � �������� �� ���� �����
	public static void task5() {
		int num1 = 13;
		int num2 = 3;
		int num3 = 16;
		int maxNum = maxNum(num1, num2, num3);
		int minNum = minNum(num1, num2, num3);
		System.out.println("������ 5. ����� �������� � �������� �� ����� "+num1+", "+num2+" � "+num3+" ����� " + (maxNum+minNum));
	}
	public static int maxNum(int a, int b, int c) {
		int maxNum = a;
		if (a >= b && a >= c) {
			maxNum = a;
		} else if (b >= a && b >= c) {
			maxNum = b;
		} else if (c >= a && c >= b) {
			maxNum = c;
		}
		return maxNum;
	}
	public static int minNum(int a, int b, int c) {
		int minNum = a;
		if (a <= b && a <= c) {
			minNum = a;
		} else if (b <= a && b <= c) {
			minNum = b;
		} else if (c <= a && c <= b) {
			minNum = c;
		}
		return minNum;
	}
	// 6. ��������� ������� ����������� �������������� �� �������� �, ��������� ����� ���������� ������� ������������
	public static void task6() {
		double side = 9;
		double hexagonSquare = 6 * triangleArea(side, side, side); // ����� �� ������ 1
		System.out.println("������ 6. ������� ����������� �������������� �� �������� "+side+" ����� " + hexagonSquare);;
	}
	// 7. �� ��������� ������ ������ ������������ n �����. 
	//    �������� �����(������), ������������, ����� ������ �� ��� ����� ����� ������� ����������. ���������� ����� ������� � ������
	public static void task7() {
		int n = 20;
		int[][] dots = new int[n][2];
		dots = fillArrayRand(dots);
		maxDistance(dots);
	}
	public static int[][] fillArrayRand(int[][] arr) {
		for (int i = 0; i < arr.length; i ++) {
			arr[i][0] = (int)(Math.random()*100);
			arr[i][1] = (int)(Math.random()*100);
		}
		return arr;
	}
	public static void maxDistance(int[][] arr) {
		double maxDistance = 0;
		int a = 0;
		int b = 0;
		for (int i = 0; i < arr.length-1; i ++) {
			for (int j = i + 1; j < arr.length; j++) {
				int x1 = arr[i][0];
				int y1 = arr[i][1];
				int x2 = arr[j][0];
				int y2 = arr[j][1];
				double distance = Math.sqrt( Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2) );
				if (distance > maxDistance) {
					maxDistance = distance;
					a = i;
					b = j;
				}
			}
		}
		System.out.println("������ 7. ����� ������� ���������� ����� ������� � ������������ ("+arr[a][0]+";"+arr[a][1]
				+") � ("+arr[b][0]+";"+arr[b][1]+"): "+maxDistance);
	}
	// 8. ��������� ���������, ������� � ������� A[N] ������� ������ �� �������� ����� 
	//    (������� �� ������ �����, ������� ������ ������������� �������� �������, �� ������ ���� ������ ���������). 
	public static void task8() {
		int[] arr = new int[20];
		arr = fillArrRand(arr);
		arr = sort(arr);
		System.out.println("������ 8. ������ �� �������� ����� ������� arr ����� "+ arr[2]);
	}
	public static int[] fillArrRand(int[] arr) {
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = (int)(Math.random()*100);
		}
		return arr;
	}
	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	// 9. �������� �����(������), �����������, �������� �� ������ ��� ����� ������� ��������
	public static void task9() {
		int num1 = 13;
		int num2 = 17;
		int num3 = 12;
		boolean res1 = mutuallySimple(num1, num2);
		boolean res2 = mutuallySimple(num1, num3);
		boolean res3 = mutuallySimple(num2, num3);
		if (res1 && res2 && res3) {
			System.out.println("������ 9. ����� "+num1+", "+num2+" � "+num3+" �������� ������� ��������");
		} else {
			System.out.println("������ 9. ����� "+num1+", "+num2+" � "+num3+" �� �������� ������� ��������");
		}
	}
	public static boolean mutuallySimple(int a, int b) {
		int i = 2; 
		boolean res = true;
		while (i <= a && res == true ) {
			if (a%i == 0 && b%i == 0) {
				res = false;
			}
			i++;
		}
		return res;	
	}
	// 10. �������� �����(������) ��� ���������� ����� ����������� ���� �������� ����� �� 1 �� 9
	public static void task10() {
		int sumFactorial = 0;
		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0) {
				int iFactorial = findFactorial(i);
				sumFactorial = sumFactorial + iFactorial;
			}
		}
		System.out.println("������ 10. ����� ����������� ���� �������� ����� �� 1 �� 9 ����� "+ sumFactorial);
	}
	public static int findFactorial (int a) {
		int factorial = 1;
		for (int i = 1; i <= a; i ++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	// 11. ����� ������ D. ���������� ��������� �����: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
	public static void task11() {
		int n = 3;
		int[] array = new int[20];
		array = fillArrRand(array); // ����� �� ������ 8
		int number = enterNum(array, n);
		int sumElement = sumElements(array, number, n);
		System.out.println("������ 11. ����� ��������� ������� � "+number+" �� "+(number + n - 1)+" ����� "+ sumElement);
	}
	public static int enterNum(int[] arr, int n) {
		Scanner sc = new Scanner(System.in);
        System.out.print("������ 11. ������� ����� �������� ������� �� 0 �� "+(arr.length - n)+": ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("������ 11. ������� ����� �������� ������� �� 0 �� "+(arr.length - n)+": ");
        }
        int k = sc.nextInt();
        while (k < 0 || k > (arr.length - n) ) {
        	System.out.print("������ 11. ������� ����� �������� ������� �� 0 �� "+(arr.length - n)+": ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("������ 11. ������� ����� �������� ������� �� 0 �� "+(arr.length - n)+": ");
            }
            k = sc.nextInt();
        }
        return k;
	}
	public static int sumElements(int[] arr, int k, int n) {
		int sumElement = 0;
		for (int i = k; i < (k + n); i++) {
			sumElement = sumElement + arr[i];
		}
		return sumElement;
	}
	// 12. ���� ����� X, Y, Z, � � ����� ������ ����������������. 
	//     �������� �����(������) ���������� ��� �������, ���� ���� ����� ��������� ������ X � Y� ������
	public static void task12() {
		double lengthX = 24;
		double lengthY = 25;
		double lengthZ = 17;
		double lengthT = 31;
		double lengthK = hypotenuse(lengthX, lengthY);
		double quadrangleArea = triangleArea(lengthX, lengthY, lengthK) + triangleArea(lengthZ, lengthT, lengthK); // ����� �� ������ 1
		System.out.println("������ 12. ������� ���������������� ����� "+ quadrangleArea);
	}
	public static double hypotenuse(double a, double b) {
		double c = Math.sqrt(a*a + b*b);
		return c;
	}
	// 13. ���� ����������� ����� N. �������� �����(������) ��� ������������ �������, ���������� �������� �������� ����� ����� N
	public static void task13() {
		int num = 13245768;
		int i = numLength(num); // ���������� ���������� ����
		int[] arr = new int[i];
		arr = fillArray(arr, num);
		System.out.print("������ 13. ������, ���������� �������� �������� ����� ����� "+num+": ");
		printArr(arr);
	}
	public static int numLength(int a) {
		int i = 0;
		while (a > 0) {
			a = a/10;
			i++;
		}
		return i;
	}
	public static int[] fillArray(int[] arr, int n) {
		int i = arr.length - 1;
		while (i >= 0) {
			arr[i] = n % 10;
			i--;
			n = n / 10;
		}
		return arr;
	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i ++) {
			if (i == (arr.length-1)) {
				System.out.print(arr[i]+"\n");
				break;
			}
			System.out.print(arr[i]+", ");
		}
	}
	// 14. �������� �����(������), ������������, � ����� �� ������ ���� ����� ������ ����
	public static void task14() {
		int num1 = 123456;
		int num2 = 123;
		int numLength1 = numLength(num1); // ����� �� ������ 13
		int numLength2 = numLength(num2); // ����� �� ������ 13
		res14(numLength1, numLength2, num1, num2);
	}
	public static void res14(int a, int b, int num1, int num2) {
		if (a == b) {
			System.out.println("������ 14. � ����� "+num1+" � ����� "+num2+" ���������� ���������� ����");
		} else if (a > b) {
			System.out.println("������ 14. � ����� "+num1+" ������ ����, ��� � ����� "+num2);
		} else if (a < b) {
			System.out.println("������ 14. � ����� "+num1+" ������ ����, ��� � ����� "+num2);
		}
	}
	// 15. ���� ����������� ����� � � N. �������� �����(������) ������������ ������� �, ���������� �������� �������� �����, 
	//     ����� ���� ������� ����� � � ������� �� ������� N
	public static void task15() {
		int num1 = 27;
		int num2 = 2445;
		String str = createString(num1, num2);
		String[] arr = createArr(str);
		System.out.print("������ 15. ������, ���������� �������� �������� �����, " +
		"����� ���� ������� ����� "+num1+" � ������� �� ������� "+num2+": ");
		printArrString(arr);
	}
	public static String createString(int a, int b) {
		String str = "";
		for (int i = 1; i <= b; i++) {
			int sum = 0;
			int iDouble = i;
			while (iDouble > 0) {
				sum = sum + iDouble % 10;
				iDouble = iDouble / 10;
			}
			if (sum == a) {
				str = str + i+"-";	
			}
			sum = 0;
		}
		return str;
	}
	public static String[] createArr(String str) {
		String[] arr = str.split("-");
		return arr;
	}
	public static void printArrString(String[] arr) {
		for (int i = 0; i < arr.length; i ++) {
			if (i == (arr.length-1)) {
				System.out.print(arr[i]+"\n");
				break;
			}
			System.out.print(arr[i]+", ");
		}
	}
	// 16.  ��� ������� ����� ���������� �����������, ���� ��� ���������� ���� �� ����� �� 2 (��������, 41 � 43). 
	//      ����� � ���������� ��� ���� ���������� �� ������� [n,2n], ��� n - �������� ����������� ����� ������ 2. 
	//      ��� ������� ������ ������������ ������������
	public static void task16() {
		int num1 = enterNumberTask16();
		int num2 = num1 * 2;
		System.out.print("������ 16. ������� ["+num1+","+num2+"] �������� ����. ���� \"���������\": ");
		printTwins(num1, num2);
	}
	public static int enterNumberTask16() {
		Scanner sc = new Scanner(System.in);
        System.out.print("������ 16. ������� ������� ����� ������ 2: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("������ 16. ������� ������� ����� ������ 2: ");
        }
        int num = sc.nextInt();
        while (num <= 2) {
        	System.out.print("������ 16. ������� ������� ����� ������ 2: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("������ 16. ������� ������� ����� ������ 2: ");
            }
            num = sc.nextInt();
        }
		return num;
	}
	public static void printTwins(int a, int b) {
		for (int i = a; i <= (b - 2); i ++) {
			if (i == (b - 2)) {
				System.out.print(i+"-"+(i+2)+"\n");
				break;
			}
			System.out.print(i+"-"+(i+2)+", ");
		}
	}
	// 17.  ����������� �����, � ������ �������� n ����, ���������� ������ ����������, ���� ����� ��� ����,
	//      ����������� � ������� n, ����� ������ �����. ����� ��� ����� ���������� �� 1 �� k. ��� ������� ������ ������������ ������������
	public static void task17() {
		int k = enterNumberTask17();
		String str = returnStringArmstrong(k);
		System.out.print("������ 17. � ���������� �� 1 �� "+k+" ������� ���������� ��������: " +str);
	}
	public static int enterNumberTask17() {
		Scanner sc = new Scanner(System.in);
        System.out.print("������ 17. ������� ����� ������������� �����: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("������ 17. ������� ����� ������������� �����: ");
        }
        int num = sc.nextInt();
        while (num <= 0) {
        	System.out.print("������ 17. ������� ����� ������������� �����: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("������ 17. ������� ����� ������������� �����: ");
            }
            num = sc.nextInt();
        }
		return num;
	}
	public static String returnStringArmstrong(int k) {
		String str = "";
		for (int i = 1; i <= k; i++) {
			int countCifer = countCifer(i);
			int iDouble = i;
			int sum = 0;
			while (iDouble > 0) {
				sum = sum + (int)(Math.pow((iDouble % 10), countCifer)) ;
				iDouble = iDouble / 10;
			}
			if ( sum == i ) {
				str = str + sum + ", ";
			}
		}
		str = str.substring(0, str.length()-2);
		return str;
	}
	public static int countCifer(int i) {
		int count = 0;
		while (i > 0) {
			count++;
			i = i / 10;
		}
		return count;
	}
	// 18.  ����� ��� ����������� n-������� �����, ����� � ������� �������� ������ ������������ ������������������ 
	//      (��������, 1234, 6789). ��� ������� ������ ������������ ������������
	public static void task18() {
		int n = 4;
		String str = itogString(n);
		System.out.println("������ 18. ��� "+n+"-������� �����, ����� � ������� �������� ������������ ������������������: "+str);
	}
	public static String itogString(int n) {
		String str = "";
		int ostatok = 0;
		int i = 1;
		while (ostatok != 9) {
			int number = 0;
			int iDouble = i;
			for (int j = (n-1); j >= 0; j--) {
				number = number + iDouble*(int)(Math.pow(10, j));
				iDouble++;
			}
			str = str + number + ", ";
			ostatok = number % 10;
			i++;
		}
		str = str.substring(0, str.length()-2);
		return str;
	}
	// 19.  �������� ���������, ������������ ����� n - ������� �����, ���������� ������ �������� �����. ���������� �����, 
	//      ������� ������ ���� � ��������� �����. ��� ������� ������ ������������ ������������
	public static void task19() {
		int n = 3;
		int sumOdd = sumOdd(n);
		int checkEven = checkEven(sumOdd);
		System.out.println("������ 19. ����� "+n+"-������� �����, ���������� ������ �������� �����, ����� "+sumOdd
								+". � ���� ����� ������ ����: "+checkEven);		
	}
	public static int sumOdd(int n) {
		int sumOdd = 0;
		int min = (int)(Math.pow(10, (n-1)));
		int max = (int)(Math.pow(10, n)-1);
		for (int i = min; i <= max; i++) {
			if ( checkOdd(i) ) {
				sumOdd = sumOdd + i;
			}
		}
		return sumOdd;
	}
	public static boolean checkOdd(int i) {
		boolean res = true;
		while (i > 0) {
			int ostatok = i % 10;
			if (ostatok % 2 == 0) {
				res = false;
			}
			i = i / 10;
		}
		return res;
	}
	public static int checkEven(int n) {
		int checkEven = 0;
		while (n > 0) {
			int ostatok = n % 10;
			if (ostatok % 2 == 0 ) {
				checkEven++;
			}
			n = n / 10;
		}
		return checkEven;
	}
	// 20.  �� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� ����� ��� ���� � �.�. 
	//      ������� ����� �������� ���� ����������, ����� ��������� ����? ��� ������� ������ ������������ ������������
	public static void task20() {
		int num = 9876;
		int count = countOperations(num);
		System.out.println("������ 20. ����� ���������� "+count+" ��������");
	}
	public static int countOperations(int num) {
		int count = 0;
		while (num > 0) {
			int sumCifNum = sumCifNum(num);
			num = num - sumCifNum;
			count++;
		}
		return count;
	}
	public static int sumCifNum(int num) {
		int sumCifNum = 0;
		while (num > 0) {
			sumCifNum = sumCifNum + num % 10;
			num = num / 10;
		}
		return sumCifNum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
