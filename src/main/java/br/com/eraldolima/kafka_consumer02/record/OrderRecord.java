package br.com.eraldolima.kafka_consumer02.record;

import java.math.BigDecimal;

public record OrderRecord(Long id, String name, String description, BigDecimal amount) {

}
