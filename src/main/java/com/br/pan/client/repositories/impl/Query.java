package com.br.pan.client.repositories.impl;

public class Query {

    public static class Customer {

        private static final String CUSTOMER_TABLE = "tb_customer";

        public static final String FIND_CUSTOMER = "SELECT cus.cpf FROM " + CUSTOMER_TABLE + "cus" +  "WHERE cus.cpf = :cpf";

    }
}
