package com.kdacademy.graphql.mutations.demo.mutationsdemo.model;

import java.time.OffsetDateTime;

public record Order(Integer orderId, Coffee coffee, User user, OffsetDateTime orderedOn) {
    
}
