import java.util.Scanner;
abstract class Converter{
	protected double ratio;
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	
	public void run()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(srcString()+"를"+destString()+" 으로 바꿉니다.");
		System.out.println(srcString()+"를 입력하세요>> ");
		double val=scanner.nextDouble();
		double res=convert(val);
		System.out.println("변환 결과: "+res+destString());
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
		return "달러";
	}
	protected String destString()
	{
		return "원";
	}
	public static void main(String arg[])
	{
		Dollar2Won toWon=new Dollar2Won(1200);
		toWon.run();
	}

}
