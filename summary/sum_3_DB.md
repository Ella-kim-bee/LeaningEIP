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
        - 낙관적 검증 Optimistic Validation
          - 미검증 상태에서 트랜잭션을 수행 후 종료 시 검증을 수행하여 DB에 반영
         - 타임 스탬프 순서 Time Stamp Ordering
            - 트랜잭션과 트랜잭션이 읽거나 갱신한 데이터에 대해 트랜잭션을 수행 전 타임스탬프를 부여하여 부여된 시간에 따라 트랜잭션을 수행
         - 다중 버전 동시성 제어 MVCC; Mutli Version Concurrency Control
            - 트랜잭션의 타임스탬프와 접근하려는 데이터의 타임스탬프를 비교하여 직렬가능성이 보장되는 적절한 버전을 선택하여 접근하도록 하는 기법
     - 데이터베이스 고립화 수준(격리성 주요 기법) Isolation
        - 다른 트랜잭션이 현재의 데이터에 대한 무결성을 해치지 않기 위해 잠금을 설정하는 정도
        - 고립화 수준 종류
          - Read Uncommitted
            - 한 트랜잭션에서 연산(갱신) 중인(아직 커밋되지 않은) 데이터를 다른 트랜잭션이 읽는 것을 허용하는 수준
            - 연산(갱신) 중인 데이터에 대한 연산은 불허
          - Read Committed
            - 한 트랜잭션에서 연산(갱신)을 수행할 때, 연산이 완료될 때까지 연산 대상 데이터에 대한 읽기를 제한하는 수준
            - 연산이 완료되어 커밋된 데이터는 다른 트랜잭션이 읽는 것을 허용
          - Repeatable Read
            - 선행 트랜잭션이 특정 데이터를 읽을 때, 트랜잭션 종료 시까지 해당 데이터에 대한 갱신.삭제를 제한하는 수준
          - Serializable Read
            - 선행 트랜잭션이 특정 데이터 영역을 순차적으로 읽을 때, 해당 데이터 영역 전체에 대한 접근 제한하는 수준
       - 회복 기법(영속성 주요 기법) Durability
          - 트랜잭션 수행 도중 장애로 인해 손상된 DB를 손상되기 전의 정상 상태로 복구하는 작업
          - 회복 기법 종류
            - *회 로체그*
            - 로그 기반
            - 지연 갱신 회복 기법 Deferred Update :  트랜잭션이 완료되기 전까지 DB에 기록하지 않음
            - 즉각 갱신 회복 기법 Immediate Update : 트랜잭션 수행 중 갱신 결과를 바로 DB에 반영
            - 체크 포인트(Checkpoint Recovery) : 장애 발생 시 검사점 이후에 처리된 트랜잭션에 대해서만 이전 상태로 복원
            - 그림자 페이징(Shadw Paging Recovery) : DB 트랜잭션 수행 시 복제본을 생성하여 장애 시 이를 이용해 복구
  5. 트랜잭션의 상태 변화
      ```mermaid
      flowchart LR
        A(Active)
        A -->B(Partially Committed) -->|Commit| D(Committed)
        A -->C(Failed) -->|Rollback| E(Aborted)
        B -->C
      ```
      - 활동 Active : 초기 상태, 트랜잭션이 실행 중
      - 부분완료 Partially Committed : 마지막 명령문이 실행된 후, 모든 연산 처리는 끝났지만 트랜잭션이 수행한 최종 결과를 DB에 반영하지 않은 상태
      - 완료 Committed : 트랜잭션이 성공적으로 완료
      - 실패 Failed : 정상적인 실행이 진행될 수 없을 때
      - 철회 Aborted : 트랜잭션이 취소되고 DB가 트랜잭션 시작 전 상태로 환원, 트랜잭션 수행 실패로 Rollback 연산을 실행한 상태
  6. 트랜잭션 제어(TCL; Transaction Contril Language)
       - *커롤체 CRC*
       - 커밋(COMMIT) 트랜잭션 확정 : 트랜잭션을 메모리에 영구적으로 저장
       - 롤백(ROLLBACK) 트랜잭션 취소 : 트랜잭션 내역을 저장 무효화시킴
       - 체크 포인트(CHECKPOINT) 저장 시기 설정 : ROLLBACK을 위한 시점을 지정
  7. 데이터 사전
       - 시스템 카탈로그 or 시스템 DB
       - 변경 권한은 시스템이 가짐, 사용자는 읽기 전용 테이블 형태로 단순 조회만 가능
       - 데이터의 데이터를 의미하는 메타데이터(Metadata)로 구성
       - 메타데이터 유형(DBMS공통)
           - 사용자 정보 (id, pw 등)
           - DB 객체 정보 (테이블, 뷰, 인덱스 등)
           - 무결성 제약 정보(Constraints)
           - 함수, 프로시저 및 트리거
       - 데이터 사전 목적
           - 사용자에게 단순 조회
           - 컴파일러 옵티마이저 등과 같은 구성요소에 데이터 사전은 작업을 수행하는 데 필요한 참조 정보
           - Compiler : 특정 프로그래밍 언어로 쓰여진 소스 코드를 다른 프로그래밍 언어(목적 코드)로 바꿔주는 번역 프로그램
           - Optimizer : 사용자 질의한 SQL문을 처리할 수 있는 실행 계획을 탐색하고 각 실행 계획에 대한 비용을 추정하여 최적의 실행계획을 수립하는 DBMS의 핵심 엔진
       - 데이터 사전 검색
           - Oracle 데이터 사전 검색
               - Oracle 사용자는 뷰로 데이터 사전에 접근할 수 있음
               - 데이터 사전과 관련된 뷰는 DBA_, ALL_, USER_ (우선순위 순)
               - 영역지시자(DBA, ALL, USER) 뒤에 오브젝트 명을 붙이는 형태
               - DBA_ : DB의 모든 객체 조회 가능(DBA는 시스템 접근 권한)
                ; SELECT * FROM DBA_TABLES;
               - ALL_ : 자신의 계정으로 접근 가능한 객체와 타 계정의 접근 권한을 가진 모든 객체 조회 가능
               ; SELECT * FROM ALL_INDEXES;
               - USER_ : 현재 자신의 계정이 소유한 객체 조회 가능
               ; SELECT * FROM USER_VIEWS;
           - MySQL 데이터 사전 검색
               - 테이블 형태
               - information_schema라는 DB 안에 존재
               - 조회하기 위해서는, 해당 DB로 이동해서 테이블 목록을 요청해야 함
               ```jsx
               use informaiton_schema;--이동
               show tables;--테이블 목록 보기
               ```
               - 테이블 목록으로 데이터 사전을 구성하는 테이블 이름을 확인하고, SELECT문을 통해 해당 테이블의 내용을 조회할 수 있다
  8. 뷰 View
       - View의 개념
          - 논리 테이블로서 사용자에게(사용 관점에서) 테이블과 동일
          - TABLE A, TABLE B는 물리 테이블
          - VIEWC는 두 개의 테이블을 이용하여 생성한 뷰
          - VIEW는 TEBLE A와 같은 하나의 물리 테이블로 생성 가능, 다수의 테이블 또는 다른 뷰를 이용해 만들 수 있다
          - 뷰와 같은 결과를 만들기 위해 조인 기능을 활용할 수 있으나, 뷰가 만들어져 있다면 사용자는 조인 없이 하나의 테이블을 대상으로 하는 단순한 질의어를 사용할 수 있다
      - View의 장단점
        - 장점
        - 논리적 독립성 제공
            - DB에 영향을 주지 않고 app이 원하는 형태로 데이터 접근 가능
        - 데이터 조작 연산 간소화
            - app이 원하는 형태의 논리적 구조를 형성하여 데이터 조작 연산을 간소화
            - 복수 테이블에 존재하는 여러 종류의 데이터에 대해 단순한 질의어 사용 가능

                ```jsx
                SELECT * FROM 뷰이름;
                ```

        - 보안 기능(접근 제어) 제공
            - 특정 필드만을 선택해 뷰를 생성할 경우 app은 선택되지 않은 필드의 조회 및 접근 불가
            - 중요 보안 데이터를 저장 중인 테이블이나 컬럼에는 접근 불허
        - 단점
        - 뷰 자체 인덱스 불가
            - 인덱스는 물리적으로 저장된 데이터를 대상으로 하기에 논리적 구성인 뷰 자체는 인덱스를 가지지 못함
        - 뷰 변경 불가
            - 뷰 변경하려면 삭제하고 재생성
            - 뷰 정의는 ALTER문으로 변경 못함(CREATE로 정의, DROP으로 제거)
        - 데이터 변경 제약 존재
            - 뷰의 내용에 대한 삽입, 삭제, 변경 제약이 있음
       - 뷰 명령어
          - 뷰 생성
            - SELCET문에는 UNION 이나 ORDER BY 절 사용 불가
            - 컬럼명을 기술하지 않으면 SELECT 문의 컬럼명이 자동으로 사용됨

            ```jsx
            CREATE VIEW 뷰 이름 컬럼 목록 AS 데이터 조회 쿼리;

            // TABLE A 그대로
            CREATE VIEW VW_A AS
            SELECT *
              FROM A;

            // TABLE A 일부 컬럼
            CREATE VIEW VW_B AS
            SELECT 컬럼1, 컬럼2
              FROM A;

            // TABLE A와 TABLE B 조인 결과
            CREATE VIEW VW_C AS
            SELECT *
              FROM A, B
            WHERE A.컬럼1 = B.컬럼1;
            ```

          - 뷰 삭제/변경
            - 뷰  정의 자체 변경 불가능
            - 뷰 이름이나 쿼리문을 변경하는 수단 미제공
            - 뷰 삭제와 재생성을 통해 뷰의 대한 정의 변경이 가능
            - CASCADE : 참조하는 테이블까지 연쇄적으로 제거
            - RESTRICT : 다른 테이블이 삭제할 테이블을 참조 중이면 제거하지 않음

            ```jsx
            DROP VIEW 테이블명 [CASCADE | RESTRICT];
            ```

  9. 인덱스 Index
       - index 개념
          - 데이터 빠르게 찾을 수 있는 수단, 테이블에 대한 조회 속도 높여 주는 자료 구조
          - 테이블의 특정 레코드 위치 알려줌
          - 자동 생성 안됨
          - 기본키(PK; Primary Key) 컬럼은 자동으로 인덱스 생성
          - 연월일이나 이름을 기준으로 하는 인덱슨느 자동으로 생성되지 않음
          - ‘테이블 이름’ 컬럼에 인덱스가 없는 경우 테이블 전체 내용 검색 : Table Full Scan
          - 인덱스가 생성되어 있을 때 인덱스 범위 스캔 : Index Range Scan
          - 조건절에 ‘=’로 비교되는 컬럼을 대상으로 인덱스를 생성하면 검색 속도 높임
       - index 종류
          - 순서 Ordered : 데이터가 정렬된 순서로 생성, B-Tree알고리즘(오름/내림차순 지정 가능)
          - 해시 Hash : 해시 함수에 의해 직접 데이터에 키 값으로 접근, 데이터 접근 비용이 균일, 튜플(Row)양에 무관
          - 비트맵 Bitmap : 각 컬럼에 적은 개수 값이 저장된 경우, 수정 변경이 적을 경우 유용(생년월일, 상품번호 등)
          - 함수기반 Functional : 수식이나 함수를 적용
          - 단일 Singled : 하나의 컬럼으로만 구성, 주 사용 컬럼이 하나일 경우
          - 결합 Concatenated : 두 개 이상의 컬럼으로 구성, WHERE 조건으로 사용하는 빈도가 높은 경우
          - 클러스터드 Clustered : 기본 키PK 기준으로 레코드를 묶어서 저장, 저장 데이터의 물리적 순서에 따라 인덱스 생성, 특정 범위 검색 시 유리
       - index 조작
          - 인덱스 생성
              - DBMS는 인덱스를 사용하여 빠른 검색 수행
              - DB 사용자는 DBMS가 인덱스를 사용할 수 있게 준비해야 함

              ```jsx
              CREATE UNIQUE INDEX 인덱스명 ON 테이블명(컬럼명);
              ```

              - UNIQUE : 인덱스 걸린 컬럼에 중복 값을 허용하지 않음, 생략 가능
              - 인덱스명 : 생성하고자 하는 인덱스 테이블 명
              - 테이블명 : 인덱스 대상 테이블 명
              - 컬럼명 : 테이블의 특정 컬럼명(복수 컬럼 지정 가능)
          - 인덱스 삭제

              ```jsx
              DROP INDEX 인덱스명;
              ```

              - 인덱스명 : 생성된 인덱스명
              - 삭제 시 테이블 변경 명령어가 사용
              - ALTER TABLE 명령 뒤에 DROP INDEX 명령이 추가되는 형태로 사용
          - 인덱스 변경

            ```jsx
            ALTER UNIQUE INDEX 인덱스명 ON 테이블명(컬럼명);
            ```

            - 일부 제품은 인덱스에 대한 변경 SQL 문이 없음
            - 기존 인덱스를 삭제하고 신규 인덱스를 생성하는 방식으로 사용 권고
  10. 집합 연산자 Set Operator
        - 집합 연산자 개념
          - 두 개 이상의 테이블에서 여러 개의 질의의 결과를 연결하여 하나로 결합
        - 집합 연산자 유형
          - *유유인마*
          - UNION : 중복 행이 제거된 쿼리 결과 집합
          - UNION ALL : 중복 행이 제거되지 않은 쿼리 결과 집합
          - INTERSECT : 두 쿼리 결과에 공통적으로 존재하는 집합
          - MINUS : 첫 쿼리에 있고 두 번째 쿼리에 없는 집합
          - UNION
              - 합집합, 중복 제거

              ```jsx
              SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SAL <= 2000
              	UNION
              SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SHAL >= 1000;
              ```

        - UNION ALL
            - 합집합, 중복 포함

            ```jsx
            SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SAL <= 2000
            	UNION ALL
            SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SHAL >= 1000;
            ```

        - INTERSECT
            - 교집합

            ```jsx
            SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SAL <= 2000
            	INTERSECT
            SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SHAL >= 1000;
            ```

        - MINUS
            - 차집합, 공통 항목 제외한 결과

            ```jsx
            SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SAL <= 2000
            	MINUS
            SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SHAL >= 1000;
            ```
  11. 조인 Join
       - Join 개념
          - 두 개 이상의 테이블을 연결하여 데이터 검색
          - 관련된 튜플들을 결합하여 하나의 튜플로 만드는 가장 대표적인 데이터 연결 법
          - 관계형 DB의 가장 큰 장점이면서 대표적인 핵심 기능
      - Join 성능을 높이기 위한 고려 사항
          - 효과적인 인덱스 활용 고려
          - 조인 순서를 작은 테이블부터 선행 테이블로 설정하여 검색
          - 조인 성공률이 낮은 집합의 조인이 먼저 일어나도록 설정
          - 조인 적용 후 테스트 수행
          - 조인 대상 및 양을 최소화
      - Join 유형
          - 논리적 조인
              - 사용자 SQL 문에 표현되는 테이블 결합 방식
              - 내부 조인, 외부 조인
          - 물리적 조인
              - DB Optimizer 에 의해 내부적으로 발생하는 테이블 결합 방식
              - 중첩 반복 조인, 정렬 합병 조인, 해시 조인
          - 논리적 조인

                | 유형 | 설명 |
                | --- | --- |
                | 내부 조인
                Inner Join | - 공통 존재 컬럼의 값이 같은 경우를 추출
                - 조인 조건에 따라 세분화
                - 조인의 대상이 되는 컬럼을 명시적으로 선언하기 위해 USING 이나 ON 조건절 사용 |
                | 외부 조인
                Outer Join | - 왼쪽 Left Outer Join : 왼쪽 테이블의 모든 데이터와 오른쪽 테이블의 동일 데이터 추출
                - 오른쪽 Right Outer Join : 오른쪽 테이블의 모든 데이터와 왼쪽 테이블의 동일 데이터 추출
                - 완전 Full Outer Join : 양쪽의 모든 데이터 추출 |
                | 교차 조인
                Cross Join | 조인 조건 없는 모든 데이터 조합을 추출 |
                | 셀프 조인
                Self Join | 자기 자신에게 별칭을 지정한 후 다시 조인 |

            - 논리적 조인 문법
                - *내외교셀 (내부 외부 교차 셀프)*
                - 내부 조인
                    - 같은 이름의 컬럼이 여러 테이블에 있을 경우 ‘별칭.컬럼명’ 형태로 명시
                    - INNER라는 키워드는 생략해도 내부 조인이 됨
                    - 검색 조건을 추가할 경우 조인 된 값에서 해당 조건에 맞는 결과만 출력 되도록 설정

                    ```jsx
                    SELECT A.컬럼1, A.컬럼2, ..., B.컬럼1, B.컬럼2, ...
                    	FROM 테이블1 A INNER JOIN 테이블2 B
                    		ON 조인조건
                    WHERE 검색조건;
                    ```

                - 왼쪽 외부 조인
                    - OUTER 라는 키워드는 생략해도 왼쪽 외부 조인이 됨
                    - 검색 조건을 추가할 경우 조인된 값에서 해당 조건에 맞는 결과만 출력 되도록 설정

                    ```jsx
                    SELECT A.컬럼1, A.컬럼2, ..., B.컬럼1, B.컬럼2, ...
                    	FROM 테이블1 A LEFT OUTER JOIN 테이블2 B
                    		ON 조인조건
                    WHERE 검색조건;
                    ```

                - 오른쪽 외부 조인
                    - OUTER 라는 키워드는 생략해도 왼쪽 외부 조인이 됨
                    - 검색 조건을 추가할 경우 조인된 값에서 해당 조건에 맞는 결과만 출력 되도록 설정

                    ```jsx
                    SELECT A.컬럼1, A.컬럼2, ..., B.컬럼1, B.컬럼2, ...
                    	FROM 테이블1 A RIGHT OUTER JOIN 테이블2 B
                    		ON 조인조건
                    WHERE 검색조건;
                    ```

                - 완전 외부 조인
                    - OUTER 라는 키워드는 생략해도 왼쪽 외부 조인이 됨
                    - 검색 조건을 추가할 경우 조인된 값에서 해당 조건에 맞는 결과만 출력 되도록 설정

                    ```jsx
                    SELECT A.컬럼1, A.컬럼2, ..., B.컬럼1, B.컬럼2, ...
                    	FROM 테이블1 A FULL OUTER JOIN 테이블2 B
                    		ON 조인조건
                    WHERE 검색조건;
                    ```

                - 교차 조인
                    - 조인 조건이 없는 모든 데이터 조합을 추출하기 때문에 ON절이 없음

                    ```jsx
                    SELECT 컬럼1, 컬럼2, ...
                    	FROM 테이블1 CROSS JOIN 테이블2
                    ```

                - 셀프 조인
                    - 같은 테이블명을 쓰고 별칭만 A,B와 같이 다르게 함
                    - 검색 조건을 추가할 경우 조인된 값에서 해당 조건에 맞는 결과만 출력 되도록 설정

                    ```jsx
                    SELECT A.컬럼1, A.컬럼2, ..., B.컬럼1, B.컬럼2, ...
                    	FROM 테이블1 A INNER JOIN 테이블1 B
                    		ON 조인조건
                    WHERE 검색조건;
                    ```

            - 물리적 조인
                - *네소해 (Ne So Ha)*
            - 중첩 반복 조인 Nested-Loop Join
                - 개념
                    - 2개 이상의 테이블에서 하나의 집합을 기준으로 순차적으로 상대방 Row를 결합하여 원하는 결과를 조합
                    - 선행 테이블의 처리 범위를 하나씩 액세스(접근)하면서 추출된 값으로 연결할 테이블을 조인
                - 특징
                    - 좁은 범위에 유리한 성능
                    - 순차적 처리, 임의 접근(Random Access) 위주
                    - 후행 테이블(Driven)에는 조인을 위한 인덱스 생성 필요
                    실행속도 = 선행 테이블 사이즈 * 후행 테이블 접근 횟수
            - 정렬 합병 조인 Sort-Merge Join
                - 개념
                    - 조인의 대상 범위가 넓을 경우 발생하는 임의 접근을 줄이기 위한 경우
                    - 연결 고리에 마땅한 인덱스가 존재하지 않을 경우
                    - 양쪽 테이블의 정렬한 결과를 차례로 검색하면서 연결 고리 형태로 합병
                - 특징
                    - 랜덤 접근이 아닌 스캔 하면서 수행
                    - 중첩 반복 조인(Nested Loop Join)에 따라 효율에 큰 차이가 발생
                    - 조인 연산자가 ‘=’이 아닌 경우 중첩 반복 조인보다 유리
            - 해시 조인 Hash Join
                - 개념
                    - 해싱 함수(Hashing Function)를 활용하여 테이블 간 조인을 수행
                    - 직접 연결을 담당하는 것이 아니라 연결될 대상을 특정 지역(Partition)에 모아두는 역할만 담당
                - 특징
                    - 대용량 처리 선결조건인 랜덤 액서스와 정렬에 대한 부담을 해결
                    - 비용기반 옵티마이저에서만 가능, CPU성능에 의존적
                    - 해시 테이블 생성 후 중첩 반복 조인처럼 순차적인 처리 형태
                    - **비용기반 옵티마이저 : 처리 방법들에 대한 비용을 산정하고, 최소 비용을 방법을 선택하는 옵티마이저
  12. 서브쿼리 Sub-Query
      - SQL 문 안에 포함된 또 다른 SQL문
      - 알려지지 않은 기준을 위한 검색을 위해 사용
      - 메인쿼리와 서브쿼리는 주종 관계
      - 서브쿼리에서 사용되는 컬럼 정보는 메인쿼리의 컬럼 정보를 사용할 수 있으나 역으로는 성립하지 않음
      - 서브쿼리 유형
          - 동작하는 방식이나 반환되는 데이터의 형태에 따라 분류
          - 동작 방식 기준

                | 서브쿼리 종류 | 설명 |
                | --- | --- |
                | 비연관
                Un-Correlated Sub-Query | - 서브쿼리가 메인쿼리의 컬럼을 가지고 있지 않은 형태
                - 메인쿼리에 서브쿼리에서 실행된 결과 제공하는 용도 |
                | 연관
                Correlated Sub-Query | - 서브쿼리가 메인쿼리의 컬럼에 가지고 있는 형태
                - 메인쿼리가 먼저 수행되어 얻은 데이터를 서브쿼리의 조건에 맞는지 확인하는 용도 |

            - 데이터 형태 기준

                | 서브쿼리 종류 | 설명 |
                | --- | --- |
                | 단일 행
                Single Row | - 결과가 항상 1건 이하
                - 단일 행 비교 연산자(=, <, <=, >, >=, <>) 사용 |
                | 다중 행
                Multiple Row | - 실행 결과가 여러 건
                - 다중 행 비교 연산자 (IN, ALL, ANY, EXIST) 사용
                - IN : 임의의 값과 동일한 조건
                - ALL : 모든 값을 만족하는 조건
                - ANY : 어느 하나의 값이라도 만족하는 조건
                - EXIST : 값의 존재 여부를 확인하는 조건 |
                | 다중 컬럼
                Multiple Column | - 결과가 여러 컬럼으로 반환
                - 메인쿼리의 조건절에 여러 컬럼을 동시에 비교할 때, 서브쿼리와 메인 쿼리에서 비교하는 컬럼 개수와 위치가 동일해야 함 |

            - 위치 기준

                | 서브쿼리 종류 | 설명 |
                | --- | --- |
                | FROM 절 | - 서브쿼리가 FROM 절 안에 있음
                - 인라인 뷰(Inline View)라고 불림
                - 뷰 처럼 결과가 동적으로 생성된 테이블 형태로 사용 가능 |
                | WHERE 절 | - 서브쿼리가 WHERE 절 안에 있음
                - 중첩 서브쿼리(Nested Sub-Query)라고 불림 |
        - 서브쿼리 활용(위치 기준)
            - A라는 이름으로 바꾼 ‘도서 가격’의 ‘책번호’와 B라는 이름의 서브쿼리 결괏값 중 ‘책번호’가 같은 책의 최대 ‘가격’을 출력

            ```jsx
            SELCET MAX(가격) AS 가격
            	FROM 도서가격 A,
            		(SELCET 책번호
            				FROM 도서
            				WHERE 책명='자료구조') B
            	WHERE A.책번호 = B.책번호
            ```




### 3.  논리 데이터베이스 설계
### 4.  물리 데이터베이스 설계




