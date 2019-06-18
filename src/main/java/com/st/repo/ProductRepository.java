package com.st.repo;



import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.st.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("select p from com.st.entity.Product p")
	public List<Product> getInfo();
	@Query("select p.prodCost from com.st.entity.Product p")
	public List<Double> getCostOnly();
	@Query("select p.prodId,p.prodName from com.st.entity.Product p")
	public List<Object[]> getData();
	@Query("select p from com.st.entity.Product p  where p.prodId=?1 or p.prodCost<?2")
	public List<Product> getNewData(Integer pid,Double pcost);
	@Query("select p from com.st.entity.Product p where p.prodName=:name or p.prodModel=:model")
	public List<Product> getNamedData(String name,String model);
	@Query("select p from Product p")
	public List<Product> withoutPack();
	//@Query("update Product p set p.prodCost=?1 where p.prodId=?2")
	@Transactional @Modifying
	@Query("update Product p set p.prodCost=:cost where p.prodId=:id")
	public int getUpdate(double cost, int id);
	
	@Transactional @Modifying
	@Query("delete  from Product p where p.prodId=:id")
	public int remove(int id);
	//bad approach this one
	@Query("select p from  Product p where p.prodId=:pid")
	Product getOneRecds(int pid);
	
	@Query("select p from  Product p where p.prodId=:pid")
	Optional<Product> getOneRecds1(int pid);
}


