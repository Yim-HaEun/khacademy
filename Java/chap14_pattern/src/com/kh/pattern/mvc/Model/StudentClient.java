package com.kh.pattern.mvc.Model;

import com.kh.pattern.mvc.View.StudentView;
import com.kh.pattern.mvc.controller.StudentController;

public class StudentClient {

	/*
	 *MVC ������ ����ؼ� �л� ������ �ٷ�� ��
	 * */
	
	public static void main(String[] args) {
		//�� ��ü ���� Model
		StudentModel model = new StudentModel("���л�",17);
		//�� ��ü ���� View
		StudentView view = new StudentView();
		//��Ʈ�ѷ� ��ü ���� Controller(�� �� ����)
		StudentController controller = new StudentController(model, view);
		//�л� ������ ������Ʈ�ؼ� ���
		controller.updateView();
		//�л� ���� ������Ʈ�� ����
		controller.setStudentName("�� ������Ʈ");
		controller.setStudentAge(18);
		//������Ʈ �� �л� ������ ���
		controller.updateView();

	}

}
