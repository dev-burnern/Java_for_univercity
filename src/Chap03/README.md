# Chap03 연산자, 입력, 형변환

## 1. 연산자(Operators)

| 연산자 종류 | 기호/예시      | 설명                       |
|------------|---------------|----------------------------|
| 산술 연산자 | +, -, *, /, % | 사칙연산 및 나머지 연산     |
| 비교 연산자 | >, <, ==, !=  | 두 값을 비교               |
| 논리 연산자 | &&, ||, !     | 논리값(참/거짓) 연산        |
| 대입 연산자 | =, +=, -= 등  | 변수에 값 할당 및 연산      |
| 증감 연산자 | ++, --        | 1씩 증가/감소               |

> **예시 코드**
```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a / b); // 3
System.out.println(a % b); // 1
System.out.println(a > b); // true
System.out.println(a == b); // false
System.out.println(a != b); // true
System.out.println(a > 5 && b < 5); // true
```

---

## 2. 입력(Input)
- Scanner 클래스를 사용하여 키보드로부터 값을 입력받을 수 있음.

> **예시 코드**
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println("입력값: " + num);
```

---

## 3. 형변환(Type Conversion)
- **자동 형변환**: 작은 타입 → 큰 타입으로 변환 (예: int → double)
- **강제 형변환**: 큰 타입 → 작은 타입으로 변환 (예: double → int)

> **예시 코드**
```java
int i = 10;
double d = i; // 자동 형변환
int j = (int)d; // 강제 형변환
```

---

## 4. 예제 파일 설명
- **Example01.java**: 두 정수의 사칙연산 결과 출력
- **Example02.java**: 비교 연산자 사용 예제
- **Example03.java**: 논리 연산자 사용 예제
- **Example04.java**: 복합 대입 연산자 사용 예제
- **Example05.java**: 증감 연산자 사용 예제
- **Example06.java**: 자동 형변환 예제
- **Example07.java**: 강제 형변환 예제
- **Example08.java**: Scanner를 이용한 문자열 입력 예제
- **Input.java**: Scanner를 사용해 정수와 실수 입력받기 예제
- **Operator01~05.java**: 다양한 연산자 예제
- **TypeConversion.java**: 형변환 관련 예제

---

## 5. 연산자 우선순위 (Operator Precedence)
| 우선순위 | 연산자 예시           | 설명                |
|----------|----------------------|---------------------|
| 1        | ()                   | 괄호                |
| 2        | ++, --, !, (type)    | 단항 연산자         |
| 3        | *, /, %              | 곱셈, 나눗셈, 나머지|
| 4        | +, -                 | 덧셈, 뺄셈          |
| 5        | >, <, >=, <=         | 비교 연산자         |
| 6        | ==, !=               | 등가 비교           |
| 7        | &&                   | 논리 AND            |
| 8        | ||                   | 논리 OR             |
| 9        | =, +=, -=, ...       | 대입 연산자         |

---

## 6. 자주 하는 실수 & 주의사항
- 정수 나눗셈은 소수점 이하가 버려집니다. (예: 5/2 = 2)
- Scanner로 입력받을 때 nextInt()와 nextLine()을 혼용하면 개행 문자 문제로 입력이 꼬일 수 있습니다.
- 강제 형변환 시 데이터 손실이 발생할 수 있습니다.

---

## 7. 추가 참고 자료 및 표

### 1. 연산자별 실제 코드 예시와 출력 결과
| 코드 예시                  | 출력 결과 |
|----------------------------|-----------|
| System.out.println(5 / 2); | 2         |
| System.out.println(5 / 2.0); | 2.5     |
| System.out.println(3 == 3); | true     |
| System.out.println(3 != 2); | true     |
| System.out.println(true && false); | false |

### 2. Scanner 입력 관련 자주 쓰는 메서드 표
| 메서드         | 설명                | 예시 코드                      |
|----------------|---------------------|-------------------------------|
| nextInt()      | 정수 입력           | int n = sc.nextInt();         |
| nextDouble()   | 실수 입력           | double d = sc.nextDouble();   |
| next()         | 단어(공백 전까지)   | String s = sc.next();         |
| nextLine()     | 한 줄 전체 입력     | String line = sc.nextLine();  |

### 3. 형변환 시 발생할 수 있는 오류/예외 상황 예시
- 큰 값을 작은 타입으로 강제 형변환하면 데이터 손실이 발생할 수 있습니다.
- 예시: `int n = (int)12345678901L; // 값 손실 발생`
- 실수 → 정수 변환 시 소수점 이하가 모두 버려집니다.

---
