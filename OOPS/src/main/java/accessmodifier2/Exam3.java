package accessmodifier2;

import accessmodifier1.Exam;

public class Exam3 extends Exam
{
	public static void main(String[] args) {
		Exam3 e=new Exam3();
		System.out.println(e.subject);
		e.test();
	}

}
