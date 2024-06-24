package pro.skype.shope.service;

import java.util.List;

public interface SnoppingCart {
    List<Integer> add(List<Integer> goods);

    List<Integer> get();
}
