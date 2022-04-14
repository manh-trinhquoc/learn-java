package com.example.architecture.hexagonal;

public interface IPersists<T,TCOMMAND> {
    public void save(T t,TCOMMAND commandObject);
    public void delete(T t,TCOMMAND commandObject);
}