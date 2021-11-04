package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	/*
	 A classe vai export um método do tipo da interface, mas internamente vai instanciar uma implementaoção
	 */
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
