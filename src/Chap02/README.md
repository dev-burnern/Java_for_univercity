# Chap02 자료형과 변수

> **이 문서는 Chap02(자료형과 변수) 폴더의 모든 파일 구조와 내용을 분석하여, 초보자도 한눈에 이해할 수 있도록 정리한 자료입니다.**

---

## 📑 목차
1. [파일 구조](#파일-구조)
2. [핵심 개념 요약](#핵심-개념-요약)
3. [파일별 상세 정리](#파일별-상세-정리)
4. [요약](#요약)
5. [추가 학습 자료](#추가-학습-자료)

---

## 파일 구조

```
Chap02/
├─ Datatype01.java
├─ Datatype02.java
├─ Datatype03.java
├─ Datatype04.java
├─ Datatype05.java
├─ Example01.java
├─ Example02.java
├─ InputOutput01.java
├─ InputOutput02.java
├─ Variable01.java
├─ Variable02.java
```

---

## 핵심 개념 요약

| 개념         | 설명                                                         | 예시 코드/설명                |
|--------------|--------------------------------------------------------------|-------------------------------|
| 변수         | 데이터를 저장하는 공간, 값 변경 가능                         | `int a = 10;`                 |
| 상수         | 한 번 값이 정해지면 변경 불가, `final` 키워드 사용            | `final int SPEED = 20;`       |
| 기본 자료형   | byte, short, int, long, float, double, char, boolean         | 표 참고                       |
| 문자/문자열  | char('A'), String("Hello")                                  | `char ch = 'A';`              |
| 출력문       | `System.out.println()`, `System.out.print()`                 | `System.out.println(a);`      |
| 주석         | // 한 줄, /* 여러 줄 */                                      | `// 변수 선언`                |

> **기본 자료형 표**
>
>| 자료형   | 크기    | 예시 값   | 설명                |
>|----------|--------|-----------|---------------------|
>| byte     | 1바이트 | 127       | 아주 작은 정수      |
>| short    | 2바이트 | 32767     | 작은 정수           |
>| int      | 4바이트 | 2147483647| 일반적인 정수       |
>| long     | 8바이트 | 9223372036854775807L | 큰 정수 |
>| float    | 4바이트 | 3.14f     | 소수점 있는 실수    |
>| double   | 8바이트 | 3.141592  | 더 정밀한 실수      |
>| char     | 2바이트 | 'A'       | 문자 1개            |
>| boolean  | 1바이트 | true/false| 참/거짓 논리값      |

---

## 파일별 상세 정리

### Datatype01~05.java
- **핵심 개념**: 다양한 기본 자료형 선언 및 사용법 실습
- **코드 예시**
    ```java
    int i = 10;
    float f = 3.14f;
    char c = 'A';
    boolean b = true;
    System.out.println(i + ", " + f + ", " + c + ", " + b);
    ```
- **설명**: 각 자료형의 선언, 초기화, 출력 방법을 익힘
- **실습 예시**: 다양한 자료형 변수 선언 및 값 출력
- **주의사항**: 자료형별 크기와 표현 범위에 주의

### Variable01, Variable02.java
- **핵심 개념**: 변수와 상수의 선언, 값 변경, final 사용법
- **코드 예시**
    ```java
    int count = 10;
    final int MAX = 100;
    count = 20; // 가능
    // MAX = 200; // 오류! 상수는 값 변경 불가
    ```
- **설명**: 변수와 상수의 차이, 선언 및 사용법 실습
- **실습 예시**: 변수/상수 선언, 값 변경 시도
- **주의사항**: 상수는 반드시 초기화 필요, 값 변경 불가

### Example01, Example02.java
- **핵심 개념**: 변수/상수 활용, 연산 및 출력 실습
- **코드 예시**
    ```java
    int a = 5, b = 3;
    int sum = a + b;
    System.out.println("합: " + sum);
    ```
- **설명**: 변수 연산, 출력문 활용법 익힘
- **실습 예시**: 두 수의 합, 곱 등 연산 결과 출력

### InputOutput01, InputOutput02.java
- **핵심 개념**: 출력문, 이스케이프 문자(\n, \t) 사용법
- **코드 예시**
    ```java
    System.out.println("이름: 홍길동\n나이: 20");
    System.out.println("Java\tProgramming");
    ```
- **설명**: 다양한 출력 방식, 줄바꿈/탭 문자 활용
- **실습 예시**: 자기소개, 표 형태 출력 등
- **주의사항**: 이스케이프 문자 사용 시 오타 주의

---

## 요약
- Chap02에서는 변수, 상수, 기본 자료형, 출력문, 주석 등 자바의 기초 문법을 실습하며, 각 자료형의 특징과 선언/출력 방법을 익혔습니다.

---

## 추가 학습 자료
- [Java 공식 문서: 데이터 타입](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Java 변수와 상수 개념 정리 블로그](https://coding-factory.tistory.com/251)
