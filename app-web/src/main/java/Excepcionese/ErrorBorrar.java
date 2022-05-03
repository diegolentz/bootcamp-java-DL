package Excepcionese;

public class ErrorBorrar extends Exception {
	public ErrorBorrar () {}
	public ErrorBorrar (String msjError) {
		super(msjError);
	}
}
