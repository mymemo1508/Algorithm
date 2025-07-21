## [JavaScript로 알고리즘 풀기 - 백준 문제집 url](https://www.acmicpc.net/workbook/view/2032)

### 1. 실행 단축키

```
Ctrl + Alt + N
```

---

### 2. 디버깅 단축키

> 확인하고 싶은 문장에 debugger 걸고,<br/>
> TERMINAL에서 node + 실행하고자 하는 js 파일
> <br/>

ex. 파일명: index.js --> <code> node index </code>

---

### 3. index.js 파일

example.txt의 내용을 받아서 실행시키는 파일

```
let input = require('fs').readFileSync('example.txt').toString().split('\n');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
console.log(a+b);
```

---

### 4. 백준 업로드 코드

readFileSync 안의 값 <code> /dev/stdin </code> 으로 처리

---

### 5. 예제 입력 받기 <br/>

1. 한 줄에 공백으로 값이 들어올 때

> 1 2 로 들어올 때

```
var input = require('fs').readFileSync('/dev/stdin').toString().split(' ');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
```

input 변수에 공백으로 split한 문자들이 array 형태로 들어온다. <br/> parseInt를 통해서 하나하나 분리한다.

---

2. 한 줄에 하나씩 값이 들어올 때

> 1 <br/>
> 2 <br/>
> 처럼 개행을 기준으로 값이 하나씩 들어올때

```
var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
```

'\n' 개행문자로 split한다.
