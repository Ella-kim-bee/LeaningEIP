### 트랜잭션 특성ACID
  - 원자성, 일관성, 독립성, 영속성
  - Atomicity, Consistency, Isolation, Durability
  - 트랜잭션: 논리적 작업 단위
    - 원자성 : 트랜잭션 성공 or 실패, 기면기고 아니면 아님, All or Nothing
    - 일관성 : 트랜잭션 수행 전과 후가 같음, 계속 빈 값이거나 계속 데이터가 있거나
    - 독립성 : 트랜잭션이 다른 트랜잭션으로부터 독립, 작업 중 간섭 받지 않음
    - 영속성 : 트랜잭션 수행하면 기록에 남겨야함.
---

### DB 삽삭갱
- 트리거 Trigger: 이벤트 발생할 때마다 자동 수행
  - `CREATE TRIGGER ~`
  - 생성 후 자동 실행
  - `COMMIT / ROLLBACK` 불가능
- 프로시저 Procedure: SQL문 실행할 수 있는 코드 집합, 직접 호출
  - `CREATE PROCEDURE ~`
  - `EXCUTE / EXEC 프로시저명;`
  - `COMMIT / ROLLBACK` 가능
  - 리턴값 없음
- 사용자 정의함수
  - 리턴값 존재
---

### SQL 작성
  ```sql
    INSERT INTO 학생 VALUES (20230821, '지기', 3, '컴퓨터공학', '010-123-1234');
  ```
  ```sql
    SELCET COUNT(*) CNT FROM A CORSS JOIN B WHERE A.NICKNAME LIKE B.RULE;
    -- CORSS JOIN 모든 경우의 수 A-1 B-1/ A-1 B-2/ A-2 B-1/ A-2 B-2
  ```
  ```sql
    SELCET a.코드, a.영화명, b.관객수 FROM 영화 a LEFT JOIN 관객수 b ON a.코드 = b.코드;
    -- LEFT JOIN: a 기준, RIGHT JOIN: b 기준
    -- LEFT JOIN: b에 없어도 a 기준으로 만들고 b 컬럼 내용을 빈 칸
  ```
  ```sql
    SELCET COUNT(*)
      FROM A
      WHERE EXISTS(SELECT * FROM B WHERE B.col1 = 'x');
    -- EXISTS: 값의 존재 여부를 확인하는 조건, 1개라도 있으면 참(서브쿼리만 사용 가능)
    -- EXISTS(참) SELCET COUNT(*) FROM A
    -- EXISTS(거짓) 없음
  ```
---

### 카디널리티Cardinality / 디그리Degree
- (ㅡ) 튜플, 카디널리티
- (ㅣ) 속성, 차수, degree
---

### 다중 행 비교 연산자
- IN, ALL, ANY, EXISTS
  - IN : 임의의 값과 동일한 조건 `COL IN (조건)`
  - ALL : 모든 값을 만족하는 조건
    `단가 > ALL(조건) 조건이 10만, 100만 일 경우 100만보다 크면 참`
    `단가 <= ALL(조건) 조건이 30, 50 일 경우 30보다 작으면 참`
  - ANY : 어느 하나의 값이라도 만족하는 조건
    `단가 <= ALL(조건) 조건이 30, 50 일 경우 50보다 작으면 참`
  - EXISTS : 값의 존재 여부를 확인하는 조건(서브쿼리만 사용 가능)
---

### DISTINCT
- 중복제거
---

### 함수 종속
  - 하나의 테이블에서 두 개의 속성 집합 간의 제약
  - 속성집합 `x={사번}` `y={이름, 직급}`
  - `x -> y` x에 따라서 y가 유일하게 결정 됨, x가 y를 결정
  - x: 결정자Determinet, y: 종속자Dependent
---