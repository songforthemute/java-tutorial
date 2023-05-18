# Stage 2

---

## 목차

- [switch/case](#switchcase)
- [for loop](#for-loop)

---

### switch/case

- `switch` 조건문에 들어갈 수 있는 입력 변수의 타입은 `byte`, `short`, `char`, `int`만 가능
- `break` 문이 빠져 있다면 탈출하지 않고 그 다음의 `case`문 실행

---

### for loop

**for loop**

```
String[] numbers = {"one", "two", "three"};

for(int i = 0; i < numbers.length; i++){
    System.out.println(numbers[i]);
}
```

- `for (초기치; 조건문; 증가치) { ... }`

**for each**

```
String[] numbers = {"one", "two", "three"};

for(String number : numbers){
    System.out.println(number);
}
```

- `for (type var: iterate) { ... }`
- `iterate` 루프를 돌릴 객체 (배열, ArrayList 등)