package group1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface Data<T> {
    public List<T> load();
    public void save(List<T> list_objs);
}
