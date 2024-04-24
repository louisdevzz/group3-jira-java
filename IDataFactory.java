package group1;

import java.util.List;

public interface IDataFactory<T> {
    public List<T> load(String choose);
    public void save(List<T> list_objs);
}
