package day12_demo01;

public class Main
{
	static int		hour			= 0;
	static Boolean	workFinished	= false;

	public static void writeProgram()
	{
		if (hour < 12)
		{
			System.out.println("��ǰʱ�䣺" + hour + "�� ���繤��������ٱ�");
		}
		else if (hour < 13)
		{
			System.out.println("��ǰʱ�䣺" + hour + "�� ���ˣ��緹������������");
		}
		else if (hour < 17)
		{
			System.out.println("��ǰʱ�䣺" + hour + "�� ����״̬����������Ŭ��");
		}
		else
		{
			if (workFinished)
			{
				System.out.println("��ǰʱ�䣺" + hour + "�� �°�ؼ���");
			}
			else
			{
				if (hour < 21)
				{
					System.out.println("��ǰʱ�䣺" + hour + "�� �Ӱడ��ƣ������");
				}
				else
				{
					System.out.println("��ǰʱ�䣺" + hour + "�� ����ס�ˣ�˯����");
				}
			}
		}
	}

	public static void main(String[] args)
	{
		hour =9;
		writeProgram();
		hour =10;
		writeProgram();
		hour =12;
		writeProgram();
		hour =13;
		writeProgram();
		hour =14;
		writeProgram();
		hour =17;
		
		workFinished=true;
		writeProgram();
		hour =19;
		writeProgram();
		hour =22;
		writeProgram();
	}
}

