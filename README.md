# 🎬 Object Theater App

## 🎯 목표
『오브젝트(조영호 저)』 의 극장 예제를 기반으로  
**객체 협력 중심의 설계 → 테스트 → 애플리케이션 확장**까지 경험한다.

---

## 🛠️ 진행 플랜

### ✅ 1단계: 절차지향 구조 구현
- 하나의 클래스에 모든 로직을 담아 처리
- `Ticket`, `Bag`, `Audience`, `TicketOffice`, `Theater` 등
- [docs/01-procedural.md](./docs/01-procedural.md) 문서 참고

### ✅ 2단계: 객체 중심 설계로 리팩토링
- 책임과 행위를 적절한 객체로 이동
- 메시지를 통해 객체 간 협력 구현
- `Audience.buy()`, `Bag.hold()`, `TicketOffice.sellTicket()` 등
- (예정) [docs/02-objectmodel.md](./docs/02-objectmodel.md)

### ✅ 3단계: 데이터 중심 설계 비교 및 한계 실험
- 게터/세터 위주의 데이터 중심 접근
- 캡슐화가 무너지며 발생하는 문제 파악
- (예정) [docs/03-data-centric.md](./docs/03-data-centric.md)

### ⏭️ 이후 확장 단계

#### UI 레이어 연동
- Spring Web 으로 REST API
- 예: `POST /theater/enter` 요청 시 입장 처리

#### DB 연동 (Spring Data JPA)
- JPA 기반 Repository 구현
- 도메인 모델을 최대한 순수하게 유지

---

## 🧱 기술 스택
- Java 21
- Spring Boot 3.4.4 (확장 단계)
- Gradle
- JUnit5
- (예정) Spring Web, Lombok, JPA

---

## 📚 문서 모음

- [01 - 절차지향 구조 구현 및 테스트](./docs/01-procedural.md)
- [02 - 객체 중심 구조 리팩토링](./docs/02-objectmodel.md) *(작성 예정)*
- [03 - 데이터 중심 설계와 비교](./docs/03-data-centric.md) *(작성 예정)*

---

## 📦 프로젝트 구조 예시
```
src/
├── main/
│   └── java/
│       └── com/
│           └── jane/
│               └── objecttheater/
│                   ├── procedural/           ← 1단계: 절차지향 구현
│                   │   └── Theater.java
│                   └── objectmodel/          ← 2단계: 객체지향 리팩토링
│                       ├── audience/
│                       │   ├── Audience.java
│                       │   └── Bag.java
│                       ├── ticket/
│                       │   ├── Invitation.java
│                       │   └── Ticket.java
│                       └── theater/
│                           ├── TicketOffice.java
│                           ├── TicketSeller.java
│                           └── Theater.java

├── test/
│   └── java/
│       └── com/
│           └── jane/
│               └── objecttheater/
│                   └── objectmodel/
│                       └── theater/
│                           └── TheaterTest.java
```
