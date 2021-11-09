 package com.example.demo.service;

  import com.example.demo.entity.Order;
  import org.springframework.stereotype.Service;

  import java.util.ArrayList;
  import java.util.HashMap;
  import java.util.List;
  import java.util.Map;
  import java.util.concurrent.atomic.AtomicInteger;

  @Service
  public class OrderService implements IOrderService {
    private static final Map<Integer, Order> ORDER_REPOSITORY_MAP = new HashMap<>();

    private static final AtomicInteger ORDER_ID_HOLDER = new AtomicInteger();

     @Override
    public void create(Order order) {
        final int clientId = ORDER_ID_HOLDER.incrementAndGet();
         order.setId(order.getId());
        ORDER_REPOSITORY_MAP.put(clientId, order);
      }
      @Override
     public List<Order> readAll() {
        return new ArrayList<>(ORDER_REPOSITORY_MAP.values());
    }

     @Override
     public Order read(int id) {
        return ORDER_REPOSITORY_MAP.get(id);
     }
 
     @Override
    public boolean update(Order order, int id) {
        if (ORDER_REPOSITORY_MAP.containsKey(id)) {
            order.setId((long) id);
             ORDER_REPOSITORY_MAP.put(id, order);
             return true;
         }

        return false;
     }
 
     @Override
     public boolean delete(int id) {
        return ORDER_REPOSITORY_MAP.remove(id) != null;
    }
     }


