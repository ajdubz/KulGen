package md5b080e29214788936adecfb0fd8f33ccb;


public abstract class BaseView_1
	extends md5b080e29214788936adecfb0fd8f33ccb.BaseView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("KulGen.Droid.Source.Views.BaseView`1, KulGen.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BaseView_1.class, __md_methods);
	}


	public BaseView_1 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BaseView_1.class)
			mono.android.TypeManager.Activate ("KulGen.Droid.Source.Views.BaseView`1, KulGen.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
