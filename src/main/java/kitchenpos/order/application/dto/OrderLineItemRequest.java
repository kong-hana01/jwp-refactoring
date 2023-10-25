package kitchenpos.order.application.dto;

import java.util.Objects;

public class OrderLineItemRequest {

    private Long menuId; // 애그리거트 분리를 위해 id 참조
    private long quantity;

    private OrderLineItemRequest() {
    }

    public OrderLineItemRequest(final Long menuId, final long quantity) {
        this.menuId = menuId;
        this.quantity = quantity;
    }

    public Long getMenuId() {
        return menuId;
    }

    public long getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderLineItemRequest that = (OrderLineItemRequest) o;
        return quantity == that.quantity && Objects.equals(menuId, that.menuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, quantity);
    }
}
