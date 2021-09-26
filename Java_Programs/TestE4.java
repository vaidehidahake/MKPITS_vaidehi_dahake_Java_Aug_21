class Calculate7{
    //private data member
    private float roi;
    //getter method for name
    /*
    public String getName()
    {
    return name;
    }
    */
    //setter method for name

    public void setRoi(float roi)
    {
    this.roi=roi;
    }
    public float calinterest(float pa,int nom)
    {
		float pi=pa * roi * nom;
		return pi;
	}

    }

class TestE4
{
	public static void main(String[] arg) {
		Calculate7 t=new Calculate7();
		t.setRoi(20);
		//System.out.println("roi = " + t.getRoi() );
		float ta=t.calinterest(1000,12);
		System.out.println("total amount with interest " + ta);

	}

}
