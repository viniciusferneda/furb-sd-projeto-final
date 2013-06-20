package corba.Corba;


/**
* Corba/CorbaFunctionsHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Corba.idl
* Quarta-feira, 19 de Junho de 2013 21h56min39s BRT
*/

abstract public class CorbaFunctionsHelper
{
  private static String  _id = "IDL:Corba/CorbaFunctions:1.0";

  public static void insert (org.omg.CORBA.Any a, CorbaFunctions that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CorbaFunctions extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CorbaFunctionsHelper.id (), "CorbaFunctions");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CorbaFunctions read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CorbaFunctionsStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CorbaFunctions value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CorbaFunctions narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CorbaFunctions)
      return (CorbaFunctions)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _CorbaFunctionsStub stub = new _CorbaFunctionsStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CorbaFunctions unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CorbaFunctions)
      return (CorbaFunctions)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _CorbaFunctionsStub stub = new _CorbaFunctionsStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
