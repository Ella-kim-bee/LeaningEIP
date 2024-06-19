public class Connection {
    // 유일한 인스턴스를 저장할 private static 변수
    private static Connection _inst = null;
    // 카운터 변수
    private int count = 0;

    // private 생성자, 외부에서 인스턴스 생성을 막음
    private Connection() {}

    // Singleton 인스턴스를 얻기 위한 public static 메소드
    public static Connection getInstance() {
        if (_inst == null) {
            _inst = new Connection();
        }
        return _inst;
    }

    // 카운터를 증가시키는 메소드
    public void incrementCount() {
        count++;
    }

    // 현재 카운터 값을 반환하는 메소드
    public int getCount() {
        return count;
    }

    // 메인 메소드, 테스트용
    public static void main(String[] args) {
        // Singleton 인스턴스를 가져와서 카운터 증가
        Connection conn1 = Connection.getInstance();
        conn1.incrementCount();

        // Singleton 인스턴스를 가져와서 카운터 증가
        Connection conn2 = Connection.getInstance();
        conn2.incrementCount();

        // Singleton 인스턴스를 가져와서 카운터 증가
        Connection conn3 = Connection.getInstance();
        conn3.incrementCount();

        // 첫 번째 참조를 사용하여 카운터 다시 증가
        conn1.incrementCount();

        // 카운터 값 출력
        System.out.println(conn1.getCount()); // 출력은 4
    }
}

{/*

    1. Singleton 패턴:
    - private static 변수 _inst는 클래스의 유일한 인스턴스를 저장합니다.
    - private 생성자는 외부에서 클래스의 인스턴스를 생성하지 못하도록 합니다.
    - public static 메소드 getInstance()는 유일한 인스턴스를 반환하며, 인스턴스가 없으면 생성합니다.

    2. 카운터 메커니즘:
    - private 인스턴스 변수 count는 카운터 값을 저장합니다.
    - incrementCount() 메소드는 count를 1씩 증가시킵니다.
    - getCount() 메소드는 현재 count 값을 반환합니다.

    3. 사용법:
    - main 메소드는 Connection 클래스를 사용하는 예를 보여줍니다. 각 getInstance() 호출은 같은 Connection 인스턴스를 반환하므로, incrementCount()를 호출할 때마다 동일한 객체의 count가 증가합니다.

 */}

 {/*
    1. 클래스(Class): 객체를 정의하는 설계도 또는 청사진.
    2. 인스턴스(Instance): 클래스를 바탕으로 실제 메모리에 생성된 객체.

    즉, 클래스는 개념이고, 인스턴스는 그 개념의 실제 구현체입니다.
    클래스를 정의한 후, 그 클래스를 기반으로 여러 인스턴스를 만들 수 있습니다.
    인스턴스는 클래스의 속성(필드)과 메소드(동작)를 실제로 가지고 있으며, 이를 통해 프로그램에서 구체적인 작업을 수행할 수 있습니다.

  */}