package clase11;

public class DefaultLog extends Log {

	public DefaultLog() {
		super();
		Log.cont++;
	}
	
	public DefaultLog(String msj) {
		super(msj);
		Log.cont++;
	}

	public void loguear() {
		System.out.println("escribiendo en c:/" + this.getMsj());
	}

}