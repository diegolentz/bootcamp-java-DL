package clase11;

public final class FSLog extends Log implements IEjecutable {

	public FSLog() {
		super();
		Log.cont++;
	}
	
	public FSLog(String msj) {
		super(msj);
		Log.cont++;
	}

	@Override
	public void loguear() {
System.out.println(" FSLog: esctribiendo en c:/" + super.getMsj());
	}

	public void ejecutar() {
 
		System.out.println("FSLOG ejecutando el metodo ejecutar definido en IEjecutable");
	}

}