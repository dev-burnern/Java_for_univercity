# Chap06 배열(Array)과 활용

이 문서는 Chap06(배열과 활용)을 정리한 문서입니다.

---

## 📑 목차
1. [핵심 개념 요약](#핵심-개념-요약)
2. [요약](#요약)

---

## 핵심 개념 요약

| 개념         | 설명                                                         | 예시 코드/설명                |
|--------------|--------------------------------------------------------------|-------------------------------|
| 1차원 배열   | 같은 타입의 데이터를 연속적으로 저장하는 자료구조             | `int[] arr = new int[5];`     |
| 2차원 배열   | 배열의 배열(행과 열)로, 표 형태의 데이터 저장                 | `int[][] arr = new int[3][4];`|
| 배열의 초기화| 배열 선언과 동시에 값 할당                                    | `int[] arr = {1,2,3};`        |
| 배열 순회    | for, for-each문으로 배열의 모든 요소 접근                    | `for(int i=0;i<arr.length;i++)`|
| String 배열  | 문자열을 저장하는 배열                                        | `String[] s = new String[3];`  |
| 참조 비교    | 객체(문자열 등) 비교 시 ==와 equals()의 차이                 | `s1 == s2`, `s1.equals(s2)`    |

---

### 1차원 배열
- 같은 타입의 데이터를 연속적으로 저장하며, 인덱스로 각 요소에 접근합니다.
- 예시 코드:
    ```java
    int[] arr = new int[5];
    arr[0] = 10;
    System.out.println(arr[0]); // 10
    ```

### 2차원 배열
- 행과 열로 구성된 배열로, 표 형태의 데이터를 저장할 때 사용합니다.
- 예시 코드:
    ```java
    int[][] arr = new int[3][4];
    arr[0][0] = 1;
    System.out.println(arr[0][0]); // 1
    ```

### 배열의 초기화
- 배열 선언과 동시에 값을 할당할 수 있습니다.
- 예시 코드:
    ```java
    int[] arr = {1, 2, 3, 4, 5};
    ```

### 배열 순회
- for문 또는 for-each문을 사용해 배열의 모든 요소에 접근할 수 있습니다.
- 예시 코드:
    ```java
    int[] arr = {1, 2, 3};
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    // for-each
    for (int n : arr) {
        System.out.println(n);
    }
    ```

### String 배열
- 문자열을 저장하는 배열로, 각 요소는 String 객체입니다.
- 예시 코드:
    ```java
    String[] s = new String[3];
    s[0] = "Java";
    System.out.println(s[0]); // Java
    ```

### 참조 비교 (== vs equals)
- 객체(특히 String) 비교 시 ==는 참조(주소) 비교, equals()는 값 비교입니다.
- 예시 코드:
    ```java
    String s1 = new String("Java");
    String s2 = new String("Java");
    System.out.println(s1 == s2); // false (참조 다름)
    System.out.println(s1.equals(s2)); // true (값 같음)
    ```
- 주의사항: 문자열 등 객체 비교는 항상 equals()를 사용해야 합니다.

---

## 요약
- Chap06에서는 1차원/2차원 배열의 선언, 초기화, 순회, String 배열, 참조 비교 등 배열의 기초와 활용법을 실습하며, 배열을 이용한 데이터 저장과 처리 방법을 익혔습니다.

---

