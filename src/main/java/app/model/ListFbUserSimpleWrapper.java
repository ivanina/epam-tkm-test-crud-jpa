package app.model;

import app.entity.FbUserSimple;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ListFbUserSimpleWrapper implements Serializable {
    public List<FbUserSimple> list;

    public ListFbUserSimpleWrapper(List<FbUserSimple> list) {
        this.list = list;
    }
}
