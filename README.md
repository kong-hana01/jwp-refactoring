# 키친포스

## 요구 사항
- [x] 테스트 보호를 위한 커스텀 예외 적용

### 메뉴 그룹
- [x] 메뉴 그룹을 생성할 수 있다.
- [x] 현재 저장된 메뉴 그룹 목록을 확인할 수 있다.

### 메뉴
- [x] 메뉴는 메뉴 상품의 리스트를 가지고 있다.
  - [x] 메뉴 상품은 상품과 수량을 가지고 있다.
- [x] 메뉴를 생성할 수 있다.
  - [x] 메뉴의 가격이 `null이면 예외가 발생`한다.
  - [x] 메뉴의 가격이 `0원 이하면 예외가 발생`한다.
  - [x] 메뉴의 가격은 `전체 상품의 가격보다 크면 예외가 발생`한다.
  - [x] `메뉴`가 `현재 존재하는 메뉴 그룹에 포함되어 있지 않으면 예외가 발생`한다.
  - [x] `메뉴의 상품 목록`이 `현재 존재하는 상품에 포함되어 있지 않으면 예외가 발생`한다.
  - [x] 메뉴를 저장할 때 `메뉴 상품들도 함께 저장`한다.
- [x] 현재 저장된 메뉴 목록을 확인할 수 있다.

### 주문
- [x] 주문을 생성할 수 있다.
  - [x] 주문에는 `주문 항목이 없으면 예외가 발생`한다.
  - [x] 주문 항목에 있는 `메뉴`는 `현재 존재하는 메뉴에 포함되어 있지 않으면 예외가 발생`한다.
  - [x] 주문에 포함된 `주문 테이블 번호`는 `현재 존재하는 주문 테이블 번호에 포함되어 있지 않으면 예외가 발생`한다.
  - [x] 주문에 포함된 주문 테이블은 `빈 테이블이면 예외가 발생한다.`
  - [x] 주문을 생성한 이후 주문은 `COOKING` 상태를 가진다.
  - [x] 주문을 생성하는 시점에 `주문 시간이 기록`된다.
  - [x] 주문을 저장할 때 `주문 항목도 함께 저장`된다.
- [x] 현재 저장된 주문 목록을 확인할 수 있다.
- [x] 주문 상태를 변경할 수 있다.
  - [x] 주문이 `db에 저장되어있지 않으면 예외가 발생`한다.
  - [x] 현재 주문 상태가 `COMPLETION이면 예외가 발생`한다.
    - [x] 주문 상태는 `잘못된 이름의 주문 상태가 전달되면 예외가 발생`한다.

### 상품
- [x] 상품을 생성할 수 있다.
  - [x] 상품의 가격이 `null이면 예외가 발생`한다.
  - [x] 상품의 가격이 `0원 미만이면 예외가 발생`한다.
- [x] 현재 저장된 상품 목록을 확인할 수 있다.

### 단체 지정
- [x] 테이블 그룹을 생성할 수 있다.
  - [x] 테이블 그룹에 포함된 `주문 테이블의 개수가 1개 이하이면 예외가 발생`한다.
  - [x] 테이블 그룹에 포함된 `주문 테이블 번호`는 `현재 존재하는 주문 테이블 번호에 포함되어 있지 않으면 예외가 발생`한다.
  - [x] 주문 테이블은 `매핑된 테이블 그룹의 번호가 있으면 예외가 발생`한다.
  - [x] 주문 테이블이 `빈 테이블이 아니면 예외가 발생`한다.
  - [x] 테이블 그룹을 생성하는 시점에 `테이블 생성 시간이 기록`된다.
  - [x] 지정된 주문 테이블을 `주문을 받을 수 있는 테이블`로 만들고, `테이블 그룹을 지정`한 뒤 `저장`한다.
- [x] 테이블 그룹을 해제할 수 있다.
  - [x] 테이블 그룹에 포함된 주문 테이블 중 `COOKING 상태이거나 MEAL 상태인 주문의 주문 테이블이 있으면 예외가 발생`한다.
  - [x] 테이블 그룹에 포함된 주문 테이블의 주문 테이블의 `테이블 그룹을 해제`하고, `빈 테이블로 변경`한다.

### 주문 테이블
- [x] 주문 테이블을 생성할 수 있다
  - [x] 처음 주문 테이블을 생성할 때 테이블 그룹을 설정하지 않는다.
- [x] 현재 저장된 주문 테이블을 확인할 수 있다.
- [x] 주문 테이블을 빈 테이블로, 빈 테이블을 주문 테이블로 바꿀 수 있다.
  - [x] 주문 테이블이 `db에 저장되어있지 않으면 예외가 발생`한다.
  - [x] 주문 테이블이 `어떤 테이블 그룹에 포함되어 있으면 예외가 발생`한다.
  - [x] 주문 테이블에 `매핑된 주문이 COOKING 상태이거나 MEAL 상태라면 예외가 발생`한다.
- [x] 방문한 손님 수를 바꿀 수 있다.
  - [x] `방문한 손님 수가 0명 미만인 경우 예외가 발생`한다.
  - [x] 주문 테이블이 `db에 저장되어있지 않으면 예외가 발생`한다.
  - [x] 주문 테이블이 `빈 테이블인 경우 예외가 발생`한다.


## 적용해볼만한 지점(요구사항 x)
### Controller test
- WebMvcTest: 컨트롤러의 테스트이더라도 컨트롤러에 필요한 빈들만 띄워서 테스트에 이용 가능
  - 컨트롤러보다 하위 계층은 자동 구성 x -> MockBean으로 가져와야함
  - 컨텍스트를 모두 띄워도 되지 않아 속도가 더 빠름
- assertSoftly: assertSoftly는 틀린 지점의 기대값/실제값을 비교해 알려줌
  - assertAll은 예외가 하나만 터지더라도 테스트 실패하는 것만 알려줌 
- fake 객체: mock 객체는 내부 구현이 각 테스트 메소드마다 존재하게 됨. 리팩토링 시 변경사항이 많아짐
  - fake 객체는 실제 객체를 구현한 가짜 객체로 내부 구현을 숨기면서 실제 동작을 확인할 수 있음

## 서비스 리팩터링
- [ ] 단위 테스트하기 어려운 코드와 단위 테스트 가능한 코드를 분리해 단위 테스트 가능한 코드에 대해 단위 테스트를 구현한다.
- [ ] 프로그래밍 요구사항을 지킨다.
- [ ] 비즈니스 로직을 도메인 객체가 담당하도록 변경한다.
  - [ ] 도메인 객체의 생성자를 활용해 전달한다.
  - [ ] 도메인 객체의 setter를 사용하지 않는다. 
  - [ ] pr 전 도메인 객체의 기본 생성자를 protected로 변경한다.

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 상품 | product | 메뉴를 관리하는 기준이 되는 데이터 |
| 메뉴 그룹 | menu group | 메뉴 묶음, 분류 |
| 메뉴 | menu | 메뉴 그룹에 속하는 실제 주문 가능 단위 |
| 메뉴 상품 | menu product | 메뉴에 속하는 수량이 있는 상품 |
| 금액 | amount | 가격 * 수량 |
| 주문 테이블 | order table | 매장에서 주문이 발생하는 영역 |
| 빈 테이블 | empty table | 주문을 등록할 수 없는 주문 테이블 |
| 주문 | order | 매장에서 발생하는 주문 |
| 주문 상태 | order status | 주문은 조리 ➜ 식사 ➜ 계산 완료 순서로 진행된다. |
| 방문한 손님 수 | number of guests | 필수 사항은 아니며 주문은 0명으로 등록할 수 있다. |
| 단체 지정 | table group | 통합 계산을 위해 개별 주문 테이블을 그룹화하는 기능 |
| 주문 항목 | order line item | 주문에 속하는 수량이 있는 메뉴 |
| 매장 식사 | eat in | 포장하지 않고 매장에서 식사하는 것 |
