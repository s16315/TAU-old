package main.java.pl.tmnich.gamescatalog.service;

public interface IService<T> {
    public int create(T entity);
    public void readAll();
    public void read(int id);
    public void update(T entity);
    public void delete(T entity);
}
