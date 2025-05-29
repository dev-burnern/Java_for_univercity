# Chap02 자료형과 변수

## 1. 변수(Variable)와 상수(Constant)
- **변수(Variable)**: 데이터를 저장할 수 있는 메모리 공간. 값이 변경될 수 있음.
  - 선언 예시: `int a = 10;`
- **상수(Constant)**: 한 번 값이 정해지면 변경할 수 없는 데이터.
  - 선언 예시: `final int SPEED = 20;`

> **예시 코드**
```java
final int SPEED = 20; // 상수
int count = 10;       // 변수
count = 11;           // 변수는 값 변경 가능
// SPEED = 30;        // 오류! 상수는 값 변경 불가
```

---

## 2. 기본 자료형(Primitive Data Types)

| 자료형   | 크기    | 예시 값   | 설명                |
|----------|--------|-----------|---------------------|
| byte     | 1바이트 | 127       | 아주 작은 정수      |
| short    | 2바이트 | 32767     | 작은 정수           |
| int      | 4바이트 | 2147483647| 일반적인 정수       |
| long     | 8바이트 | 9223372036854775807L | 큰 정수 |
| float    | 4바이트 | 3.14f     | 소수점 있는 실수    |
| double   | 8바이트 | 3.141592  | 더 정밀한 실수      |
| char     | 2바이트 | 'A'       | 문자 1개            |
| boolean  | 1바이트 | true/false| 참/거짓 논리값      |

> **정수형 예시**
```java
int i = 10;
short s = 20;
long l = 30L;
byte b = 50;
System.out.println("i = " + i);
```

> **실수형 예시**
```java
float f = 214.1421f;
double d = 614.1421;
System.out.println("f = " + f);
```

> **문자형/논리형 예시**
```java
char ch = 'A';
boolean t = true, f = false;
System.out.println("ch = " + ch);
System.out.println("t = " + t + ", f = " + f);
```

---

## 3. 문자열(String)과 문자(char)
- **문자(char)**: 작은따옴표(')로 감싼 한 글자
- **문자열(String)**: 큰따옴표(")로 감싼 여러 글자

> **예시**
```java
char ch1 = 'J';
String str1 = "java";
System.out.println("ch1 = " + ch1);
System.out.println("str1 = " + str1);
```

---

## 4. 변수와 상수의 차이
- 변수는 값을 여러 번 바꿀 수 있지만, 상수는 한 번만 값을 지정할 수 있음.
- 상수는 `final` 키워드로 선언함.

---

## 5. 출력문
- `System.out.println()`: 값을 출력하고 줄바꿈
- `System.out.print()`: 값을 출력하되 줄바꿈 없음
- `\n`, `\t` 등 이스케이프 문자로 줄바꿈, 탭 등 표현 가능

> **예시**
```java
System.out.println("이름: " + myName);
System.out.println("나이: " + myAge);
System.out.println("Java\nProgramming");
```

---

## 6. 주석(Comment)
- 코드에 설명을 달 때 사용
  - 한 줄 주석: `// 내용`
  - 여러 줄 주석: `/* 내용 */`

---

## 7. 입출력 예제
- **InputOutput01.java**: 변수 선언 후 값 출력
- **InputOutput02.java**: 이스케이프 문자(`\n`, `\t`)를 활용한 출력

> **예시**
```java
String myName = "홍길동";
int myAge = 25;
System.out.println("이름 : \t" + myName);
System.out.println("나이 : \t" + myAge);
System.out.println("이름 : \n" + myName + "\n나이 : \n" + myAge);
```

---

## 8. 파일별 간단 요약

| 파일명             | 주요 내용 요약                                      |
|--------------------|----------------------------------------------------|
| Datatype01.java    | 정수형 변수 선언/출력                               |
| Datatype02.java    | 실수형 변수 선언/출력                               |
| Datatype03.java    | 문자형 변수, 문자 연산                              |
| Datatype04.java    | 문자열 변수 선언/출력                               |
| Datatype05.java    | boolean 자료형 사용                                 |
| Variable01.java    | 변수 선언, 값 대입                                  |
| Variable02.java    | 상수 선언, 원의 넓이 계산                           |
| Example01.java     | 상수와 변수의 차이, 출력문                          |
| Example02.java     | 줄바꿈 문자(`\\n`) 활용 출력                        |
| InputOutput01.java | 변수 선언 후 출력                                   |
| InputOutput02.java | 이스케이프 문자(`\\n`, `\\t`) 활용 출력             |

---

> **참고:** 각 예제 파일의 코드를 직접 실행해보며 자료형, 변수, 상수, 출력문, 주석의 개념을 익히는 것이 중요합니다.

---
