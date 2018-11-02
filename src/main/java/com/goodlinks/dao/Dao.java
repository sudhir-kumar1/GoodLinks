package com.goodlinks.dao;

import java.util.List;

public interface Dao<T> {
	List<T> getAll();

	T get(int id);

	void save(T t);

	void update(T t, String[] fields, String[] values);

	void delete(T t);
}
