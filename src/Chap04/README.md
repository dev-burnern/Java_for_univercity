# Chap04 반복문과 제어문 개념 및 예제 정리

## 1. 반복문과 변수/출력문 기초
- **변수(Variable)**: 데이터를 저장하는 공간, 값 변경 가능
- **상수(Constant)**: 한 번 값이 정해지면 변경 불가 (`final` 사용)
- **출력문**: `System.out.println()`, `System.out.print()` 등
- **주석**: // 한 줄, /* 여러 줄 */ 사용

## 2. 반복문 종류 및 예제
| 반복문 종류 | 사용 예 | 특징 |
|---|---|---|
| for | 반복 횟수 명확 | 초기화, 조건, 증감식 포함 |
| while | 조건 반복 | 조건이 참인 동안 반복 |
| do-while | 최소 1회 반복 | 본문 먼저 실행, 조건 나중 검사 |

### for문 예제
```java
for (int i = 0; i < 10; i++) {
    if (i == 5)
        break;
    System.out.println("i : " + i); // i가 5가 되기 전까지 출력
}
// 출력: i : 0 ~ i : 4
```

### while문 예제
```java
int i = 1;
while (i <= 10) {
    System.out.print(i + " ");
    i++;
}
// 출력: 1 2 3 4 5 6 7 8 9 10
```

### do-while문 예제
```java
int i = 1;
do {
    System.out.println("Hello, World!");
    i++;
} while (i < 6);
// 출력: Hello, World! (5회)
```

## 3. break와 continue
- **break**: 반복문 즉시 종료 (가장 가까운 반복문만)
- **continue**: 현재 반복을 건너뛰고 다음 반복 진행

### break 예제
```java
for (int n = 1; n <= 5; n++) {
    System.out.println("*");
    if (n == 2) {
        break;
    }
}
// 출력: * (2회)
```

### continue 예제
```java
for (int i = 0; i <= 10; i++) {
    if (i == 3 || i == 6 || i == 9) {
        continue;
    }
    System.out.print(i + " ");
// 출력: 0 1 2 4 5 7 8 10
```

## 4. 중첩 반복문
```java
for (int i = 2; i <= 4; i++) {
    System.out.println("구구단 " + i + " 단");
    for (int j = 1; j <= 10; j++) {
        System.out.println(i + " * " + j + " = " + (i * j));
    }
}
// 출력: 2~4단 구구단
```

### 중첩 반복문 + continue 예제
```java
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == 3 && j == 2) {
            continue;
        }
        System.out.println(i + " * " + j);
    }
}
```

## 5. while문과 do-while문의 차이
- while: 조건 먼저 검사, 조건이 거짓이면 한 번도 실행 안 할 수 있음
- do-while: 본문 먼저 실행, 조건이 거짓이어도 최소 1회 실행

## 6. 반복문 선택 기준
- 반복 횟수 명확: for문
- 반복 조건 명확: while문
- 최소 1회 실행 필요: do-while문

## 7. break/continue의 중첩 반복문에서의 동작
- break/continue는 가장 가까운 반복문에만 영향
- 바깥 반복문을 종료/건너뛰려면 추가 제어 필요

## 8. 실무 활용 예시
- 반복문: 데이터 검색, 집계, 조건부 처리 등
- break/continue: 검색 조기 종료, 특정 조건 건너뛰기 등

---