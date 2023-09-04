### 생성자 호출 순서
  - 자바 생성자 호출 순서(유교)
    - 자식 클래스 생성 -> 부모 클래스 생성자 -> 자식 클래스 생성자
    ```java
      new Gisa();

      interface Book {
        void make(); // make라는 method가 있을 것 이다(틀)
      }

      class Gisa implements Book{
        Gisa(){} // 생성자(class랑 이름 동일), new로 생성될 때 무조건 호출
        pubic void make(){} // method
      }
    ```
  - 파이썬 생성자(개인주의)
    - 자식 클래스 생성 -> 자식 클래스 생성자
---

### 매개변수 유무에 따라 생성자 찾아감
  - java에서 시작점은 main(){} method 시작
  - class B extends A => B는 A를 상속 받음
  - super 상위 클래스 생성자 호출
  ```java
    class A{
      A(){}
      A(String s){
        this.s // this는 각 class에서 사용
      }
      public void fn(){} // A.fn()
    }
    class B extends A{
      B(){}
      B(String s){
        super()
        this.s // this는 각 class에서 사용
      }
      public void fn(){} // B.fn()
      // public void fn(){}가 없는 상태에서 B.fn()을 할 경우 A overriding 하기 때문에 A.fn() 호출
    }

    class Soojebi{
      public static void main(String args[]){
        new B("soojebi")
      }
    }
    /**
     1. main -> new B("soojebi") 생성자 호출
     2. class B -> B(String s){}
     3. super() -> class A -> A(String s){}
      3-1. super() 없을 경우 -> class A -> A(){}
     4. B(String s){} 나머지 실행
     */
  ```
---

### JAVA null
---

### python
  ```python
    for i in rage(1):
      print('p')
    # range(시작:종료:스텝)
    # 시작: 생략 가능, 생략 시 0
    # 스텝: 생략 가능, 생략 시 1
  ```

  ```python
    range(1:5:2)
    # => 1 2 3 4 까지 1, 3
  ```
---