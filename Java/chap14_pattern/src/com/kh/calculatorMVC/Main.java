package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		// model view controller
		
		//model = CalculatorModel ��������
		CalculatorModel model = new CalculatorModel();
		
		//view = CalculatorView ��������
		CalculatorView view = new CalculatorView();
		
		//Controller CalculatorController ��������
		CalculatorController controller = new CalculatorController(model, view);
		
		controller.run();

	}

}
