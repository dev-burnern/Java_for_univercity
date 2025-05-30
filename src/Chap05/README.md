# Chap05 메서드와 오버로딩

이 문서는 Chap05(메서드와 오버로딩)를 정리한 문서입니다.

---

## 📑 목차
1. [핵심 개념 요약](#핵심-개념-요약)
2. [요약](#요약)

---

## 핵심 개념 요약

| 개념         | 설명                                                         | 예시 코드/설명                |
|--------------|--------------------------------------------------------------|-------------------------------|
| 메서드(함수) | 특정 기능을 수행하는 코드 블록, 코드 재사용/가독성 향상      | `int sum(int a, int b)`       |
| 반환값       | 메서드 실행 결과로 돌려주는 값, void는 반환값 없음           | `return a + b;`, `void`       |
| 매개변수     | 메서드에 전달하는 입력값                                      | `int sum(int a, int b)`       |
| 오버로딩     | 같은 이름, 다른 매개변수/타입의 메서드 여러 개 정의           | `sum(int, int)`, `sum(double, double)` |
| static/인스턴스 | static: 클래스명.메서드명(), 인스턴스: 객체명.메서드명()   | `Math.abs(-1)`, `obj.method()` |

---

### 메서드(함수)
- 특정 기능을 수행하는 코드 블록으로, 코드의 재사용성과 가독성을 높여줍니다.
- 메서드는 입력값(매개변수)을 받아 처리하고, 결과값(반환값)을 돌려줄 수 있습니다.
- 예시 코드:
    ```java
    public static int add(int a, int b) {
        return a + b;
    }
    int result = add(3, 5); // 8
    ```

### 반환값과 void
- 반환값이 있으면 return문으로 값을 반환하고, 반환값이 없으면 반환타입을 void로 지정합니다.
- 예시 코드:
    ```java
    public static void printHello() {
        System.out.println("Hello");
    }
    printHello();
    ```

### 매개변수(Parameter)
- 메서드에 전달하는 입력값으로, 여러 개의 매개변수를 사용할 수 있습니다.
- 예시 코드:
    ```java
    public static int multiply(int x, int y) {
        return x * y;
    }
    System.out.println(multiply(2, 3)); // 6
    ```

### 메서드 오버로딩(Overloading)
- 같은 이름의 메서드를 매개변수의 타입, 개수로 여러 개 정의할 수 있습니다.
- 자바는 호출 시 인자의 타입과 개수에 따라 적절한 메서드를 자동 선택합니다.
- 예시 코드:
    ```java
    public static int sum(int x, int y) { return x + y; }
    public static int sum(int x, int y, int z) { return x + y + z; }
    public static double sum(double x, double y) { return x + y; }
    System.out.println(sum(10, 20));      // 30
    System.out.println(sum(10, 20, 30));  // 60
    System.out.println(sum(10.5, 20.5));  // 31.0
    ```
- 주의사항: 오버로딩 시 매개변수 타입/개수로 구분해야 하며, 반환타입만 다르면 오버로딩이 되지 않습니다.

### static 메서드와 인스턴스 메서드
- static 메서드는 클래스명.메서드명()으로 바로 호출 가능하며, 인스턴스 메서드는 객체를 생성한 후 객체명.메서드명()으로 호출합니다.
- 예시 코드:
    ```java
    class MyClass {
        public static void staticMethod() {
            System.out.println("static method");
        }
        public void instanceMethod() {
            System.out.println("instance method");
        }
    }
    MyClass.staticMethod(); // static method
    MyClass obj = new MyClass();
    obj.instanceMethod();   // instance method
    ```

---

## 요약
- Chap05에서는 메서드의 정의/호출, 반환값, 매개변수, 오버로딩, static/인스턴스 메서드 등 자바 함수의 구조와 활용법을 실습하며, 코드 재사용성과 유지보수성을 높이는 방법을 익혔습니다.

---
