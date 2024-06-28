package com.explore.sb.condition;

public class EnableProdDataSource implements  DataSourceConfig{
    @Override
    public void makeconnection() {
        System.out.println("prod data source");
    }
}
