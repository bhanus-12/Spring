package com.bhanu.springcoreadvanced.springorm1.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bhanu.springcoreadvanced.springorm1.product.entities.Product;
@Component("dao")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;
	@Transactional
	public int create(Product product) {
		Integer result=(Integer)hibernateTemplate.save(product);
		return result;
	}
	@Override
	@Transactional
	public int update(Product product) {
		hibernateTemplate.update(product);
		//return result;
		return 1;
	}
	@Override
	@Transactional
	public int delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
		return 1;
	}
	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		Integer rec=new Integer(id);
		hibernateTemplate.get(Product.class, rec);
		return null;
	}
	@Override
	public List<Product> loadAll() {
		// TODO Auto-generated method stub
		
		List<Product> result= hibernateTemplate.loadAll(Product.class);
		return result;
	};

}
