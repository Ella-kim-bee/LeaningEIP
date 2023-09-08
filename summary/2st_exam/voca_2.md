#### 트랜잭션 특징
- 트랜잭션: 논리적 작업 단위
- *ACID (원일격영)*
- 원자성 Atomicity
  - 트랜잭션 성공 or 실패, 기면기고 아니면 아님, All or Nothing
  - Commit / Rollback 회복성 보장
- 일관성 Consistency
  - 트랜잭션 수행 전과 후가 같음, 계속 빈 값이거나 계속 데이터가 있거나
  - 무결성 제약 조건, 동시성 제어
- 격리성=고립성 Isolation
  - 트랜잭션이 다른 트랜잭션으로부터 독립, 작업 중 간섭 받지 않음
  - Read Uncommitted, Read Commited, Repeatable Read, Serializable
- 영속성 Durability
  - 트랜잭션 수행하면 기록에 남겨야함.
  - 회복 기법

#### 트랜잭션 상태변화
- 활성 -> 부분완료 -- commit --> 완료
- 활성 -> 실패 -- rollback --> 철회

#### 트랜잭션 제어 TCL
- COMMIT : 메모리에 영구적 저장
- ROLLBACK : 저장 무효화
- CHECKPOINT : ROLLBACK 시점 지정

#### 병행 제어 미보장 시 문제점
- 갱신 손실, 현황 파악오류, 모순성, 연쇄복귀
  - 갱신 손실 Lost Update : 덮어쓰기 오류
  - 현황 파악오류 Dirty Read : 수행 중간에 다른 트랜잭션이 참조하여 발생하는 오류
  - 모순성 Incosistency : 동시 수행, DB 일관성 결여
  - 연쇄복귀 Cascading Rollback : 복수 트랜잭션 중 취소할 경우 부분 취소 안됨

#### 병행 제어 기법 종류
- 로킹Locking : 일관성, 무결성 유지, 순차적 진행, 직렬화
  - 로킹 단위 작아짐 => DB 공유도 증가, 로킹 오버헤드 증가
- 낙관적 검증 : 검증 수행 안함, 종료 시 검증
- 타임 스탬프 순서 : 실행 전 타임스탬프, 부여된 시간에 따라 작업 수행
- 다중버전 동시성 제어MVCC : 트랜잭션-DB 타임스탬프 직렬
