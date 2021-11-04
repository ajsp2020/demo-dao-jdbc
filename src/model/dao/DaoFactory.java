package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	/*
	 A classe vai export um m�todo do tipo da interface, mas internamente vai instanciar uma implementao��o
	 */
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
