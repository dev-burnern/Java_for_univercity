# Chap05 메서드(함수)와 오버로딩 개념 정리

## 1. 메서드(함수)란?
- 특정 기능을 수행하는 코드 블록으로, 코드의 재사용성과 가독성을 높여줌
- 메서드는 입력값(매개변수)을 받아 처리하고, 결과값(반환값)을 돌려줄 수 있음

### 메서드 기본 구조
```java
[접근제어자] [static] 반환타입 메서드이름(매개변수) {
    // 실행 코드
    return 반환값;
}
```

## 2. 메서드의 선언과 호출
- 선언: 메서드의 이름, 매개변수, 반환타입을 정의
- 호출: 메서드 이름과 인자를 사용해 실행

### 예시
```java
public static int add(int a, int b) {
    return a + b;
}

int result = add(3, 5); // 호출 예시
```

## 3. 반환값과 void
- 반환값이 있으면 return문으로 값을 반환
- 반환값이 없으면 반환타입을 void로 지정

### 예시
```java
public static void printHello() {
    System.out.println("Hello");
}
```

## 4. 매개변수(Parameter)
- 메서드에 전달하는 입력값
- 여러 개의 매개변수를 사용할 수 있음

## 5. 메서드 오버로딩(Overloading)
- 같은 이름의 메서드를 매개변수의 타입, 개수로 여러 개 정의할 수 있음
- 자바는 호출 시 인자의 타입과 개수에 따라 적절한 메서드를 자동 선택

### 오버로딩 예시
```java
public static int sum(int x, int y) {
    return x + y;
}
public static int sum(int x, int y, int z) {
    return x + y + z;
}
public static double sum(double x, double y) {
    return x + y;
}

// 호출 예시
System.out.println(sum(10, 20));      // 30
System.out.println(sum(10, 20, 30));  // 60
System.out.println(sum(10.5, 20.5));  // 31.0
```

## 6. 반환값/매개변수 없는 메서드 예시
```java
public static void greet() {
    System.out.println("안녕하세요!");
}

greet(); // 출력: 안녕하세요!
```

## 7. static 메서드와 인스턴스 메서드
- **static 메서드**: 클래스명.메서드명()으로 바로 호출 가능
- **인스턴스 메서드**: 객체를 생성한 후 객체명.메서드명()으로 호출

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

## 8. 메서드의 장점과 실무 활용 예시
- 코드의 재사용성, 유지보수성, 가독성 향상
- 실무에서 입력값 검증, 데이터 처리, 반복 작업 등 다양한 기능을 메서드로 분리하여 사용

## 9. 오버로딩의 실제 활용 상황
- 다양한 입력에 따라 같은 동작을 여러 방식으로 처리할 때 유용
- 예: 덧셈, 출력, 데이터 변환 등 다양한 타입/개수의 입력을 처리할 때

---