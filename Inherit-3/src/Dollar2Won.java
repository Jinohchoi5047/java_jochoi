import java.util.Scanner;
abstract class Converter{
	protected double ratio;
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	
	public void run()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(srcString()+"��"+destString()+" ���� �ٲߴϴ�.");
		System.out.println(srcString()+"�� �Է��ϼ���>> ");
		double val=scanner.nextDouble();
		double res=convert(val);
		System.out.println("��ȯ ���: "+res+destString());
		scanner.close();		
	}	
}
class Dollar2Won extends Converter {
	public Dollar2Won(double ratio)
	{
		this.ratio=ratio;
	}
	protected double convert(double src)
	{
		return src*ratio;
	}
	protected String srcString()
	{
		return "�޷�";
	}
	protected String destString()
	{
		return "��";
	}
	public static void main(String arg[])
	{
		Dollar2Won toWon=new Dollar2Won(1200);
		toWon.run();
	}

}
