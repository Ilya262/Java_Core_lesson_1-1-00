package Lesson7;

public class PlaneDrive {

	void up() {
		System.out.println("��� ����� � �������� = "+(int) (1 + ((Math.random()) * 260))+" ��/���");
	}

	void down() {
		System.out.println("��� ���� � �������� = "+(int) (1 + ((Math.random()) * 260))+" ��/���");

	}

	void left() {
		System.out.println("��� ������ � �������� = "+(int) (1 + ((Math.random()) * 260))+" ��/���");

	}

	void right() {
		System.out.println("��� �������� � �������� = "+(int) (1 + ((Math.random()) * 260))+" ��/���");

	}
}
