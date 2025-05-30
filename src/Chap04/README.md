# Chap04 반복문과 제어문

이 문서는 Chap04(반복문과 제어문)를 정리한 문서입니다.

---

## 📑 목차
1. [핵심 개념 요약](#핵심-개념-요약)
2. [요약](#요약)

---

## 핵심 개념 요약

| 개념         | 설명                                                         | 예시 코드/설명                |
|--------------|--------------------------------------------------------------|-------------------------------|
| for문        | 반복 횟수가 명확할 때 사용                                   | `for (int i=0; i<5; i++)`     |
| while문      | 조건이 참인 동안 반복                                        | `while (조건)`                |
| do-while문   | 최소 1회 실행, 조건이 나중에 검사됨                          | `do { ... } while (조건);`    |
| break        | 반복문 즉시 종료                                             | `if (조건) break;`            |
| continue     | 현재 반복만 건너뛰고 다음 반복 진행                          | `if (조건) continue;`         |
| if문         | 조건에 따라 분기 실행                                        | `if (조건) { ... }`           |
| switch문     | 여러 값 중 하나 선택                                         | `switch (변수) { ... }`       |
| 중첩 반복문  | 반복문 안에 반복문 사용                                      | `for() { for() { ... } }`     |

---

### for문
- 반복 횟수가 명확할 때 사용하며, 초기화, 조건, 증감식으로 구성됩니다.
- 예시 코드:
    ```java
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }
    // 출력: 0 1 2 3 4
    ```

### while문
- 조건이 참인 동안 반복하며, 반복 횟수가 불명확할 때 주로 사용합니다.
- 예시 코드:
    ```java
    int i = 1;
    while (i <= 5) {
        System.out.println(i);
        i++;
    }
    // 출력: 1 2 3 4 5
    ```

### do-while문
- 본문을 최소 1회 실행한 후 조건을 검사합니다.
- 예시 코드:
    ```java
    int i = 1;
    do {
        System.out.println(i);
        i++;
    } while (i <= 5);
    // 출력: 1 2 3 4 5
    ```

### break
- 반복문을 즉시 종료합니다. 가장 가까운 반복문에만 적용됩니다.
- 예시 코드:
    ```java
    for (int i = 1; i <= 5; i++) {
        if (i == 3) break;
        System.out.println(i);
    }
    // 출력: 1 2
    ```

### continue
- 현재 반복만 건너뛰고 다음 반복을 진행합니다.
- 예시 코드:
    ```java
    for (int i = 1; i <= 5; i++) {
        if (i == 3) continue;
        System.out.println(i);
    }
    // 출력: 1 2 4 5
    ```

### if문
- 조건에 따라 분기 실행을 합니다.
- 예시 코드:
    ```java
    int score = 85;
    if (score >= 90) {
        System.out.println("A");
    } else if (score >= 80) {
        System.out.println("B");
    } else {
        System.out.println("C");
    }
    ```

### switch문
- 여러 값 중 하나를 선택할 때 사용합니다.
- 예시 코드:
    ```java
    int n = 2;
    switch (n) {
        case 1: System.out.println("one"); break;
        case 2: System.out.println("two"); break;
        default: System.out.println("other");
    }
    ```
- 주의사항: break를 누락하면 다음 case로 넘어가는 fall-through 현상이 발생할 수 있습니다.

### 중첩 반복문
- 반복문 안에 또 다른 반복문을 작성할 수 있습니다. 2차원 배열, 구구단 등에서 자주 사용됩니다.
- 예시 코드:
    ```java
    for (int i = 2; i <= 4; i++) {
        for (int j = 1; j <= 9; j++) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }
    // 2~4단 구구단 출력
    ```
- 주의사항: break/continue는 가장 가까운 반복문에만 적용됩니다.

---

## 요약
- Chap04에서는 반복문(for, while, do-while), break/continue, 조건문(if, switch), 중첩 반복문 등 자바의 제어문 구조와 동작 원리를 실습하며, 다양한 반복/분기 패턴을 익혔습니다.

---

