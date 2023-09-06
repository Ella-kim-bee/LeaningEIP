- Secure OS 보안 운영체제 : 컴퓨터 운영체제의 커널에 보안 기능을 추가한 운영체제이다.
-  ISMS : 정보보호 관리체계

- 애드 혹 네트워크 : 노드들에 의해 자율적으로 구성되는 기반 구조가 없는 네트워크

- SW 개발 보안 3대 요소 : 기밀성, 무결성, 가용성(기무가)

- SSL/TLS : 전송계층과 응용계층 사이에서 클라이언트와 서버 간의 웹 데이터 암호화(기밀성), 상호 인증 및 정송 시 데이터 무결성을 보장하는 보안 프로토콜
기밀성-AES, 상호인증-RSA, DSS 메세지 무결성-해시 알고리즘

- IPSec : IP계층 무결성, 인증 헤더(AH), 기밀성
- S-HTTP : 웹상 모든 메세지 각각 암호화
- IDEA : 블록암호화 알고리즘, 128bit -> 64bit
- Skipjack : 미 국가안보국, 칩에 내장, 음성 암호화

- UI 개발 주요 기법
3C 분석 : customer, company, competitor 차별화해서 경쟁 이길 방법 분석
SWOT 분석 : strength, weakness, opportunity, threat
시나리오 플래닝
사용성 테스트 : 사용자가 직접 시나리오에 맞춰서 질의응답
워크숍 : 소집단 연구회, 세미나

- UML : 사물, 관계, 다이어그램(사관다)
  객체지향 소프트웨어 개발 과정에서 산출물을 명세화, 시각화, 문서화할 때 사용되는 모델링 기술과 방법론을 통합해서 만든 표준화된 언어

- UML 정적 다이어그램(클객 컴배 복패)
  클래스
  객체
  컴포넌트
  배치
  복합체구조
  패키지

- UML 동적 다이어그램(유시커 상활타)
  유스케이스
  시퀀스
  커뮤니케이션
  상태
  활동
  타이밍

- 응집도
  우논시절 통  순기
  내유시순 입출출단

- 결합도
  내공 외제 스자
  내전 외제 배파

- 객체지향 설계 원칙 SOLID
  SRP single
  OCP open
  LSP liskov : 상속, 하위->상위 교체
  ISP interface
  DIP dependency

- DBMS 특징
  무결성 : 서로 다른 데이터가 저장되는 것을 허용하지 않음
  일관성 : 삽삭갱생 데이터 변함 없음
  회복성 : 장애 발생했을 대 특정 상태로 복구
  보안성 : 불법적인 노출, 변경, 손실로부터 보호
  효율성 : 응답시간, 저장 공간 활용 등이 최적화되어 요구 조건을 만족시켜야함

- OLAP : 의사결정 지원 시스템, 다차원 데이터 분석
  Roll-Up : 구체적 -> 요약
  Drill-Down : 요약 -> 구체적
  Slicing : 큐브 한 조각
  Dicing : 고정된 다차원 값
  Pivoting : 차원 변경

- MDR 메타데이터 레지스트리 : 메타데이터 유지관리, 명세 의미공유, 데이터 조작 가능



- CPS(cyber-physical system) : 가상 물리 시스템, 실시간 물리적 요소 제어
- Digital Twin(디지털 트윈) : 소프트웨어 가상화, 효율성 향상

- Putnam(푸트남) 모형 : SW개발주기의 단계별로 요구할 인력 분포 가정 모형, Rayleigh-Norden 기반 비용산정모형

- 구조 패턴 : 구 브데 퍼플 프록 컴어
  Bridge : 기능 클래스 계층-구형 클래스 계층 연결
  Decorator : 기능 확장
  Facade : 단순한 인터페이스
  Flyweight : 클래스 경량화
  Proxy : 실제 객체에 대한 대리 객체, 정보은닉 역할
  Composite : 트리구조, 복합객체, 단일객체 동일 취급
  Adapter : 클래스 재사용

- 행위 패턴
  Observer : 일대 다의 의존성, 느슨한 결합
  State : 객체 상태 캡슐화, 원시코드 수정 최소화, 유지보수 편의성
  Visitor : 구조 변경 안함, 기능만 추가 확장
  Strategy : 행위를 클래스로 캡슐화, 행위 자유롭게 변환

- NAC(network access control) 네트워크 접근 제어 : 불법 사용자에 대한 네트워크 제어 및 통제기능
  방화벽 : 기업 내외부
  웹 방화벽 : app 보안 특화, SQL Injection, XSS 탐지 차단
  IDS(intrusion detection system) 침입 탐지 시스템: 이벤트 모니터링, 비인가 사용자 실시간 탐지
  IPS 침입 방지 시스템 : 침입 실시간 차단
  WPS 무선 침입 방지 시스템 : 비인가 무선 단말기 탐지 차단
  UTM 통합 보안 시스템 : 보안 장비 하나로
  VPN 가상사설망 : 전용망 사용하는 효과

- Secure SDLC 방법론
  Seven TouchPoints : 실무 검증 SDLC 보안 생명주기 방법론
  MS SDL : ms사
  OWASP CLASP : 이미 운영중인 시스템에 적용하기 쉬움

- 회복 기법 (회로체크)
  로그 기반 회복 기법 : 지연 갱신 : 완료 전에 기록 안함, 즉각 갱신 : 바로
  체크 포인트 회복 기법 : 장애 발생 이전 상태 복원
  그림자 페이징 회복 기법 : 복제본 생성

- 클라우드 서비스 유형
  IaaS : 시스템 자원 클라우드로 제공, 스토리지, 앱 제어권 가짐
  PaaS : 앱에서 개발, 실행, 관리 서비스
  SaaS : 중앙 호스팅, 주문형 sw

- 기본 키(Primary Key) : 고유 식별
  대체 키(Altermate Key) : 후보 키 중 기본 키 아님
  후보 키(Candidate Key) : 유일성O, 최소성O, 기본키+대체키, 튜플 구별
  슈퍼 키(Super Key) : 유일성O, 최소성X
  외래 키(Foreign Key) : 참조 데이터 무결성 위한 조건
  임시 키 무결성 프로토콜(TKIP) : WEP 대체 암호 프로토콜

- Tripwire : 시스템 백도어 감지
  Tcpdump : 공격자 추적 활용

- HA 고가용성 : 두 개 이상의 시스템 클러스터로 구성, 하나 중단돼도 대체작동(fail over)는 기술

- WDM(Wavelength Division Multiplexing) : 광섬유 다중화
  DWDM : 수십, 수백개 파장의 광신호 동시 변조

- Devops : 소프트웨어 개발조직과 운영조직 간의 상호 의존적

- Pharming : 주소입력 -> 가짜 주소 접속
  Smishing : 문자메세지
  Qshing : 스마트폰 금융
  Spear Phishing : 사회공학, 메일 링크


- 다중화기 : 시간 분할TDM, 주파수 분할FDM, 코드 분할CDM

- 딥러닝 : 합성곱 신경망(CNN)-비지도 학습, 순환 신경망(RNN)-연속적인 정보 흐름 학습

- 경곗값 분석 테스트 : 등가 분할 후 경곗값 부분에서 오류가 날 확률이 높기 때문에 경곗값을 포함하여 테스트 케이스를 설계하는 테스트 기법

- 블랙박스 테스트 유형 : 동경결상 유분페원비오
- 화이트박스 테스트 유형 : 구결조 조변다 기제데

- V모델 테스트 : 단통시인(단위, 통합, 시스템, 인수)

- 절차형 SQL 프로시저, 사용자 정의함수, 트리거가 있다.
  프로시저 : 쿼리들을 하나의 함수처럼
  사용자 정의함수 : 수행결과를 단일 값으로 변환
  트리거 : 삽삭갱 이벤트 발생할 때마다 관련 작업 자동으로 수행

- 클래스 다이어그램 : 클래스, 속성, 연산(메서드), 접근 제어자(-+#~)

- 서버 접근 통제 유형(임강역)
  임의적 접근통제(DAC) : 신분기반
  강제적 접근통제(MAC) : 접근 허가 권한 근거
  역할기반 접근통제(RBAC) : 역할 기반

- 공개키 : RSA, ECC
- 비공개키 : AES(DES 해결책, 128bit)

- 페이징 기법 문제점 & 해결 방안
  스레싱 : 페이지 교체 시간이 더 많아짐
  워킹 세트 : 빈번한 교체 현상 줄이고자
  페이지 부재 빈도 : 페이지 부재율 예측 조절

- 배치 프로그램(이온정)
  이벤트 : 사전 정의 조건 충족
  온디멘드 : 사용자 명시적 요구
  정기 : 정해진 시점, 정기적


- 순수함수 : 동일값 반환
  익명함수 : 이름없는 함수, 람다함수
  고계함수 : 반환값 사용 가능

- 은행가 알고리즘 : 회피, 안정되면 자원할당

- DISTINCT 중복제거
  DESC 내림차순
  ASC 오름차순
  JOIN ON
  LIKE 패턴

- SELECT A FROM T WHERE A LIKE P;
P패턴 : %, [], [^], _

- UNION : 중복 제외
  UNION ALL : 중복 포함
  INTERSECT : 중복 만
  MINUS : 나만

- SELECT A FROM T1 CROSS JOIN T2;
- SELECT A FROM T WHERE A ISNULL OR A=0;
- SELECT A FROM T1 RIGHT JOIN T2 ON C;
- DELETE FROM T WHERE C AND C';
- ALTER TABLE T ADD(MODIFY, DROP) A TYPE(1) CHECK(A='a');
- ALTER TABLE T MODIFY A TYPE(1) DEFAULT 1;
- REVOKE 권한 ON T FROM U CASCADE CONSTRAINTS;
- GRANT 권한 ON T TO U [option];
- CREATE INDEX I ON T(A);
- UPDATE T SET A=V WHERE C;
- ORDER BY A DESC;
- INSERT INTO T(A...) VALUE (V...);

- range(start, stop, step)
- chmod 751 a.txt

- 리뷰유형
  인스펙션 : 형식적, 전문가, 팀
  워크스루 : 짧은 시간
  동료검토 : 2-3명 명세서, 설명 들으면서 결함 발견


- NoSQL : 수평적 확장 가능, 고정된 테이블 스키마X, 조인X
  Key-Value Store
  그래프 스토어 : 시맨틱 웹, 온톨로지에서 활용
  Column Family Data Store : Key안에 Column, Value 조합
  Document Store : Value의 데이터 타입이 Document
- SW Architecture 비용 평가 모델
  SAAM : 평가 용이, 경험 없는 조직 사용 가능
  ATAM : 이해 상충관계까지 평가
  CBAM : ATAM 바탕, 의사결정 요구 충족
  ADR : 응집도
  ARID : 특정 부분만 평가

- 네트워크 계층 프로토콜
  IP : 패킷 교환
  ARP : IP -> MAC
  RARP : MAC아는데 IP모름
  ICMP : 8바이트, 수신 불가 메시지
  IGMP : 그룹, 화상회의
  라우팅 프로토콜(Routing Protocol) : 최적 경로

- 라우팅 프로토콜 : RIP(거리벡터 알고리즘), OSPF(링크 상태 알고리즘), EIGRP, BGP
  라우팅 알고리즘 : 거리벡터 방식, 링크 상태 방식

- IGP : 동일한 AS 내, RIP, OSPF(지역으로 나눠 관리)
- EGP : 서로 다른 AS, BGP(변화된 정보만 교환)
- import export gateway protocol(원래는 Interior, Exterior)

- HIPO 차트(가총세) : 가시적, 총체적, 세부적

- 데이터베이스 암호화 기법
  API 방식 : 앱
  Plug-In : DB
  TDE : 커널, 내장된 암호화기능
  Hybrid : API+PlugIn

- 소프트웨어 아키텍처(유논프구배)
  유스케이스 : 다른 뷰 검증
  논리 : 기능적
  프로세스 : 비기능적
  구현 : 정적, 구조, 의존성
  배포 : 배치, 매핑

- 보안 관련
  해시 함수 : 메시지 오류나 변조 탐지
SET : 온라인상 안전한 거래
SSO (single sign on) : 통합인증

- 보안 관련(공격)
  공급망 공격 : 자동적으로 감염
  제로데이 공격 : 발견 전 공격
  웜 : 복제
  악성 봇 : 해커가 시킴
  사이버 킬체인 : 록히드 마틴, APT 공격 방어 분석 모델

- 네트워크 공격
  IP Spoofing : 인증된 호스트의 IP주소 위조
  ARP Spoofing : 자신의 MAC 주소를 다른 컴퓨터의 MAC인 것 처럼 속임
  ICMP Redirect 공격 : 특정 목적지로 가는 패킷을 공격자가 스니핑
  트로이목마 : 악성 루틴 숨겨 실행하면 악성 코드 실행
  sniffing : 직접 공격X, 몰래 정보만 보는 수동적 공격

- 랜섬웨어 : 몸값요구
- 워터링 홀 Watering hole : 미리 감염, 방문 -> 악성 배포
- 드라이브 바이 다운로드 : 악성 스크립트, 멀웨어로 연결 -> 감염

- 세션 하이재킹 : TCP의 세션 관리 취약점 이용한 공격기법, 비동기화 상태로 패킷 유실, 네트워크 부하 증가 현상

- 입력 데이터 검증 및 표현 취약점
  XSS
  사이트 간 요청 위조
  SQL injection




- EAI 구축 유형(기업 내 애플리케이션 사이의 통신을 제공하는 프로세스)
  Point-to-Point 1:1
  허브 앱 스포크
  메시지 버스
  하이브리드

- IPC : 공유메모리, 소켓, 세마포어, 메세지 큐, 프로세스 간 통신

- 트랜잭션 상태 변화
  활동 - 부분 완료 - (commit) - 완료
  활동 - 실패 - (rollback) - 철회

- 파티셔닝(범해목조)
  범위, 해시, 목록, 조합(컴포지트)

- SW Architecture 패턴
  계층화
  클라이언트-서버
  파이프-필터
  브로커
  모델-뷰-컨트롤러 MVC

- 프로세스 스케줄링
  선점형 스케줄링 : 우선순이 높은 애가 현재 프로세스 중단 CPU 점유
  비선점형 스케줄링

- 선점형 스케줄링 알고리즘
  라운드 로빈 : 프로세스는 같은 크기의 CPU 시간 할당
  SRT : 시간 짧은 것
  MLQ 다단계 큐 : 큐
  MLFQ 다단계 피드백 큐 : FCFS 마지막은 라운드로빈 방식

- 비선점형 스케줄링 알고리즘
  우선순위 : 우선순위 주어짐
  기한부 : 기한 내에
  FCFS : 도착한 순서
  SJF : 가장 작은, 가장 짧은
HRN : 응답률 높은 것, 기아 현상,
반=종-도, 대=반-서, 우=대서/서
- TCP : 전송 계층, 근거리 통신망, 안정적
- UDP : 비연결성, 신뢰성 없음, 순서화 안됨

- 재해복구센터DRS
  Mirror Site : 즉시
  Hot Site : 동기비동기, 4시간 이내
  Warm Site : 중요성 높은 자원, 수일-수주
  Cold Site : 수주-수개월

- 관계 대수 : 절차적 언어
  관계 해석 : 비절차적 언어

- 폭포수 모델 : 선형 순차적
  프로토타이핑 모델 : 피드백 반영
  나선형 모델 : 위험 최소화, 점진적
  반복적 모델 : 병렬, 반복

- 단방향 암호
  MAC : 메시지 무결성, 송신자 인증
  MDC : 변경감지코드, 메시지 무결성

- 스택오버플로우 : 복귀 주소 변경 -> 공격
  스택가드 : 카나리
  스택쉴드 : Global RET

- 아키텍처 패턴
  레이어 패턴 : 시스템 계층, 마주 보는 계층 사이 상호 작용
  파이프필터 패턴 : 서브 -> 서브 넘겨줌, 재사용성 좋음, 확장 용이
  클라이언트서버 패턴 : 1서버 다클라이언트
  MVC 패턴 : 모델, 뷰, 컨트롤러
브로커 패턴 : 분산시스템,
(서버 -> 브로커 -> 클라이언트)

- 다크 데이터 : 수집 -> 저장, 분석 활용X

- 고립화 수준
  Read Uncommitted : 읽기 허용
  Read committed : 읽기 제한
  Repeatable Read : 갱신삭제 제한
  Serializable Read : 접근 제한


- 프로세스 상태 전이도
  생준 실대완(생성, 준비, 실행, 대기, 완료)

- 오라클
  참, 샘플링, 휴리스틱(추정), 일관성

- WSDL : XML형식, 웹 서비스 상세 정보

- 로킹 : 같은 자원 다중 트랜잭션, 일관성 무결성 유지, 순차적, 직렬화

- (ㅡ) 튜플, 카디널리티
- (ㅣ) 속성, 차수, degree
