//To find sum and difference of two complex numbers
//java.lang required**

package scientificCalculator;
 
class ComplexAddSub
{
	float real, img;
 
	ComplexAddSub() {}   
 
	ComplexAddSub(float r, float i)
	{
			real = r;
			img = i;
	}
 
	void display()  //function for displaying *not mandatory*
	{
		System.out.println(real+" + i "+img);
	}
 
	 static ComplexAddSub add(ComplexAddSub c1, ComplexAddSub c2)   // function to add
	{
		ComplexAddSub res = new ComplexAddSub();
 
		res.real = c1.real + c2.real;
		res.img = c1.img + c2.img;
 
		return(res);
	}
 
	 static ComplexAddSub sub(ComplexAddSub c1, ComplexAddSub c2)   //function to sub
	{
		ComplexAddSub res = new ComplexAddSub();
 
		res.real = c1.real - c2.real;
		res.img = c1.img - c2.img;
 
		return(res);
	}
 
}