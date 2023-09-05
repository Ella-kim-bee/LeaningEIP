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
    System.out.println(Static.b++); // 10 출력 후 ++
    System.out.println(st.b); // 11
    System.out.println(a); // main의 a 10
    System.out.print(st.a); // new Static이 담긴 st의 a 20
  }
}
```

> sol
- static 키워드는 static(소문자) / 여기서 Static은 Static class
- static int b=0; => main method 시작 전 생성
- answer : `10 11 10 20`

---

#### 2
> C언어 Art- println
```c
#include <stdio.h>
​
int main() {
  char a[] = "Art"; // a[] = A | r | t | NULL == a[0] a[1] a[2] a[3]
  char* p = NULL;
  p = a; // p = a => p[0] ~ p[3]
  printf("%s\n", a); // a+0 == &a[0] == a => Art
  printf("%c\n", *p); // p == a == &p[0] == &a[0] => *p == *&a[0] == a[0] => A
  printf("%c\n", *a); // a = &a[0] => *a = *&a[0] = a[0] => A
  printf("%s\n", p); // p == a == &p[0] == &a[0] => Art
  ​
  for(int i = 0; a[i] != '\0'; i++) // '\0' == NULL
    printf("%c", a[i]);
}
```
> sol
- `배열+i == &배열[i]` &배열[i]는 주소값
- answer
  ```
  Art
  A
  A
  Art
  Art
  ```
---

#### 3
```c
#include <stdio.h>
​
int main() {
  char* a = "qwer"; // a = q | w | e | r | NULL == a[0] a[1] a[2] a[3] a[4]
  char* b = "qwtety"; // b = q | w | e | t | y | NULL == b[0] b[1] b[2] b[3] b[4] b[5]
  for(int i = 0; a[i] != '\0' ; i++){
    for(int j = 0; b[j] != '\0'; j++){
      if(a[i] == b[j]) printf("%c", a[i]);
    }
  }
}
```
> sol
- answer
  ```
  qwe
  ```
---

#### 4
> **은 웹에서 JS, XML을 이용하여 비동기식으로 웹 페이지의 일부 컨텐츠만 리로드해오는 방식.
> 클라이언트 사이드에서는 JS만처리하고, 서버 사이드에서는 **만 처리하기 대문에 빠르게 처리 가능한 방식이다.
> Google Maps와 Google **에서 이러한 방식을 사용한다.

> sol
- AJAX(asynchronus Javascript and XML)
- 비동기식
- 필요한 일부 컨텐츠만 리로드
---

#### 5
> 데이터교환방식 패킷교환문제
1. 패킷 교환 방식에서 패킷이 전송되기 전에 송/수신 스테이션 간의 논리적인 통신 <u>경로를 미리 설정</u> 하는 방식
2. <u>연결 경로를 확립하지 않고</u> 각각의 패킷을 순서에 무관하게 독립적으로 전송하는 방식

> sol
- 미리 설정? 가상회선 방식(VC; Virual Circuit)
- 설정하지 않음? 데이터그램(Datagram)

- 서킷 교환
  - 전용 선(전화 a-b쓰면 c는 못써)
- 패킷 교환
  - 가상회선
    - A-패킷->B, 처음 전송된 경로 따라감
  - 데이터그램
    - A-패킷->B, 패킷마다 최적의 경로 찾음
---

#### 6
> VPN 문제, 데이터 링크 계층 프로토콜 / L2F, PPTP의 결합 형태
- VPN에서 사용되는 프로토콜 중 하나로, L2F(Layer 2 Forwarding Protocol)와 PPTP(Point-to-Point Tunneling Protocol)의 기능을 결합
- 인터넷 상에서 두 지점 간에 <u>가상의 터널</u>을 만들어 통신을 안전하게 전송하는 기술

> sol
- <u>L2</u>F + PP<u>TP</u> => L2TP
  - L2F : cisco(제조사), UDP
  - PPTP : MS(제조사), 단대단 통신(1:1)
  - PC (L2TP Client)--- INTERNET --->(L2TP Server) SERVER
  - VPN 프로토콜 종류 : L2TP, L2F, PPTP
- answer : L2TP
---

#### 7
> Port번호 22인 프로토콜
- 포트번호 22번 사용하고 인증, 암호화, 압축, 무결성 제공
- Telnet 보다 강력한 보안을 제공하는 원격접속 프로토콜

> sol
- 포트번호 22번, Telnet 보다 강력한 보안
- answer : SSH(Secure Shell)
- FTP 21 / SSH 22 / Telnet 23 / SMTP(mail) 25 / HTTP 80
---

#### 8
> 웜, 트로이목마, 바이러스
- **웜**
  - 인터넷 또는 네트워크를 통해서 컴퓨터에서 컴퓨터로 <u>스스로 전파</u>되는 악성 프로그램이다.
  - 윈도우의 취약점 또는 응용 프로그램의 취약점을 이용하거나 이메일이나 공유 폴더를 통해 전파되며, 최근에는 공유 프로그램(P2P)을 이용하여 전파되기도 한다.
  - 가장 큰 특징은 <u>자신을 복제</u>하여 네트워크 연결을 통해서 다른 컴퓨터로 스스로 전파되고 확산된다는 것이다.
​
- **트로이 목마**
  - <u>악성 루틴이 숨어 있는</u> 프로그램으로 <u>겉보기엔 정상적인 프로그램으로 보이지만, 실행하면 악성 코드를 실행</u>하는 프로그램이다
  - 자기 복제를 하지 않으며 다른 파일을 감염시키거나 변경시키지 않지만, 해당 프로그램이 포함된 프로그램이 실행되는 순간, 시스템은 공격자에게 시스템을 통제할 수 있는 권한을 부여하게 된다.
​
- **바이러스**
  - 사용자 컴퓨터(네트워크로 공유된 컴퓨터 포함) 내에서 사용자 몰래 프로그램이나 실행 가능한 부분을 <u>변형해 자신 또는 자신의 변형을 복사</u>하는 프로그램이다.
  - 가장 큰 특성은 복제와 감염이다. 다른 네트워크의 컴퓨터로 <u>스스로 전파되지는 않는다.</u>
---

#### 9
> int 형태로 표현된 이진수 101110를 int 형태의 십진수로 변환하는 코드에 관한 문제. 문제가 출제된 영역은 이진수를 2또는 10으로 나눈 나머지만 취하여 변수 sum에 합하는 방식으로 구현되어 있었음.

```c
int main() {
  int input = 101110;
  int di = 1;
  int sum = 0;
​
  while (1) { // 0이 아니면 무조건 참
    if (input == 0) break // 0이면 반복문 탈출
    else {
      sum = sum + (input ⓐ ⓑ) * di; // 맨 뒷자리 사용하도록
      di = di * 2; // 2의 n제곱
      input = input / 10; // 맨 뒷자리 제거
    }
    ​printf("%d", sum);
    return 0;
  }
}
```
> sol
- 101110 => (1 * 2<sup>5</sup>) + (0 * 2<sup>4</sup>) + (1 * 2<sup>3</sup>) + (1 * 2<sup>2</sup>) + (1 * 2<sup>1</sup>) + (0 * 2<sup>0</sup>) => `di = di * 2`
- `input = input / 10` => 맨 뒷자리 사라짐
- `(input ⓐ ⓑ) * di` => 맨 뒷자리를 사용하는 시점 => `int input = 101110` 이진수이지만 10진수로 저장됨 => `(input % 10) * id`
- answer : % 10
---

#### 10
> IP 동작 과정에서 전송 오류가 발생하는 경우, 오류 정보를 전송하는 목적으로 사용하는 프로토콜로, <u>Ping-of-Death(PoD)</u>에서 사용하는 것

> sol
- ping? 실제 서버나 PC가 살아있는지 확인할 대 쓰는 명령어
- A - ping -> B - pong -> A
- ping에서 쓰는 프로토콜이 ICMP
- Ping-of-Death? ICMP 패킷을 엄청 크게 보내는 공격
- answer : ICMP
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
