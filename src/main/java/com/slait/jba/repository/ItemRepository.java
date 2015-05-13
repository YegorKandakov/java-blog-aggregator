package com.slait.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slait.jba.entity.Item;
import com.slait.jba.entity.Role;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
