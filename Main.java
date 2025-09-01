//// 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.
//
//class Main {
//	public static void main(String[] args) {
//		
//		// 오직 정수형 데이터만 들어갈 수 있는 a라는 변수(하나의 공간)를 만들고 10이라는 값을 넣겠다.
//		int a = 10;
//
//		// `==` => 같다.
//		if (a == 10) {
//			System.out.println("참1");
//		}
//
//		// `!=` => 같지 않다.
//		if (a != 10) {
//			System.out.println("거짓1");
//		}
//
//		if (a > 10) {
//			System.out.println("거짓2");
//		}
//
//		if (a >= 10) {
//			System.out.println("참2");
//		}
//
//		int b = 10;
//
//		if (a == b) {
//			System.out.println("참3");
//		}
//
//		// boolean c => c 에는 오직 true/false 만 담을 수 있다.
//		boolean c = a != b;
//
//		if (c) {
//			System.out.println("거짓3");
//		}
//
//		if (c == false) {
//			System.out.println("참4");
//		}
//
//		// `!` => 반전
//		if (!c) {
//			System.out.println("참5");
//		}
//
//		// `!` => 반전
//		if (!(!c)) {
//			System.out.println("거짓4");
//		}
//
//		boolean d = true;
//
//		if (c != d) {
//			System.out.println("참6");
//		}
//
//		if (20 > 2 && 10 > 3 && true != false && 10 != 10) {
//			System.out.println("거짓5");
//		}
//
//		if (10 != 10 || 10 < 2) {
//			System.out.println("거짓6 ");
//		}
//	}
//}

//문제 : 할인 대상인지 아닌지 출력해주세요.
//조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
//조건 : 출력예시 처럼 출력되어야 합니다.
//조건 : `구현시작` 부분만 수정 할 수 있습니다.
//조건 : 4가지 이상의 방법으로 풀어야 합니다.
//조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

//class Main {
//  public static void main(String[] args) {
//    int age = 20; // 이 값을 바꿔가면서 실행해보세요.
//
//    System.out.println("당신의 나이는 " + age + "살 입니다.");
//
//    // 구현시작
//    System.out.println("== 정답 v1 ==");
//    if ( age <= 19 ) {
//      System.out.println("할인 대상입니다.");
//    }
//
//    if ( age >= 60 ) {
//      System.out.println("할인 대상입니다.");
//    }
//
//    if ( age >= 20 ) {
//      if ( age < 60 ) {
//        System.out.println("할인 대상이 아닙니다.");
//      }
//    }
//
//    System.out.println("== 정답 v2 ==");
//
//    // if 문들을 else 로 묶어서 하나로 만들 수 있다.
//    // 마지막에는 else 를 쓰고 조건을 안쓰면 위의 모든 조건이 틀렸을 때 실행되는 블록을 만들 수 있다.
//    if ( age <= 19 ) {
//      System.out.println("할인 대상입니다.");
//    }
//    else if ( age >= 60 ) {
//      System.out.println("할인 대상입니다.");
//    }
//    else {
//      System.out.println("할인 대상이 아닙니다.");
//    }
//
//    System.out.println("== 정답 v3 ==");
//
//    if ( age <= 19 || age >= 60 ) {
//      System.out.println("할인 대상입니다.");
//    }
//    else {
//      System.out.println("할인 대상이 아닙니다.");
//    }
//
//    System.out.println("== 정답 v4 ==");
//
//    if ( age > 19 && age < 60 ) {
//      System.out.println("할인 대상이 아닙니다.");
//    }
//    else {
//      System.out.println("할인 대상입니다.");
//    }
//
//    // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
//  }
//}

// class Main {
//	public static void main(String[] args) {
//		System.out.printf("%d * %d = %d\n", 8, 1, 8);
//		System.out.printf("%d * %d = %d\n", 8, 2, 16);
//		System.out.printf("%d * %d = %d\n", 8, 3, 24);
//		System.out.printf("%d * %d = %d\n", 8, 4, 32);
//		System.out.printf("%d * %d = %d\n", 8, 5, 40);
//		System.out.printf("%d * %d = %d\n", 8, 6, 48);
//		System.out.printf("%d * %d = %d\n", 8, 7, 56);
//		System.out.printf("%d * %d = %d\n", 8, 8, 64);
//		System.out.printf("%d * %d = %d\n", 8, 9, 72);
//
//		// 출력
//		/*
//		 * 8 * 1 = 8 8 * 2 = 16 8 * 3 = 24 8 * 4 = 32 8 * 5 = 40 8 * 6 = 48 8 * 7 = 56 8
//		 * * 8 = 64 8 * 9 = 72
//		 */
//		int dan = 8;
//
//		System.out.printf("%d * 1 = 8\n", dan);
//		System.out.printf("%d * 2 = 16\n", dan);
//		System.out.printf("%d * 3 = 24\n", dan);
//		System.out.printf("%d * 4 = 32\n", dan);
//		System.out.printf("%d * 5 = 40\n", dan);
//		System.out.printf("%d * 6 = 48\n", dan);
//		System.out.printf("%d * 7 = 56\n", dan);
//		System.out.printf("%d * 8 = 64\n", dan);
//		System.out.printf("%d * 9 = 72\n", dan);
//		// ------------------------------------------------
//		System.out.println(dan + " * 1 = 8");
//		System.out.println(dan + " * 2 = 16");
//		System.out.println(dan + " * 3 = 24");
//		System.out.println(dan + " * 4 = 32");
//		System.out.println(dan + " * 5 = 40");
//		System.out.println(dan + " * 6 = 48");
//		System.out.println(dan + " * 7 = 56");
//		System.out.println(dan + " * 8 = 64");
//		System.out.println(dan + " * 9 = 72");
//
//		dan = 9;
//
//		System.out.printf("%d * %d = %d\n", dan, 1, dan * 1);
//		System.out.printf("%d * %d = %d\n", dan, 2, dan * 2);
//		System.out.printf("%d * %d = %d\n", dan, 3, dan * 3);
//		System.out.printf("%d * %d = %d\n", dan, 4, dan * 4);
//		System.out.printf("%d * %d = %d\n", dan, 5, dan * 5);
//		System.out.printf("%d * %d = %d\n", dan, 6, dan * 6);
//		System.out.printf("%d * %d = %d\n", dan, 7, dan * 7);
//		System.out.printf("%d * %d = %d\n", dan, 8, dan * 8);
//		System.out.printf("%d * %d = %d\n", dan, 9, dan * 9);
//		// ------------------------------------------------
//		System.out.println(dan + " * 1 = " + dan * 1);
//		System.out.println(dan + " * 2 = " + dan * 2);
//		System.out.println(dan + " * 3 = " + dan * 3);
//		System.out.println(dan + " * 4 = " + dan * 4);
//		System.out.println(dan + " * 5 = " + dan * 5);
//		System.out.println(dan + " * 6 = " + dan * 6);
//		System.out.println(dan + " * 7 = " + dan * 7);
//		System.out.println(dan + " * 8 = " + dan * 8);
//		System.out.println(dan + " * 9 = " + dan * 9);
//
//		// -----------------------------------------------
//
//		dan = 8;
//
//		// 수정가능지역 시작
//		int i = 1;
//		System.out.println(dan + " * " + i + " = " + dan * i);
//
//		// 변수가 가진 기존의 값을 잃지 않으면서 덧붙여 나가는 연산
//		i = i + 1;
//		i += 1;
//		i++;
//
//		// 현재 이 연산자가 포함된 코드가 실행된 후에 연산을 수행
//		i++;
//
//		// 현재 이 연산자가 먼저 실행된 후에 코드가 실행
//		++i;
//
//		System.out.println(dan + " * " + i + " = " + dan * i);
//		i = i + 1;
//		System.out.println(dan + " * " + i + " = " + dan * i);
//		i = i + 1;
//		System.out.println(dan + " * " + i + " = " + dan * i);
//		i = i + 1;
//		System.out.println(dan + " * " + i + " = " + dan * i);
//		i = i + 1;
//		System.out.println(dan + " * " + i + " = " + dan * i);
//		i = i + 1;
//		System.out.println(dan + " * " + i + " = " + dan * i);
//		i = i + 1;
//		System.out.println(dan + " * " + i + " = " + dan * i);
//		i = i + 1;
//		System.out.println(dan + " * " + i + " = " + dan * i);
//		i = i + 1;
//
//		// 수정가능지역 끝
//
//		i = 1;
//
//		while (i <= 1000) {
//			System.out.println(dan + " * " + i + " = " + dan * i);
//			i++;
//		}
//		
//		for(i=1; i<= 1000; i++) {
//			System.out.printf(dan + " * " + i + " = " + dan * i);
//		}
//		// 문제 : 1부터 5까지 출력해주세요.
//
//		int j = 1;
//		while (j <= 5) {
//			System.out.println(j);
//			j++;
//		}
//		
//		for(j=1; j<=5; j++) {
//			System.out.println(j);
//		}
//		// 출력
//		// 1
//		// 2
//		// 3
//		// 4
//		// 5
//
//		// 문제 : -100부터 25까지 출력해주세요.
//
//		j = -100;
//		while (j <= 25) {
//			System.out.println(j);
//			j++;
//		}
//		
//		for(j = -100; j<= 25; j++) {
//			System.out.println(j);
//		}
//		// 문제 : 아래와 같이 출력해주세요.
//		// 문제 : 단을 * 1000까지 출력해주세요.
//		// 조건 : 곱하는 순서를 거꾸로 해주세요.
//
//		dan = 8;
//
//		i = 1000;
//		
//		while(i >= 1) {
//			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
//			i--;
//		}
//		
//		for(i =1000; i>= 1; i--) {
//			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
//		}
//
//		// 출력
//		/*
//		 * 8 * 1000 = 8000 ... 8 * 1 = 8
//		 */
//		
//		// 문제 : 아래와 같이 출력해주세요.
//		// 문제 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.
//		
//		while(i >= -500) {
//			System.out.println(dan + "*" + i + "=" + dan * i);
//			i--;
//		}
//		
//		for(i=1000; i >= -500; i--) {
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//		}
//		
//		// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
//		// 조건 : 2중 while문 사용
//		
//		i = 1;
//		while(i<=10) {
//			j = 1;
//			while(j<=3) {
//				System.out.println(j);
//				j++;
//			}
//			i++;
//		}
//		
//		for(i = 1; i <= 10; i++) {
//			for(j = 1; j <= 3; j++) {
//				System.out.println(j);
//			}
//		};
//		// 1부터 5까지의 합을 더한 결과를 출력해주세요.
//		
//		i = 1;
//		int sum = 0;
//		while(i<=5) {	
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
//		
//		sum = 0;
//		for(i = 1; i<= 5; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		// -100부터 25까지의 합을 더한 결과를 출력해주세요.
//		i = -100;
//		sum = 0;
//		while(i<=25) {	
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
//		
//		sum = 0;
//		for(i = -100; i<= 25; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//	}
//}

// 1.f11을 눌러서 시작하면 사용자에게 숫자를 입력하세요. 라는 문구를 하나 보여주고 실제로 압력을 받는다.
// 2.입력을 받으면 입력받은 값과 rs가 가진 값을 비교하여 up인지, down인지 사용자에게 출력으로 알려준다.
// 3.다시 숫자를 입력하세요. 라는 문구를 보여주며 다시 입력을 받을 수 있게 해서 또 입력받고 2번의 과정을 반복
// 4. 정답을 맞추면 정답입니다. 출력해서 보여주고 프로그램 종료
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

// rs(1~100사이의 랜덤한 숫자 생성 코드)
		int rs = (int) (Math.random() * 100) + 1;

// 	자바에서의 입력을 위한 준비
		Scanner sc = new Scanner(System.in);

		System.out.printf("숫자를 입력하세요. : ");
		while (true) {
// 자바에서 입력이라는 행위
			int num = sc.nextInt();

			if (num < rs) {
				System.out.println("UP 다시숫자를 입력하세요.");
			} continue;
			if (num > rs) {
				System.out.println("DOWN 다시숫자를 입력하세요.");
			} 
			continue;
				{
				System.out.println("정답입니다.");
			}
			break;
		}

// scanner 자원 종료 코드

		sc.close();
	}
}
