package com.kh.example.practice2.run;
//import�� ���� 1ȸ�� �� ���� �ۼ� 
import com.kh.example.practice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		// Product ���� 3�� �ϰ� ���� ��ǰ��,����,�귣��� ����ϱ� 
		Product product1 = new Product("Bape hoodie", 280000 ,"������");
		Product product2 = new Product("HYS T-shirt", 160000 ,"�����׸��۷���");
		Product product3 = new Product("Supreme ZipUp", 300000 ,"������");
		
		System.out.println("Product ���� : ");
		product1.information();
		product2.information();
		product3.information();
		
	}

}
