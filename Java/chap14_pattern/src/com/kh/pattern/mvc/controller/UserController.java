package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserController {

	/*�𵨰� �並 �����ϴ� ��
	 * ����� �Է��� ó���ϴ� ��
	 * */
	private UserModel usermodel;
	private UserModel userview;
	
	public UserModel getModel() {
		return usermodel;
	}

	public void setModel(UserModel model) {
		this.usermodel = usermodel;
	}

	public UserModel getView() {
		return userview;
	}

	public void setView(UserModel view) {
		this.userview = view;
	}


	public void userController(UserModel usermodel, UserView userview) {
		this.usermodel = usermodel;
		this.userview = userview;
	}

}


