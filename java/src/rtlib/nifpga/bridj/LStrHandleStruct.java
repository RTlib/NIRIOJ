package rtlib.nifpga.bridj;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * <i>native declaration :
 * C:\Users\myerslab\workspace\Direttore\labview\lib\Direttore.h</i><br>
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a
 * href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Direttore")
public class LStrHandleStruct extends StructObject
{
	public LStrHandleStruct()
	{
		super();
	}

	// / number of bytes that follow
	@Field(0)
	public int cnt()
	{
		return this.io.getIntField(this, 0);
	}

	// / number of bytes that follow
	@Field(0)
	public LStrHandleStruct cnt(int cnt)
	{
		this.io.setIntField(this, 0, cnt);
		return this;
	}

	/**
	 * cnt bytes<br>
	 * C type : char[1]
	 */
	@Array(
	{ 1 })
	@Field(1)
	public Pointer<Byte> str()
	{
		return this.io.getPointerField(this, 1);
	}

	public LStrHandleStruct(Pointer pointer)
	{
		super(pointer);
	}
}
