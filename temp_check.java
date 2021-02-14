//first_try
import java.io.*;
class temp_check
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); static int A[]=new int[60];
        public static int runscan()// runsthe scan and return the resulting temperature of one person
            {
                return 1; //taking one as the temperature to check the program sequence
            }
        public static int addavg()
            {
                int total =0;
                
                for(int i=0;i<60;i++)
                    {
                        total = total + A[i];
                    }
                int avg = (total/60);
                if(avg >= 45)
                    {
                        return 1;
                    }
                else
                    {
                        return 0;
                    }
            }
        public static void main()throws IOException
            {
                temp_check X = new temp_check();
                for(int i =0;i<60;i++)
                    {
                        A[i]= X.runscan();
                    }
                int result = X.addavg();
                if(result==0)
                    {
                        System.out.println("It is okay and will be connected to LED Green set to blinking");
                    }
                else
                    {
                        System.out.println("It is dangerous and will be connected to LED RED set to blinking, and will vibrate.");
                    }
                }
            }
                