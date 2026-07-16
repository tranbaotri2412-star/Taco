package guru.spring.demo.Repository;

import guru.spring.demo.Model.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
