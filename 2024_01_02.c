#include <stdio.h>

int main() {
    // 초기 변수 값
    int v1 = 0;
    int v2 = 35;
    int v3 = 29;

    // 조건문
    if (v1 > v2 ? v2 : v1) {
        v2 = v2 << 2; // v2를 왼쪽으로 2비트 이동 (v2를 4배로 만듦)
    } else {
        v3 = v3 << 2; // v3를 왼쪽으로 2비트 이동 (v3를 4배로 만듦)
    }

    // v2와 v3의 합을 출력
    printf("%d\n", v2 + v3);

    return 0;
}

{/*
    비트 연산자인 왼쪽 시프트(<<)는 주어진 값을 왼쪽으로 지정된 비트 수만큼 이동시킵니다.
    이는 해당 값을 2의 비트 수 제곱만큼 곱하는 효과가 있습니다.

    v3 << 2는 29 << 2로, 29를 4배로 만듭니다.
    29 * 4 = 116
    따라서 v3는 116이 됩니다.

    v2 = 35 (변경되지 않음)
    v3 = 116 (변경됨)
    따라서 v2 + v3는 35 + 116 = 151이 됩니다.

*/}

비트 연산자

1. AND (&)
a = 5;  // 0101 in binary
b = 3;  // 0011 in binary
result = a & b;  // 0001 in binary, which is 1 in decimal

2. OR (|)
a = 5;  // 0101 in binary
b = 3;  // 0011 in binary
result = a | b;  // 0111 in binary, which is 7 in decimal

3. XOR (^)
a = 5;  // 0101 in binary
b = 3;  // 0011 in binary
result = a ^ b;  // 0110 in binary, which is 6 in decimal

4. NOT (~)
a = 5;  // 0101 in binary
result = ~a;  // 1010 in binary (in 4 bits), which is -6 in decimal (due to two's complement representation) 0 ->1, 1->0

5. 왼쪽 시프트 연산자 (<<)
a = 5;  // 0101 in binary
result = a << 1;  // 1010 in binary, which is 10 in decimal
a << n // a * 2의 n승

6. 오른쪽 시프트 연산자 (>>)
a = 5;  // 0101 in binary
result = a >> 1;  // 0010 in binary, which is 2 in decimal
a >> n // a / 2의 n승 => 소수점 버림으로 정수