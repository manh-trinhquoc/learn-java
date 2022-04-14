package com.example.architecture.hexagonal;

public class DataBaseChannelAdapter implements IPersists<EmployeeDomainObject,EmployeeCommand>{
   public void save(EmployeeDomainObject t, EmployeeCommand commandObject) { 
       String underLyingJPAEntity = commandObject.getEntityClass();
       System.out.println("call save on " + underLyingJPAEntity);   
   }
   public void delete(EmployeeDomainObject t, EmployeeCommand commandObject) {
       String underLyingJPAEntity = commandObject.getEntityClass();
       System.out.println("call delete on " + underLyingJPAEntity);   
   }
}