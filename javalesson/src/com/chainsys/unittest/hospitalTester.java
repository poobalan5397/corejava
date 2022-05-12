package com.chainsys.unittest;
import com.chainsys.classandmethods.Hospital;
public class hospitalTester {
public static void testHospital()
{
	Hospital obj=new Hospital("chennai");
	//obj.setLocation("chennai");
	obj.setPatientAge(5);
	obj.setPatientName("nk");
	obj.setPatentDieases("fewer");
	obj.setHospitalName("MMM");
	System.out.println(obj.getLocation());
	System.out.println(obj.getPatientAge());
	System.out.println(obj.getPatientName());
	System.out.println(obj.getPatentDieases());
	System.out.println(obj.getHospitalName());
}
}
