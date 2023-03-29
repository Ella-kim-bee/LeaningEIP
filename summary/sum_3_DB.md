### [ 데이터베이스 구축 ]

### 1.  SQL 응용
  1. 절차형 SQL 종류
   - 트리거 Trigger
     - db 시스템에서 삽입, 갱신, 삭제 등의 이벤트가 발생할 때마다 관련 작업이 자동으로 수행
     - 절차형 SQL
     - 사용자가 직접 호출하는 것이 아닌 DBMS에서 자동적으로 호출
   - 사용자 정의 함수 User-Defined Function
     - 절차형 SQL 활용하여 일련의 연산 처리 결과를 단일 값으로 반환할 수 있는 함수
   - 프로시저 Procedure
     - 일련의 쿼리들을 마치 하나의 함수처럼 실행하기 위한 쿼리의 집합
  2. SQL 문법
   - 데이터 정의 DDL
     - 데이터 정의, 테이블이나 관계의 구조 생성
     - CREATE, ALTER, DROP, TRUNCATE
   - 데이터 조작어 DML
     - db 저장된 자료들을 입력, 수정, 삭제, 조회
     - SELECT(질의어 Query), INSERT, UPDATE, DELETE
   - 데이터 제어어 DCL
     - db 관리자가 보안, 무결성 유지, 병행 제어, 회복
     - GRANT, REVOKE
  3. WHERE 조건
   - 비교, 범위, 집합, 패턴, NULL, 복합 조건
   - 비교 = <> < ≤ > ≥
   - 범위 BETWEEN(AND와 함께 사용             )
   - 집합 IN NOT IN
   - 패턴 LIKE
     - 와일드문자(여러 대상을 한꺼번에 지정할 목적으로 사용하는 기호)
     - +' 문자열 연결
     - % 0개 이상의 문자열과 일치
     - [  ] 1개 문자와 일치
     - [ ^ ] 1개 문자와 불일치
     - _ 특정 위치 1개 문자와 일치
   - NULL IS NULL, IS NOT NULL
   - 복합조건 AND OR NOT
  4. 데이터 조작어 DML
   - Data Maipulation Language
   - 입력INSERT 수정UPDATE 삭제DELETE 조회SELECT
   - SELECT 명령어
     - SELECT 성명, 연락처 FROM 학생 WHERE 학년 = 6 AND 수강과목 = “음악”;
     ⇒ 학생 테이블에서 6학년이고 음악을 수강하는 학생의 성명과 연락처 검색
     - DISTINCT 첫 번째 한 개만 검색
     - GROP BY 속성 값을 그룹으로 분류, HAVING 그룹에 대한 조건
     - ORDER BY 속성 값 정렬, ASC 오름차순 DESC 내림차순
   - INSWER 명령어
     - INSERT INTO 학생(학번, 성명, 학년, 수강과목)
     VALUES(6677, ‘장길산’, 3, ‘수학’);
     ⇒ 학생 테이블에서 학번이 6677, 장길산, 3학년, 수학인 학생을 삽입
     - INTO 속성, 데이터 개수, 타입이 일치해야 함
     - VALUES 속성 명 생략 가능
   - UPDATE 명령어
     - UPDATE 학생
     SET 주소 = ‘인천’
     WHERE 이름 = ‘장길산’;
     ⇒ 학생 테이블에 장길산의 주소를 인천으로 수정
   - DELETE 명령어
     - DELETE FROM 학생
     WHERE 이름 = ‘장길산’
     ⇒ 학생 테이블에 장길산에 대한 튜플을 삭제
     - 모든 레코드를 삭제할 때는 WHERE절 없이 DELETE만사용
     - 레코드를 삭제해도 테이블 구조는 남아 있어 디스크에서 테이블을 완전히 삭제하는 DROP 명령과는 다름
  5. 데이터 제어어 DCL
   - Data Control Language
   - 데이터 제어어 기능
     - *보무병회*
     - 데이터 보안, 무결성, 병행수행 제어, 회복
   - GRANT 사용 권한 부여
     - GRANT UPDTAE ON 학생 TO 장길산;
     ⇒ 관리자가 장길산에게 학생 테이블을 수정할 수 있는 권한 부여
     - GRANT SELECT ON 학생 TO 장길산 WITH GRANT OPTION;
     ⇒ 관리자가 장길산에게 학생 테이블을 조회할 수 있는 권한과, 그 권한을 다른 사용자에게 부여할 수 있는 권한을 부여
     - 시스템 권한 : GRANT 권한 TO 사용자
     - 객체 권한 : GRANT 권한 ON 테이블 TO 사용자
   - REVOKE 권한 취소
     - REVOKE UPDATE ON 학생 FROM 장길산;
     ⇒ 관리자가 장길산에게 학생 테이블 수정할 수 있는 권한 회수
     - REVOKE SELECT ON 학생 FROM 장길산 CASCADE CONSTRAINT;
     ⇒ 관리자가 장길산에게 학생 테이블 조회할 수 있는 권한과 WITH GRANT OPTION으로 부여된 사용자들의 권한까지 회수
     - 시스템 권한 : REVOKE 권한 FROM 사용자
     - 객체 권한 : REVOKE 권한 ON 테이블 FROM 사용자
   - TCL 트렌잭션 제어
     - COMMIT : 트랜잭션 확정, 업데이트 영구적 확정
     - ROLLBACK : 트랜잭션 취소, 이전 상태로 되돌림
     - SAVEPOINT 이름 : 세이브 포인트 지정
     - ROLLBACK TO SAVEPOINT 이름 : SAVEPOINT 지정한 부분 이후에 발생한 트랜잭션 취소
### 2.  SQL 활용
### 3.  논리 데이터베이스 설계
### 4.  물리 데이터베이스 설계