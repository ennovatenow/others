package com.evolvus.examples.others.processor;

import org.springframework.batch.item.ItemProcessor;

import com.evolvus.examples.others.domain.CustomerCredit;

public class CustomerCreditProcessor implements
        ItemProcessor<CustomerCredit, CustomerCredit> {

    public CustomerCredit process(CustomerCredit item) throws Exception {
        // do something here
        return item;
    }

}
