class InputException extends Exception
{
    public Input Exeption(String msg)
    {
        Super(msg);
    }
}
Public class Average Exception
{
    Public Static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int Sum = 0;
        System.out.print("Enter no. of integers:")
        int n=S.nextInt();
        System.out.println("Enter the integers");
        try
        {
            for(int i=0;i<n;i++)
            {
                int num = S.nextInt();
                if(num<0)
                {
                    throw new Input Exception("Number is not Positive!!!");
                }
                sum+ =num;
            }
            float avg=(float)sum/n;
            System.out.println("Average is:"+avg);
        }
        catch (Input Exception e)
        {
            System.out.println(e);
        }
    }
}