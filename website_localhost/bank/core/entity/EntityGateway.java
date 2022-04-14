public interface EntityGateway  {
 
    public void save(T entity);
 
    public T getById(int id);
 
}