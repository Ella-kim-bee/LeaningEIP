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
   - 범위 BETWEEN(AND와 함께 사용)
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
  6. 윈도 함수 Window Function
     - 행과 행 간의 관계를 쉽게 정의하기 위해 만든 함수
     - DB 온라인 분석 처리 용도, SQL에 추가된 기능 → OLAP
       - OLAP(On-Line Analytical Processing) : 의사결정 지원 시스템, 사용자가 동일한 데이터를 여러 기준을 이용하는 다양한 방식으로 바라보면서, 다차원 데이터 분석을 도와주는 기술
     - SELECT 함수명(파라미터)

      ```jsx
      OVER
      ([PARTITION BY 컬럼1, …]
      [ORDER BY 컬럼A, …])
      FROM 테이블명
      ```

      ⇒ PARTITION BY 선택 항목, 통해 구분된 레코드 집합을 윈도라고 함, 윈도 함수에는 ORDER BY 문구 필수적, ORDER BY 뒤에는 sort컬럼 입력(열, 정렬방법)
    - 윈도 함수의 분류
      - *집순행비*
      - 집계 함수 : 결괏값
      - 순위 함수 : 순위 계산
      - 행 순서 함수 : 가장 먼저, 가장 뒤에 값, 이전 이후 값 출력
      - 그룹 내 비율 함수 : 백분율, 통계
        - 집계 함수
        - COUNT(행 줄 수), SUM, AVG, MAX, MIN, STDDEV(표준편차), VARIANCE(분산)
      - 순위 함수
        - RANK(동일순위-후순위는 넘어감, 2위가 3개인 경우 2위,2위,2위, 5위), DENSE_RNAK(동일순위-후순위 넘어가지 않음,  2위가 3개인 경우 2위,2위,2위, 3위), ROW_NUMBER(동일순위-무관함 연속번호 부여,  2위가 3개인 경우 2위,3위,4위,5위)
      - 행 순서 함수
        - FIRST_VALUE(=== MIN)
        - LAST_VALUE(===MAX)
        - LAG(이전 로우의 값)
        - LEAD(이후 로우의 값)
      - 그룹 내 비율 함수
        - RATIO_TP_REPORT(그룹의 합을 기준으로 각 로우의 상대적 비율 0~1)
        - PERCENT_RANK((그룹의 첫번째0, 마지막1, 행의 순서별 백분율 0~1)
  7. 윈도 함수 활용
    - OLAP(On-Line Analytical Processing)
    사용자가 동일한 데이터를 다차원 데이터 분석 지원, 의사결정 지원 시스템
    - OLAP 연산
        - Roll-Up(구체적인 데이터로부터 요약된 데이터로 접근)
        - Drill-Down(요약된 데이터로부터 구체적인 데이터로 접근)
        - Slicing(데이터 큐브의 한 조각을 볼 수 있게 해주는 연산)
        - Dicing(고정된 다차원 값에 대한 연산)
        - Pivoting(다차원 분석 테이블인 크로스 테이블에서 차원 변경 연산)
  8. 그룹 함수(Group Function)
    - 컬럼 값에 따라 그룹별로 결과 출력하는 함수
    - ROLLUP(소그룹 간 소계 출력)
        - 지정된 컬럼의 소계 및 총계
        - 지정 컬럼 수보다 하나 더 큰 레벨만 큼의 중간 집계 값이 생성
        - 순서에 유의 해야한다(계층구조)
        - 소계 집계 대상 컬럼 ROLLUP 뒤에 기재
        소계 집계 대상 아닌 경우 GROUP BY 뒤에 기재
        SELECT 뒤에 포함되는 컬럼이 GROUP BY 또는 ROLLUP 뒤에 기재되어있어야함
        ORDER BY 계층 내 정렬 사용 가능

            ```jsx
            SELECT 컬러명1 , …, 집계 함수
              FROM 테이블명
            [WHERE …]
              GROUP BY [컬럼명1, ...] ROLLUP (그룹화할 열)
            [HAVING ...]
            [ORDER BY ...]
            ```
      - CUBE(GROUP BY 항목들과 다차원 소계 출력)
        - 결합 가능한 모든 값에 대해 다차원 집계 생성
        - 내부적으로 대상 컬럼의 순서를 변경하여 또 한 번의 쿼리를 수행
        - 연산이 많아 시스템 부담
        - 소계 집계 대상 컬럼 CUBE 뒤에 기재
        소계 집계 대상 아닌 경우 GROUP BY 뒤에 기재
        SELECT 뒤에 포함되는 컬럼이 GROUP BY 또는 CUBE 뒤에 기재되어있어야함
        ORDER BY 계층 내 정렬 사용 가능

            ```jsx
            SELECT 컬러명1 , …, 집계 함수
              FROM 테이블명
            [WHERE …]
              GROUP BY [컬럼명1, ...] CUBE (그룹화할 열)
            [HAVING ...]
            [ORDER BY ...]
            ```
      - GROUPING SETS(특정 항목에 대한 소계 출력)
        - 집계 대산 컬럼들에 대한 집계 생성
        - ROLLUP과 달리 컬럼 간 순서와 무관한 결과를 얻을 수 있음
        - ORDER BY를 사용하면 집계 대상 그룹과의 표시 순서를 조정하여 체계적
        - 개별 집계를 구할 수 있으며, 평등한 관계라서 순서 상관없음

            ```jsx
            SELECT 컬러명1 , …, 집계 함수
              FROM 테이블명
            [WHERE …]
              GROUP BY [컬럼명1, ...] GROUPING SETS(컬럼명a, ...)
            [HAVING ...]
            [ORDER BY ...]
            ```
  9. 오류 처리
    - 오류 처리(Error Handling)
    - HANDLER 선언 구문
        ```jsx
        DECLARE action HANDLER
        	FOR state command;
        ```

        - action : CONTINUE(command 계속 실행), EXIT(한 번 실행)
        - state : SQLWARNING(경고), NOTFOUND(다음 레코드 가져오지 못함), SQLEXCEPTION(에러)
        - command : 명령문

        ```jsx
        DECLARE CONTINUE HANDLER
          FOR SQLEXCEPTION
          SET TEST_ERROR = 5;
        // 에러 발생 시, TEST_ERROR 변수의 값을 5로 설정

        DECLARE EXIT HANDLER
          FOR SQLEXCEPTION
        BEGIN
          ROLLBACK;
          SELECT '에러 발생, ROLLBACK 수행';
        END;
        // 에러 발생 시, 이전 연산자로 되돌아 간 후 에러 메시지가 발생
        ```
### 2.  SQL 활용
  1. 데이터 정의어 DDL
    - 데이터를 정의, 데이터를 담는 그릇을 정의하는 언어
    - DDL 대상
      - *도스테뷰인*
      - 도메인
        - 하나의 속성이 가질 수 있는 원자 값들의 집합
        - 속성의 데이터 타입과 크기 등 정보
      - 스키마
        - 구조, 정보 담고 있는 기본적 구조, 외부.개념.내부 3계층으로 구성
        - 외부 : 사용자, 개발자 관점에서 필요한 db 논리적 구조, 사용자 뷰, 서브 스키마
        - 개념 : db의 전체적 논리적 구조, 전체 뷰, 개체 간의 관계, 제약 조건, 접근 권한, 무결성, 보안에 대해 정의
        - 내부 : 물리적 저장장치의 관점 db 구조, 실제로 db 저장될 레코드 형식 정의, 저장 데이터 항목의 표현 방법, 내부 레코드의 물리적 순서
      - 테이블
        - 데이터를 저장하는 항목인 필드들로 구성된 데이터 집합체
      - 뷰
        - 하나 이상의 물리 테이블에서 유도되는 가상의 테이블
      - 인덱스
        - 검색을 빠르게 하기 위한 데이터 구조
      - DDL 명령어
        - CREATE : DB object 생성
        - ALTER : DB object 변경
        - DROP : DB object 삭제
        - TRUNCATE : DB object 내용 삭제
      - CREATE 명령어
        - PRIMARY KEY : 테이블의 기본키 정의, 유일하게 테이블의 각 행을 식별
        - FOREIGN KEY : 외래키 정의, 참조 대상을 테이블(컬럼명)로 명시, 열과 열 사이의 외래 키 관계를 적용
        - UNIQUE : 해당 컬럼에 동일한 값이 들어가지 않도록 하는 제약 조건
        - NOT NULL : 해당 컬럼은 NULL 값을 포함하지 않도록 하는 속성
        - CHECK : 개발자가 정의하는 제약 조건, TRUE 조건을 지정
        - DEFAULT : 해당 필드의 기본값 설정

        ```jsx
        CREATE TABLE 테이블명
        (
        	속성명 데이터타입 [NOT NULL], ...,
        	PRIMARY KEY(기본키),
        	UNIQUE(속성명, ...),
        	FOREIGN KEY(외래키) REFERENCES 참조테이블(기본키),
        	CONSTRAINT 제약조건명 CHECK(조건식)
        )
        ```

      - ALTER 명령어
        - CREATE와 동일하게 사용 가능

        ```jsx
        // 컬럼 추가
        ALTER TABLE 테이블명 ADD 컬럼명 데이터_타입;

        // 컬럼 수정
        // 데이터 유형, 기본값, not null 제약 조건 변경
        ALTER TABLE 테이블명 MODIFY 컬럼명 데이터_타입 [DEFAULT 값] [NOT NULL];

        // 컬럼 삭제
        ALTER TABLE 테이블명 DROP 컬럼명;

        // 컬럼명 수정
        ALTER TABLE 테이블명 RENAME COLUMN 변경 전_컬럼명 TO 변경 후_컬럼명;
        ```

      - DROP 명령어
        - CASCADE : 참조하는 테이블까지 연쇄적으로 제거
        - RESTRICT : 다른 테이블이 삭제할 테이블을 참조 중이면 제거하지 않음

        ```jsx
        DROP TABLE 테이블명 [CASCADE | RESTRICT];
        ```

      - TRUNCATE 명령어

        ```jsx
        // 내용 삭제
        TRUNCATE TABLE 테이블명
        ```

  2. 관계형 데이터 모델
    - 계층 모델과 망 모델의 복잡한 구조를 단순화시킨 모델
    - 대표 언어 SQL
    - 데이터 간의 관계를 기본 키와 이를 참조하는 외래키로 표현
    - 테이블 간 관계를 1:1, 1:N, M:N
  3. 트랜잭션
    - 트랜잭션 Transaction
      - 논리적 기능을 정상적으로 수행하기 위한 작업의 기본 단위
      - 데이터 보장하기 위한 DBMS가 가져야하는 특성
   - 트랜잭션 특징
      - *ACID (원일격영)*
      - 원자성 Atomicity
        - 연산 전체가 모두 정상 실행 or 취소되어야 하는 성질
        - Commit / Rollback 회복성 보장
      - 일관성 Consistency
        - 시스템의 고정 요소는 트랜잭션 수행 전후 상태가 같아야 하는 성질
        - 무결성 제약 조건, 동시성 제어
      - 격리성=고립성 Isolation
        - 동시에 실행되는 트랜잭션들이 서로 영향을 미치지 않아야 하는 성질
        - Read Uncommitted, Read Commited, Repeatable Read, Serializable
      - 영속성 Durability
        - 성공이 완료된 트랜잭션의 결과는 영속적으로 DB에 저장되어야 하는 성질
        - 회복 기법
  4. 트랜잭션 연산
    - 트랜잭션 연산 (원자성 주요 기법) Atomicity
        - Commit, Rollback 의해 원자성 보장
     - 병행 제어 (일관성 주요 기법) Consistency
        - 다수 사용자 환경에서 트랜잭션을 수행할 때, DB 일관성 유지 위해 상호작용 제어
        - DB 공유 최대화
        - 시스템 활용도 최대화
        - DB 일관성 유지
        - 사용자 응답 시간 최소화
        - 미보장 시 문제점
          - *갱현모연*
          - 갱신 손실Lost Update, 현황 파악 오류Dirty Read, 모순성Inconsistency, 연쇄 복귀Cascading Rollback
      - 병행 제어 기법 종류
        - 로 낙타다
        - 로킹 Locking
          - 하나의 트랜잭션이 실행하는 동안 특정 데이터 항목에 대해서 동시 접근 불가하여 상호 배제(Mutual Exclusive) 기능
          - DB, file, recode 로킹 단위가 될 수 없음
          - 로킹 단위가 작아지면,
          DB 공유도 증가, 로킹 오버헤드 증가, 병행성 수준 높아짐
          - 한꺼번에 로킹할 수 있는 객체의 크기를 로킹 단위라고 함
        - 낙관적 검증
        - 타임 스탬프 순서
        - 다중 버전 동시성 제어
### 3.  논리 데이터베이스 설계
### 4.  물리 데이터베이스 설계