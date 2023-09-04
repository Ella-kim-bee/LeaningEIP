### 오류 제어 방식
- BEC 방식
- 블록합검사 : 잉여 패리티 비트 사용, 이차원(가로세로) 패리티 검사 방식
- ARQ : 오류 검출(체크섬 등) 정보로 에러 발생 유무 점검, 에러 발생 프레임에 대해 재전송 요구
- 2계층(데이터 링크 계층) 오류 제어
  - FEC 해밍코드
    - 송신 -> 수신 -> 오류 받았을 때 자체 수정
  - BEC
    - 송신 -> 수신 -> 오류 받았을 때 송신한테 재전송 요청
    - 패리티 검사(짝수, 홀수), 블록합검사(다중 비트), CRC(다항식 연산), ARQ(데이터 내에 첨부된 오류 검출 정보 이용해서 오류 어떤 비트 오류가 있는 지 발견해서 재전송 요청)

  - ARQ
    - stop & wait : 하나씩, 정상:송->수-ack->송, 오류:송->수-NACK->송
    - Go-Back-N : 뭉탱이(ex 4개), 정상:송->수-ack->송, 오류(3번 오류, 오류 이후 데이터 모두 다시 보냄):송->수-3NACK->송-3,4->수
    - Selective : 뭉탱이(ex 4개), 정상:송->수-ack->송, 오류(2번 오류):송->수-2NACK->송-2, 다음 뭉탱이 보냄->수
---