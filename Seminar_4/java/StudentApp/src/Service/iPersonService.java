package Service;

import java.util.List;

/**
 * Интерфейс для получения списков и создания нужных видов
 */
public interface iPersonService<T> {
    public List<T> getAll();

    void create(String name, int age);

}
