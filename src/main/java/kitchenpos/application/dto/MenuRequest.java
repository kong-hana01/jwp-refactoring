package kitchenpos.application.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class MenuRequest {

    private final String name;
    private final BigDecimal price;
    private final Long menuGroupId;
    private final List<MenuProductRequest> menuProductRequests;

    public MenuRequest(final String name,
                       final BigDecimal price,
                       final Long menuGroupId,
                       final List<MenuProductRequest> menuProductRequests) {
        this.name = name;
        this.price = price;
        this.menuGroupId = menuGroupId;
        this.menuProductRequests = menuProductRequests;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getMenuGroupId() {
        return menuGroupId;
    }

    public List<MenuProductRequest> getMenuProductRequests() {
        return menuProductRequests;
    }

    public List<Long> getProductIds() {
        return menuProductRequests.stream()
                .map(MenuProductRequest::getProductId)
                .collect(Collectors.toList());
    }

    public int getProductSize() {
        return menuProductRequests.size();
    }
}