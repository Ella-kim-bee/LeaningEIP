#### 1
> 스태틱 변수 b , 변수 a 정수
```java
class Static{
  public int a = 20;
  static int b = 0;
}
public class Main {
  public static void main(String[] args) {
    int a;
    a = 10;
    Static.b = a;
    Static st = new Static();
    System.out.println(Static.b++);
    System.out.println(st.b);
    System.out.println(a);
    System.out.print(st.a);
  }
}
```

> sol

---

#### 2
> C언어 Art- println
```c
#include <stdio.h>
​
int main() {
  char a[] = "Art";
  char* p = NULL;
  p = a;
  printf("%s\n", a);
  printf("%c\n", *p);
  printf("%c\n", *a);
  printf("%s\n", p);
  ​
  for(int i = 0; a[i] != '\0'; i++)
    printf("%c", a[i]);
}
```
---

#### 3
```c
#include <stdio.h>
​
int main() {
  char* a = "qwer";
  char* b = "qwtety";
  for(int i = 0; a[i] != '\0' ; i++){
    for(int j = 0; b[j] != '\0'; j++){
      if(a[i] == b[j]) printf("%c", a[i]);
    }
  }
}
```
---

#### 4
> 웹에서 JS, XML을 이용하여 비동기식으로 웹 페이지의 일부 컨텐츠만 리로드해오는 방식. 클라이언트 사이드에서는 JS만처리하고, 서버 사이드에서는 **만 처리하기 대문에 빠르게 처리 가능한 방식이다.Google Maps와 Google **에서 이러한 방식을 사용한다.
---

#### 5
> 데이터교환방식 패킷교환문제
---

#### 6
> VPN 문제, 데이터 링크 계층 프로토콜
L2F, PPTP의 결합 형태
---

#### 7
> Port번호 22인 프로토콜
---

#### 8
> 웜, 트로이목마, 바이러스
- 웜
  - 인터넷 또는 네트워크를 통해서 컴퓨터에서 컴퓨터로 전파되는 악성 프로그램이다.
  - 윈도우의 취약점 또는 응용 프로그램의 취약점을 이용하거나 이메일이나 공유 폴더를 통해 전파되며, 최근에는 공유 프로그램(P2P)을 이용하여 전파되기도 한다.
  - 네트워크에 존재하는 다른 컴퓨터로 스스로 전파되는 특성이 있다.
​
- 트로이 목마
  - 컴퓨터에 직접적인 피해를 주지는 않지만, 악의적인 공격자가 컴퓨터에 침투하여 사용자의 컴퓨터를 조종할 수 있는 프로그램이다.
  - 고의적으로 만들어졌다는 점에서 프로그래머의 실수인 버그와는 다르다.
  - 사용자가 의도치 않은 코드를 포함하여 (어쩌고저쩌고.. '의도치 않은 코드'에 관한 설명이 두번째 문단 마지막 줄에 명시되어 있었음.)
​
- 바이러스
  - 사용자 컴퓨터(네트워크로 공유된 컴퓨터 포함) 내에서 사용자 몰래 프로그램이나 실행 가능한 부분을 변형해 자신 또는 자신의 변형을 복사하는 프로그램이다.
  - 가장 큰 특성은 복제와 감염이다. 다른 네트워크의 컴퓨터로 스스로 전파되지는 않는다.
---

#### 9
> int 형태로 표현된 이진수 101110를 int 형태의 십진수로 변환하는 코드에 관한 문제. 문제가 출제된 영역은 이진수를 2또는 10으로 나눈 나머지만 취하여 변수 sum에 합하는 방식으로 구현되어 있었음.

```c
int main() {
  int input = 101110;
  int di = 1;
  int sum = 0;
​
  while (1) {
    if (input == 0) break
    else {
      sum = sum + (input ⓐ ⓑ) * di;
      di = di * 2;
      input = input / 10;
    }
    ​printf("%d", sum);
    return 0;
  }
}
```
---

#### 10
> ping 찍을 때테스트 메시지, 오류 등을 담아 보내고, reach에 실패할 경우 이에 대한 정보를 가지고 송신 단으로 돌아오는 방식의 프로토콜. Ping-of-Death에서 사용하는 것
---

#### 11
> 디자인 패턴문제
보기에 생성(Builder, Singleton, Abstract Factory?)
구조(Bridge, Decorater, Facade, Proxy ..)
행위(Observer, Moderator, Visitor.. ) 일부가 주어지고 밑에 설명 3~4개 있었음
​
객체의 대리자를 이용하여 원래 객체의 작업을 대신 처리하는 디자인 패턴
---

#### 12
> 튜플, 릴레이션 인스턴스, 카디널리티
---

#### 13
> [학생] 릴레이션에서 학생 이름(컬럼 명)이'민수'인 튜플을 삭제하는 쿼리를 작성하여라 (sql delete 문제)
---

#### 14
> 버블정렬문제(변수로 작성)
```c
void swap(int[] a, int idx1, int idx2){
  int t = idx1;
  a[idx1] = a[idx2];
  a[1번] = t;
}
void Usort(int[] a, int len){
  버블정렬 코드
}
​
int main(){
  int nx = 5;
  ....
  Usort(a, 2번문제);
}
```
---

#### 15
```python
a = {'한국', '중국', '일본'}
a.add('베트남')
a.add('중국')
a.remove('일본')
a.update({'홍콩', '한국', '태국'})

print(a)
```
---

#### 16
> sql문제 group by사용
(조건: where사용하지 말 것. 세미콜론 생락가능,
group by와 having사용. 집계함수 사용
)
---

#### 17
```java
Java car, vehicle 상속
abstact class Vehicle {
  String name;
  abstract public String getName(String val);
  ​
  public String getName() {
    return "Vehicle name: " + name;
  }
}
​
class Car extends Vehicle {
  public Car(String val) {
    name=super.name=val;
  }
  public String getName(String val) {
    return "Car name:" + val;
  }
  public String getName(byte val[]) {
    return "Car name:" + val;
  }
}
​
public class Test {
  public static void main(String[] args) {
    Vehicle obj = new Car("Spark");
    System.out.println(obj.getName());
  }
}
```
---

#### 18
> 외부 개념 내부스키마
---

#### 19
> 화이트박스문제 (분기 커버리지)
---

#### 20
```java
JAVA get x
class Parent {
  int x = 100;
  ​
  Parent() {
    this(500);
  }
  Parent(int x) {
    this.x = x;
  }
  int getX() {
    return x;
  }
}
class Child extends Parent {
  int x = 4000;

  Child() {
    this(5000);
  }
  Child(int x) {
    this.x = x;
  }
}
​
public class Main {
  public static void main(String[] args) {
    Child obj = new Child();
    System.out.println(obj.getX());
  }
}
```
---
