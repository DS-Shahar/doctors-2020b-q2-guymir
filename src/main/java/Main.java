package test;
import java.util.*;

public class DoctorMain
{
	
public static void doctorRating(Doctor [] doctor )
{
	Scanner input = new Scanner(System.in);
	int rate = 0;
	double sum = 0;
	int count = 0;
	for(int i = 0; i<doctor.length;i++)
	{
		while (rate!=-1)
		{
			 rate =input.nextInt();
			sum+=rate;
			count++;
		}
		doctor[i].setRate(sum/count);
	}
}











}
