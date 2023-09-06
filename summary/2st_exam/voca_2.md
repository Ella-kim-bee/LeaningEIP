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

####
