# Java 배열 순회와 증감 연산자 정리

## 1. 일반 for문

배열의 인덱스를 직접 사용하면서 반복하는 방식이다.

```java
for (int i = 0; i < numlist.length; i++) {
    System.out.println(numlist[i]);
}
```

### 구성

```java
for (초기값; 반복 조건; 증감식) {
    실행할 코드
}
```

```java
for (int i = 0; i < numlist.length; i++)
```

각 부분의 의미는 다음과 같다.

* `int i = 0` : 인덱스를 0부터 시작
* `i < numlist.length` : 배열 길이만큼 반복
* `i++` : 1씩 증가
* `numlist[i]` : 현재 인덱스의 값

### 사용 상황

* 인덱스가 필요한 경우
* 위치와 값을 함께 다뤄야 할 때

```java
for (int i = 0; i < numlist.length; i++) {
    System.out.println("인덱스: " + i);
    System.out.println("값: " + numlist[i]);
}
```

---

## 2. 향상된 for문 (for-each)

배열의 값을 순서대로 하나씩 꺼내 사용하는 방식이다.

```java
for (int num : numlist) {
    System.out.println(num);
}
```

### 문법

```java
for (자료형 변수 : 배열) {
    실행 코드
}
```

### 의미

```text
배열의 값을 앞에서부터 하나씩 꺼내 변수에 저장한다.
```

### 예시

```java
int[] numlist = {10, 20, 30};

for (int num : numlist) {
    System.out.println(num);
}
```

출력:

```text
10
20
30
```

### 사용 상황

* 값만 필요할 때
* 인덱스가 필요 없을 때

```java
for (int num : numlist) {
    if (num % n == 0) {
        count++;
    }
}
```

### 주의점

* 인덱스를 직접 알 수 없음
* 위치 기반 로직에는 부적합

---

## 3. 증감 연산자 `++`, `--`

### 1) 증가 연산자

```java
index++;
```

의미:

```java
index = index + 1;
```

### 2) 감소 연산자

```java
index--;
```

의미:

```java
index = index - 1;
```

---

## 4. 후위 증가 연산자 (index++)

현재 값을 먼저 사용하고 나중에 증가한다.

```java
int index = 0;
int result = index++;
```

실행 순서:

```text
result = index (0)
index = index + 1
```

결과:

```text
result = 0
index = 1
```

---

## 5. 전위 증가 연산자 (++index)

먼저 증가하고 그 값을 사용한다.

```java
int index = 0;
int result = ++index;
```

실행 순서:

```text
index = index + 1
result = index
```

결과:

```text
result = 1
index = 1
```

---

## 6. index++ vs ++index 비교

| 구분      | 실행 순서   | 사용 값   |
| ------- | ------- | ------ |
| index++ | 사용 후 증가 | 증가 전 값 |
| ++index | 증가 후 사용 | 증가 후 값 |

단독 사용 시 결과는 동일하다.

```java
index++;
++index;
```

---

## 7. 배열에 값 넣기 + index++

```java
answer[index++] = num;
```

의미:

```java
answer[index] = num;
index++;
```

### 예시

```java
int[] answer = new int[3];
int index = 0;

answer[index++] = 10;
answer[index++] = 20;
```

결과:

```text
[10, 20, 0]
```

---

## 8. 일반 코드 vs 축약 코드

### 일반 for문

```java
for (int i = 0; i < numlist.length; i++) {
    if (numlist[i] % n == 0) {
        answer[index] = numlist[i];
        index++;
    }
}
```

### 향상된 for문 + index++

```java
for (int num : numlist) {
    if (num % n == 0) {
        answer[index++] = num;
    }
}
```

---

## 9. n의 배수 필터링 예제

```java
class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;

        for (int num : numlist) {
            if (num % n == 0) {
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;

        for (int num : numlist) {
            if (num % n == 0) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}
```

---

## 10. 핵심 정리

### 향상된 for문

```java
for (int num : numlist)
```

* 값만 필요할 때 사용
* 인덱스 접근 불가

---

### index++

```java
index++;
```

* 1 증가
* `index = index + 1`과 동일

---

### 배열 삽입 패턴

```java
answer[index++] = num;
```

* 현재 위치에 저장
* 저장 후 index 증가

---

### 학습 팁

처음에는 반드시 풀어서 이해:

```java
answer[index] = num;
index++;
```

익숙해지면 축약:

```java
answer[index++] = num;
```
