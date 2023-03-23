### [ 소프트웨어 설계 ]

### 1. 요구사항 확인
### 2. 화면 설계
### 3. 애플리케이션 설계
### 4. 인터페이스 설계
    1. 인터페이스 요구사항 분류
      - 기능적
      - 비기능적 : 성능, 신뢰도, 보안, 안전성 등 시스템 전반
    2. 요구공학
      - 목적 : 의사소통, 공통된 이해, 비용 절감, 변경 추적, 시간 절약
      - 분류
         - 기능적 : 기능에 대한 요구사항
         - 비기능적 : 성능, 유지보수, 운영 등 시스템에 대한 요구사항
      - 개발 단계
         - *도분명확*
         - 도출, 분석, 명세, 확인 및 검증
      - 검증 항목
         - 명완검 일수 추개
         - 명확성 : 하나의 의미만 부여
         - 완전성 : 모든 요구사항 포함
         - 검증 가능성 : 확인 가능
         - 일관성 : 상호 모순 없어야함
         - 수정 용이성 : 쉽게 수정
         - 추적 가능성 : 추정과 상호참조 가능
         - 개발 후 이용성 : 유지보수
      - 요구사항 분석 단계
         - 자료 흐름 지향 분석 : DFD, DD, 구조
         - 객체 지향 분석 : UML, 기능 데이터 함께 분석
      - 요구사항 명세 단계
         - 비정형 명세 기법 : 자연어, 이해 용이, 명확성 문제
            FSM, Decision Table, ER modeling, SADT
         - 정형 명세 기법 :  수학적 원리, 간결, 명확, 기법의 이해 어려움
            VDM, Z-스키마, Petri-Nets, CSP
         - 산출물 : 요구사항 명세서
      - 요구사항 확인 및 검증
         - 확인 Validation, 검증 Verification
         - *동워인*
         - peer review : 2-3명 리뷰
         - walk though : 오류 조기 검출, 비공식적
         - inspection : 전문가 검사, 공식적
    3. 시스템 구성요소
      - *입출처제피*
      - 입력 input, 출력 output, 처리 process, 제어 control, 피드백 feedback
    4. 시스템 아키텍처 요구사항
      - 구성, 동작 원리 나타냄
      - 설계, 구현 지원, 자세히
      - 관계 설명
      - 전체 생명 주기
      - 체계, 구성 방식, 최적화
    5. 시스템 아키텍처 설계 원칙
      - *대확 고운보*
      - 대규모 트랜잭션 처리 및 온라인 성능, 확장성, 서비스 고가용성, 운영관리 효율성, 시스템 보안
    6. 인터페이스 시스템 구성
      - *송수중*
      - 송신 시스템, 수신 시스템, 중계 서버
    7. 내외부 송수신 연계 방식
      - 직접 연계
         - 빠름, 구현 단순, 비용 기간 짧음
         - 결합도가 높아 시스템 변경 시 민감, 통합 환경 구축 어려움
      - 간접 연계
         - 모니터링, 통제, 다양한 환경 통합 관리, 인터페이스 변경 시 유연
         - 연계 절차 복잡, 성능 저하, 개발 및 테스트 기간 오래 걸림
    8. 내외부 송수신 연계 기술
      - *링커 에제 하소*
      - DB Link : 직접 참조 (테이블명@DBLink명)
      - DB  Connection : pool 생성, 이용 (송신 시스템의 DataSource = DBConnectionPool 이름)
      - API/OpenAPI : API명, 입출력 파라미터 정보 필요
      - JDBC : JDBC Driver 이용, DBMS 유형, DBMS 서버 IP와 Port, DB Instance 정보 필요
      - HyperLink : <a href=”url>Link 대상</a>
      - Socket : 소켓 생성, 포트 할당, 클라이언트와 통신
    9.  미들웨어 Middleware
      - 컴퓨터간의 연결, 통신 지원 SW, 위치 투명성, 재사용 가능
    10. Middleware Solution
      - *디원메트 레객와*
      - DB Middleware : App-DB 간의 통신
      - 원격 프로시저 호출 : RPC(Remote Procedure Call) 원격 프로시저를 로컬 프로시저처럼 호출
      - 메시지 자향 미들웨어 : MOM(Message-Oriented Middleware) 비동기형 메시지 전달 방식
      - 트랜잭션 처리 : TP(Transaction Processing) 감시, 분산 트랜잭션, 많은 사용자, 안정적, 즉각적인 처리
      - Lefacyware : 새로운 업데이트 된 기능을 덧붙일 때
      - 객체 기반 : ORB(Object Request Brokers) 데이터의 교환 및 변환 편리
      - WAS(Web Application Server) : 서버계층에서 App 동장 환경 제공, HTTP 세션 처리, JAVA, Component 기반으로 구현 가능