package com.explore.sb.condition;

public class EnableDevDataSource implements  DataSourceConfig{
    @Override
    public void makeconnection() {
        System.out.println("dev data source");
    }
}
