package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/InvalidName.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de 2005
 * 18h26min26s BRST
 */

@SuppressWarnings("serial")
public final class InvalidName extends org.omg.CORBA.UserException {
	public String name = null;

	public InvalidName() {
		super(InvalidNameHelper.id());
	} // ctor

	public InvalidName(String _name) {
		super(InvalidNameHelper.id());
		name = _name;
	} // ctor

	public InvalidName(String $reason, String _name) {
		super(InvalidNameHelper.id() + "  " + $reason);
		name = _name;
	} // ctor

} // class InvalidName