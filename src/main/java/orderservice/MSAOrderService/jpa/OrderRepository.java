package orderservice.MSAOrderService.jpa;

import org.aspectj.weaver.ast.Or;
import org.hibernate.criterion.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
    OrderEntity findByOrderId(String orderId);

    // 덩어리 데이터를 불러오기 위한 로직은 아래의 코드를 참고한다.
    Iterable<OrderEntity> findByUserId(String userId);
}
